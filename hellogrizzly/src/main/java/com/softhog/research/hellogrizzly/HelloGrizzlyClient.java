/**
 * 
 */
package com.softhog.research.hellogrizzly;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.glassfish.grizzly.Connection;
import org.glassfish.grizzly.filterchain.FilterChainBuilder;
import org.glassfish.grizzly.filterchain.TransportFilter;
import org.glassfish.grizzly.nio.transport.TCPNIOTransport;
import org.glassfish.grizzly.nio.transport.TCPNIOTransportBuilder;
import org.glassfish.grizzly.utils.StringFilter;

/**
 * @author 68893
 *
 */
public class HelloGrizzlyClient
{
    /**
     * Build up the filter chain
     * 
     * @param args
     */
    @SuppressWarnings ( "unchecked")
    public static void main( String[] args ) throws IOException, TimeoutException, ExecutionException,
                    InterruptedException
    {
        Connection<String> conn = null;

        FilterChainBuilder filterChainBuilder = FilterChainBuilder.stateless();

        filterChainBuilder.add( new TransportFilter() );

        filterChainBuilder.add( new StringFilter( Charset.forName( "UTF-8" ) ) );

        filterChainBuilder.add( new ClientFilter() );

        TCPNIOTransport tcpnio = TCPNIOTransportBuilder.newInstance().build();

        tcpnio.setProcessor( filterChainBuilder.build() );

        try
        {
            tcpnio.start();

            @SuppressWarnings ( "rawtypes")
            Future<Connection> future = tcpnio.connect( HelloGrizzlyServer.HOST, HelloGrizzlyServer.PORT );

            conn = future.get( 10, TimeUnit.SECONDS );

            assert conn != null;

            //conn.write( "Hello" );

            String line = null;

            // Console con = System.console();
            try (BufferedReader r = new BufferedReader( new InputStreamReader( System.in ) ))
            {
                do
                {
                    // line = con.readLine();
                    line = r.readLine();
                    
                    conn.write( line );
                }
                while( line != null && !line.equals( "q" ) );
            }
        }
        finally
        {
            if( conn != null )
            {
                conn.close();
            }

            tcpnio.shutdownNow();
        }

    }

}
