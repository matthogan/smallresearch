/**
 * 
 */
package com.softhog.research.hellogrizzly;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.glassfish.grizzly.filterchain.BaseFilter;
import org.glassfish.grizzly.filterchain.FilterChainContext;
import org.glassfish.grizzly.filterchain.NextAction;

/**
 * Replies with hello...
 * Seems to be a filter chain pattern
 * 
 * @author 68893
 *
 */
public class HelloFilter extends BaseFilter
{
    /**
     * @see org.glassfish.grizzly.filterchain.BaseFilter#handleRead(org.glassfish.grizzly.filterchain.FilterChainContext)
     */
    @Override
    public NextAction handleRead( FilterChainContext ctx ) throws IOException
    {
        Object peerAddress = ctx.getAddress();
        
        String message = ctx.getMessage();
        
        try (BufferedWriter w = new BufferedWriter( new OutputStreamWriter( System.out ) ))
        {
            w.write( this.getClass().getName() );
            w.write( ":[" );
            w.write( message );
            w.write( "]\n" );
            w.flush();
        }        
        
        ctx.write( peerAddress, "hello", null );
        
        // stop the filter chain
        return ctx.getStopAction();
    }
}
