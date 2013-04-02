package com.gooddata.jdbc.project;

import java.sql.Connection;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;

/**
 * GoodData client implemented as a JDBC driver
 *
 * @author Pavel Kolesnikov
 */
public class Driver implements java.sql.Driver 
{
	public final static String URL_PREFIX = "jdbc:gooddata:project:";
	public final static String PROP_USERNAME = "user";
	public final static String PROP_PASSWORD = "password";

	static {
		try {
			java.sql.DriverManager.registerDriver(new Driver());
			System.out.println("registered as " + Driver.class.getCanonicalName() );
		} catch (SQLException e) {
			throw new RuntimeException(
				"Could not initialise GoodData Project driver: " + e.getMessage());
		}
	}
	  
	public boolean acceptsURL(String url) throws SQLException {
	    return url.startsWith(URL_PREFIX);
	}

	public Connection connect(String url, Properties props) throws SQLException {
		final String username = props.getProperty(PROP_USERNAME);
		final String password = props.getProperty(PROP_PASSWORD);
		return new ProjectConnection(url, username, password);
	}

	public int getMajorVersion() {
		return 0;
	}

	public int getMinorVersion() {
		return 1;
	}

	public DriverPropertyInfo[] getPropertyInfo(String arg0, Properties arg1)
			throws SQLException {
		return new DriverPropertyInfo[0];
	}

	public boolean jdbcCompliant() {
		return false;
	}
    
}
