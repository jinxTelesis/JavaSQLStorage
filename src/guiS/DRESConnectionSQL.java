package guiS;

import java.sql.*;
import java.util.Properties;

import javax.sql.*;


//import javax.ejb.*;
import javax.naming.*;

public class DRESConnectionSQL {
	
	
	private static final Object userName = "root";
	private static final Object password = "massholesucks";
	private static final String dbms = "mysql";
	private static final String serverName = "localhost"; // not sure about server name
	private static final String portNumber = "3306";
	private static final String dbName = "sql_invoice_pro";
	

	public Connection getConnection() throws SQLException {

		String userName = "root";//
		
	    Connection conn = null;
	    Properties connectionProps = new Properties(); // might be wrong import
	    connectionProps.put("user", this.userName);
	    connectionProps.put("password", this.password);

	    if (this.dbms.equals("mysql")) {
	        conn = DriverManager.getConnection(
	                   "jdbc:" + this.dbms + "://" +
	                   this.serverName +
	                   ":" + this.portNumber + "/",
	                   connectionProps);
	    } else if (this.dbms.equals("derby")) {
	        conn = DriverManager.getConnection(
	                   "jdbc:" + this.dbms + ":" +
	                   this.dbName +
	                   ";create=true",
	                   connectionProps);
	    }
	    System.out.println("Connected to database");
	    return conn;
	    
	    
	}

}
