# Spark 

Simple Spark 2.0 based API on a Wildfly/Jee7 platform reading and writing a DB2 table via Hibernate/JPA.

Spark is a light web application framework for Java

[http://www.sparkjava.com]

## DB2 Configuration

The jars must be manually installed into the repository via maven.

## Wildfly configuration

Define the data sources in the standalone.xml file accessible 
under the WildFly->Filesets node in the Servers view.

	<datasources>
	    <datasource jta="true" jndi-name="java:jboss/datasources/db2t" pool-name="db2t" enabled="true" use-ccm="false">
	        <connection-url>jdbc:db2://....../DB2T</connection-url>
	        <driver>db2</driver>
	        <security>
	            <user-name>......</user-name>
	            <password>.......</password>
	        </security>
	        <validation>
	            <validate-on-match>false</validate-on-match>
	            <background-validation>false</background-validation>
	        </validation>
	        <timeout>
	            <idle-timeout-minutes>5</idle-timeout-minutes>
	        </timeout>
	        <statement>
	            <share-prepared-statements>false</share-prepared-statements>
	        </statement>
	    </datasource>
	    <datasource jndi-name="java:jboss/datasources/ExampleDS" pool-name="ExampleDS" enabled="true" use-java-context="true">
	        <connection-url>jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE</connection-url>
	        <driver>h2</driver>
	        <security>
	            <user-name>sa</user-name>
	            <password>sa</password>
	        </security>
	    </datasource>
	    <drivers>
	        <driver name="h2" module="com.h2database.h2">
	            <xa-datasource-class>org.h2.jdbcx.JdbcDataSource</xa-datasource-class>
	        </driver>
	        <driver name="db2" module="ibm.db2">
	            <driver-class>com.ibm.db2.jcc.DB2Driver</driver-class>
	            <datasource-class>com.ibm.db2.jcc.DB2DataSource</datasource-class>
	        </driver>
	    </drivers>
	</datasources>