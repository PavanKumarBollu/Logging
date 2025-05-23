package com.pavan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {

    	
		logger.debug("Control entering main()");
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			logger.trace("Driver Loaded succesfully");

			String url = "jdbc:mysql:///jdbc";
			String user = "root";
			String password = "Pav@0211";
			connection = DriverManager.getConnection(url, user, password);
			logger.info("Connection established succesfully");

			statement = connection.createStatement();
			logger.debug("Statement object created");

			String sqlSelectQuery = "select sid,sname,sage,saddress from student";
			resultSet = statement.executeQuery(sqlSelectQuery);
			logger.info("ResultSet object created by executing query");

			while (resultSet.next()) {
				System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t"
						+ resultSet.getInt("sage") + "\t" + resultSet.getString("saddress"));
			}
		} catch (ClassNotFoundException c) {
			c.printStackTrace();
			logger.error("ClassNotfoundExcpetion occured");
		} catch (SQLException se) {
			se.printStackTrace();
			logger.error("SQLException occured =>" + se.getMessage() + "===>" + se.getErrorCode());
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("Unkonw exception occured");
		} finally {
			try {
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
				logger.error("SQLException occured =>" + se.getMessage() + "===>" + se.getErrorCode());
			}
			try {
				if (statement != null) {
					statement.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
				logger.error("SQLException occured =>" + se.getMessage() + "===>" + se.getErrorCode());
			}
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
				logger.error("SQLException occured =>" + se.getMessage() + "===>" + se.getErrorCode());
			}
		}
		logger.trace("Control exiting main()");
    	
    	
    }
}
