/**
 * 
 */
package ie.aib.research.hellogrizzly;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.glassfish.grizzly.filterchain.BaseFilter;
import org.glassfish.grizzly.filterchain.FilterChainContext;
import org.glassfish.grizzly.filterchain.NextAction;

/**
 * @author 68893
 *
 */
public class ClientFilter extends BaseFilter
{
    /**
     * Handle just read operation, when some message has come and ready to be processed.
     *
     * @param ctx
     *            Context of {@link FilterChainContext} processing
     * @return the next action
     * @throws java.io.IOException
     */
    @Override
    public NextAction handleRead( FilterChainContext ctx ) throws IOException
    {
        String response = ctx.getMessage();
        
        // do something with it?
        
        //Console con = System.console();
        
        //con.printf( "Server response: 1$", response );
        
        try (BufferedWriter w = new BufferedWriter( new OutputStreamWriter( System.out ) ))
        {
            w.write( this.getClass().getName() );
            w.write( ":[" );
            w.write( response );
            w.write( "]\n" );
            w.flush();
        }
        
        return ctx.getStopAction();
    }

}
