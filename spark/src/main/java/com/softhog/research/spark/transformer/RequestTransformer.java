/**
 * 
 */
package com.softhog.research.spark.transformer;


/**
 * @author 
 *
 */
abstract public class RequestTransformer
{
    /**
     * 
     * @param data
     * @param t
     * @return
     * @throws Exception
     * @see spark.ResponseTransformer#render(java.lang.Object)
     */
    abstract public <T> T render( String data, Class<T> t );
}
