package com.pavan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class LoggingToTheConsole {
	
	private static Logger logger = Logger.getLogger(LoggingToTheConsole.class);
	
	static
	{
		SimpleLayout sLayout = new SimpleLayout();
		ConsoleAppender consoleAppender = new ConsoleAppender(sLayout);
		logger.addAppender(consoleAppender);
		logger.setLevel(Level.ALL);
	}
	
	
	public static void main(String[] args) {
			logger.debug("control Entering into main() Method");
			
			Connection connection = null;
			Statement statement = null;
			ResultSet resultSet = null;
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				logger.debug("Jdbc Driver Loaded successfully....");
				
				
				String url = "jdbc:mysql:///jdbc";
				String uName = "root";
				String uPassword = "Pav@0211";
				connection = DriverManager.getConnection(url, uName, uPassword);
				logger.info("Connection Established Succuess Fully");
				
				statement = connection.createStatement();
				logger.debug("Statement Object Got Created...");
				
				String query = "select sid, sname, sage, saddress from student";
				resultSet = statement.executeQuery(query);
				logger.info("Query Got Executed and result set object assigned with data");
				
				while (resultSet.next()) {
					System.out.println(resultSet.getInt("sid") + "\t" + resultSet.getString("sname") + "\t"
							+ resultSet.getInt("sage") + "\t" + resultSet.getString("saddress"));
				}
				
				
				
			} catch (ClassNotFoundException ce) {
				ce.printStackTrace();
				logger.error("ClassNotFound Exception Occured");
			}
			catch(SQLException se)
			{
				se.printStackTrace();
				logger.error("Sql Exception Occured " + se.getMessage() + " =====> " + se.getErrorCode() );
			}
			catch(Exception e)
			{
				e.printStackTrace();
				logger.error("Unknow error Occured ");
			}
			finally
			{
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
					
			logger.debug("control Exiting from main() Method");		
	}	
}
