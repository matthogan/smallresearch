/**
 * 
 */
package com.softhog.research.spark.controller;

import static spark.Spark.after;
import static spark.Spark.get;
import static spark.Spark.post;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softhog.research.spark.KVException;
import com.softhog.research.spark.TextMessage;
import com.softhog.research.spark.entity.naps.ApplApplication;
import com.softhog.research.spark.service.Processor;
import com.softhog.research.spark.service.Service;
import com.softhog.research.spark.service.naps.NapsReadApplicationService;
import com.softhog.research.spark.service.naps.NapsWriteApplicationService;
import com.softhog.research.spark.transformer.JsonTransformer;
import com.softhog.research.spark.transformer.RequestTransformer;
import com.softhog.research.spark.transformer.RequestTransformerFactory;

import spark.servlet.SparkApplication;

/**
 * Naps Crud Endpoints
 * 
 * @author 
 *
 */
@Default
@ApplicationScoped
public class NapsCrudSparkApplication implements SparkApplication
{
    /** Why bother with final static in a singleton? */
    private Logger logger = LoggerFactory.getLogger( NapsCrudSparkApplication.class );

    /**
     * Invokes the functionality of services.
     */
    @Inject
    private Processor processor;
    
    /**
     * Seems like a particularly bad place to define this
     */
    @Inject
    private NapsReadApplicationService napsReadApplicationService;
    
    /**
     * Defining a new service per CRUD method is hardly efficient 
     */
    @Inject
    private NapsWriteApplicationService napsWriteApplicationService;

    /**
     * 
     */
    public NapsCrudSparkApplication()
    {
    }

    /**
     * @see spark.servlet.SparkApplication#init()
     */
    @Override
    public void init()
    {
        logger.warn( "Initialising endpoints" );

        try
        {
            initialiseEndpoints();
        }
        catch( KVException ex )
        {
            logger.error( "Failed to load endpoints. " + ex.getMessage(), ex );
        }
        catch( Exception ex )
        {
            logger.error( "Failed to load endpoints. " + ex.getMessage(), ex );
        }

        logger.warn( "Finished initialising endpoints" );
    }

    /**
     * Loads up the end points
     */
    private void initialiseEndpoints()
    {
        get( "/naps/crud/hello", ( request, response ) -> {

            Service hello = ( Object input ) -> {
                return new TextMessage( "hello" );
            };

            return processor.process( hello, request );

        }, new JsonTransformer() );

        get( "/naps/crud/application/:applicationNumber", ( request, response ) -> {

            RequestTransformer tf = RequestTransformerFactory.getRequestTransformer( request );

            String applicationNumber = tf.render( request.params( "applicationNumber" ), String.class );

            return processor.process( napsReadApplicationService, applicationNumber );

        }, new JsonTransformer() );

        post( "/naps/crud/application/create", ( request, response ) -> {

            RequestTransformer tf = RequestTransformerFactory.getRequestTransformer( request );

            ApplApplication appl = tf.render( request.body(), ApplApplication.class );

            return processor.process( napsWriteApplicationService, appl );

        }, new JsonTransformer() );

        // processed after each request
        // prefer to set the type in the get...
        after( "/naps/crud/*", ( request, response ) -> {

            response.header( "X-application", "NAPS" );

            response.type( request.headers( "Accept" ) );
        } );
    }
}
