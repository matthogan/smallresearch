/**
 * 
 */
package com.softhog.research.spark.controller;

import static spark.Spark.after;
import static spark.Spark.get;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.softhog.research.spark.KVException;
import com.softhog.research.spark.TextMessage;
import com.softhog.research.spark.service.Processor;
import com.softhog.research.spark.service.Service;
import com.softhog.research.spark.transformer.JsonTransformer;

import spark.servlet.SparkApplication;

/**
 * Cif Crud Endpoints
 * 
 * @author 
 *
 */
@Default
@ApplicationScoped
public class CifCrudSparkApplication implements SparkApplication
{
    /** Why bother with final static in a singleton? */
    private Logger logger = LoggerFactory.getLogger( CifCrudSparkApplication.class );

    /**
     * Invokes the functionality of services.
     */
    @Inject
    private Processor processor;
    
    /**
     * 
     */
    public CifCrudSparkApplication()
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
        get( "/cif/crud/hello", ( request, response ) -> {

            Service hello = ( Object input ) -> {
                return new TextMessage( "hello" );
            };

            return processor.process( hello, request );

        }, new JsonTransformer() );

        get( "/cif/crud/cust/:custKey", ( request, response ) -> {

            Service readApplByPk = ( Object input ) -> {
                return new TextMessage( request.params( "custKey" ) );
            };

            return processor.process( readApplByPk, request );

        }, new JsonTransformer() );

        // processed after each request
        // prefer to set the type in the get...
        after( "/cif/crud/*", ( request, response ) -> {

            response.header( "X-application", "CIF" );

            response.type( request.headers( "Accept" ) );
        } );
    }
}
