/**
 * 
 */
package com.softhog.research.spark.transformer;

import com.google.gson.Gson;

/**
 * @author 
 *
 */
public class JsonRequestTransformer extends RequestTransformer
{
    /** */
    private Gson gson = new Gson();
    
    /**
     * 
     * @param data
     * @param t
     * @return
     * @throws Exception
     * @see spark.ResponseTransformer#render(java.lang.Object)
     */
    public <T> T render( String data, Class<T> t )
    {
        return gson.fromJson( data, t );
    }
}
