package com.gooddata.jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class DriverTest extends TestCase
{
    public static final String GOODSALES_DEMO = "la84vcyhrq8jwbu4wpipw66q2sqeb923";
    
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public DriverTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( DriverTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDriver() throws Exception
    {
    	String jdbcURL = "jdbc:gooddata:project:///" + GOODSALES_DEMO ;
    	Connection conn = null;
    	Statement stmt = null;
    	ResultSet rs = null;
    	String user = System.getenv("GDC_USERNAME");
    	String passwd = System.getenv("GDC_PASSWORD");

    	Class.forName("com.gooddata.jdbc.project.Driver").newInstance();
    	conn = DriverManager.getConnection(jdbcURL, user, passwd);
    	stmt = conn.createStatement();
    	rs = stmt.executeQuery("/gdc/md/la84vcyhrq8jwbu4wpipw66q2sqeb923/obj/4970");
 		assertTrue( true );
    }
}
