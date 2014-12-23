/**
 * 
 */
package com.softhog.research.hellogrizzly;

import java.io.IOException;
import java.nio.charset.Charset;

import org.glassfish.grizzly.filterchain.FilterChainBuilder;
import org.glassfish.grizzly.filterchain.TransportFilter;
import org.glassfish.grizzly.nio.transport.TCPNIOTransport;
import org.glassfish.grizzly.nio.transport.TCPNIOTransportBuilder;
import org.glassfish.grizzly.utils.StringFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class initializes and starts the echo server, based on Grizzly 2.3
 * 
 * @author 68893
 *
 */
public class HelloGrizzlyServer
{
    private static Logger logger = LoggerFactory.getLogger( HelloGrizzlyServer.class );

    public static final String HOST = "localhost";

    public static final int PORT = 7777;

    public static void main( String[] args ) throws IOException
    {
        // Create a FilterChain using FilterChainBuilder
        FilterChainBuilder filterChainBuilder = FilterChainBuilder.stateless();

        // Add TransportFilter, which is responsible
        // for reading and writing data to the connection
        filterChainBuilder.add( new TransportFilter() );

        // StringFilter is responsible for Buffer <-> String conversion
        filterChainBuilder.add( new StringFilter( Charset.forName( "UTF-8" ) ) );

        // EchoFilter is responsible for echoing received messages
        filterChainBuilder.add( new HelloFilter() );

        // Create TCP transport
        final TCPNIOTransport transport = TCPNIOTransportBuilder.newInstance().build();

        transport.setProcessor( filterChainBuilder.build() );
        try
        {
            // binding transport to start listen on certain host and port
            transport.bind( HOST, PORT );

            // start the transport
            transport.start();

            logger.info( "Press any key to stop the server..." );
            
            System.in.read();
        }
        finally
        {
            logger.info( "Stopping transport..." );
            // stop the transport
            transport.shutdownNow();

            logger.info( "Stopped transport..." );
        }
    }
}
