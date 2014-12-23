/**
 * 
 */
package com.softhog.research.spark.filter;

import javax.inject.Inject;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.softhog.research.spark.controller.NapsCrudSparkApplication;

import spark.servlet.SparkApplication;
import spark.servlet.SparkFilter;

/**
 * Specifically for NAPS.
 * <p>
 * urlPatterns - allows filtering by path pattern as per web.xml
 * <p> 
 * Added this to make spark compatible with jee 7 and 
 * retain the filter mechanism. I want the {@link #napsCrudSparkApplication}
 * bean to contain beans for processing services, etc, all the usual
 * DI stuff.
 * 
 * @author 
 *
 */
@WebFilter ( filterName = "NapsSparkFilter", urlPatterns = { "/naps/crud/*" }, 
    initParams = { @WebInitParam ( name = "applicationClass", 
        value = "com.softhog.research.spark.NapsCrudSparkApplication") })
public class NapsSparkFilter extends SparkFilter
{
    /**
     * Bean the provides the interface to naps code
     */
    @Inject
    private NapsCrudSparkApplication napsCrudSparkApplication;
    
    /**
     * 
     */
    public NapsSparkFilter()
    {
    }

    /**
     * Returns an instance of {@link SparkApplication} which on which {@link SparkApplication#init() init()} will be called.
     * Default implementation looks up the class name in the filterConfig using the key {@link #APPLICATION_CLASS_PARAM}.
     * Subclasses can override this method to use different techniques to obtain an instance (i.e. dependency injection).
     *
     * @param filterConfig the filter configuration for retrieving parameters passed to this filter.
     * @return the spark application containing the configuration.
     * @throws ServletException if anything went wrong.
     */
    protected SparkApplication getApplication(FilterConfig filterConfig) throws ServletException {
        try {
            return napsCrudSparkApplication;
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }
}
