/**
 * 
 */
package com.softhog.research.spark.service;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Default;

/**
 * @author 
 *
 */
@Default
// Shared state across all users' interactions with a web application.
@ApplicationScoped
public class Processor
{    
    /**
     * @param s
     * @param input
     * @return
     */
    public Object process( Service s, Object input )
    {
        return s.process( input );
    }
}
