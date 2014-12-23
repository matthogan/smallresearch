/**
 * 
 */
package com.softhog.research.spark.transformer;

import com.google.gson.Gson;

import spark.ResponseTransformer;

/**
 * @see http://www.sparkjava.com/documentation.html
 * @author 
 *
 */
public class JsonTransformer implements ResponseTransformer
{
    /** */
    private Gson gson = new Gson();
    
    /**
     * @see spark.ResponseTransformer#render(java.lang.Object)
     */
    @Override
    public String render( Object model ) throws Exception
    {
        return gson.toJson( model );
    }
}
