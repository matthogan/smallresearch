/**
 * 
 */
package com.softhog.research.spark.transformer;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.softhog.research.spark.KVException;

import spark.Request;

/**
 * @author 
 *
 */
public class RequestTransformerFactory
{
    /**
     * content-type -> RequestTransformer classes
     */
    private static final Map<String, Class<? extends RequestTransformer>> tfs = new HashMap<>();

    /** There are better ways of doing this perhaps - xml configs... */
    static
    {
        try
        {
            tfs.put( "application/json", JsonRequestTransformer.class );
        }
        catch( Exception ex )
        {
            throw new KVException( "RT_CT_STATIC_INIT", ex, ex.getMessage() );
        }
    }

    /**
     * Loads up a RequestTransformer based on the Request
     * 
     * @param request
     * @return a RequestTransformer instance
     */
    public static RequestTransformer getRequestTransformer( Request request )
    {
        String contentType = request.contentType();

        if( StringUtils.isBlank( contentType ) )
        {
            throw new KVException( "RT_CT_EMPTY", contentType );
        }

        try
        {
            Class<? extends RequestTransformer> c = tfs.get( contentType );

            return c.newInstance();
        }
        catch( InstantiationException | IllegalAccessException e )
        {
            throw new KVException( "RT_CT_NEW", e, e.getMessage() );
        }
    }
}
