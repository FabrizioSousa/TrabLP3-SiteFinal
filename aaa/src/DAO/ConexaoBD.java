package DAO;

import java.sql.Connection;

import java.sql.DriverManager;







public class ConexaoBD {
	  private static Connection connection = null;

	    public static Connection getConnection() throws Exception {
	       
	    	if (connection != null)
	            return connection;
	        else {
	        	//String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	        	//Driver d = new com.microsoft.sqlserver.jdbc.SQLServerDriver();
	        	
	             // String url = "jdbc:sqlserver://DESKTOP-SR8G8GB\\SQLEXPRESS;databaseName=AULADB;integratedSecurity=true";
	                
	              String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	                String url = "jdbc:sqlserver://DESKTOP-SR8G8GB\\SQLEXPRESS;databaseName=AULADB";
	                String user = "sa";
	                String password = "palmeiras";
	                Class.forName(driver);
	                connection = DriverManager.getConnection(url, user, password);
	            	//  "Data Source=DESKTOP-SR8G8GB\SQLEXPRESS;Initial Catalog=AULADB;integrated Security = true";
	              
	                
	           connection.setAutoCommit(true);
	            
	            
	            return connection;
	        }

	    }
}
