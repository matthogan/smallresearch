/**
 * 
 */
package com.softhog.research.spark;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author 
 *
 */
public class Header implements Iterable<Map.Entry<String, String>>
{
    /** */
    private String contentType;
    
    /** */
    private Map<String,String> params = new HashMap<>();
    
    /**
     * 
     */
    public Header()
    {
    }

    /**
     * @return
     */
    public String getContentType()
    {
        return contentType;
    }

    /**
     * @param contentType
     */
    public void setContentType( String contentType )
    {
        this.contentType = contentType;
    }
    
    /**
     * @param key
     * @param value
     */
    public void setParam( String key, String value )
    {
        params.put( key, value );
    }

    /**
     * @return
     */
    public Map<String, String> getValues()
    {
        return params;
    }
    
    /**
     * @param values
     */
    public void setValues( Map<String, String> values )
    {
        this.params = values;
    }

    /**
     * @see java.lang.Iterable#iterator()
     */
    @Override
    public Iterator<Entry<String, String>> iterator()
    {
        return params.entrySet().iterator();
    }

}
