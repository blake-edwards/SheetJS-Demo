package com.dataaccessobject.blake;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/*
 * to do:
 * add all crud operations methods
 * create an interface?
 * check in with john?
 */
import com.mysql.jdbc.Driver;
/**
 * Data Access Object to interface with Resource Allocation table for the ExTracker Project
 */
public class ResourceAllocationDAO {
	// may need to grab these configurations via an XML file
    public static final String URL = "jdbc:mysql://mylink.com:3306/myDB";
    public static final String USER = "username";
    public static final String PASS = "password";
    
    public ResourceAllocationDAO() {
    	// add initialization function that checks database connectivity
    	init();
    }
    
    /**
     * Initialization routine
     */
    public void init() {
    	getConnection();
    	System.out.println("[+] Initialized a new ResourceAllocationDAO!");
    }

    // returns a connection object
    public Connection getConnection()
    {
      try {
          DriverManager.registerDriver(new Driver());
          return DriverManager.getConnection(URL, USER, PASS);
      } catch (SQLException ex) {
          throw new RuntimeException("Error connecting to the database", ex);
      }
    }
    
    /**
     *  Extracts and creates a set from the rows retrieved
     */
    public ArrayList<ResourceAllocationRow> getAllResourceAllocations() {
    	Connection connection = getConnection();
    	 try {
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM Resource_Allocation");
             ArrayList<ResourceAllocationRow> rows = new ArrayList<ResourceAllocationRow>();
             while(rs.next())
             {
            	 ResourceAllocationRow row = extractResourceAllocationRow(rs);
            	 rows.add(row);
             }
             return rows;
         } catch (SQLException ex) {
             ex.printStackTrace();
         }
    	 return null;
    }
    
    /**
     *  Returns a Resource Allocations with inputed id
     *  * may want to add more "search" methods
     *  * need to ensure no id collisions otherwise it will confuse this function
     */
    public ResourceAllocationRow getResourceAllocationID(int id) {
    	Connection connection = getConnection();
    	try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Resource_Allocation WHERE id="+id);
            ResourceAllocationRow row = new ResourceAllocationRow();
            while(rs.next())
            { // if there is two entries with the same id, the last one is returned
            	row = extractResourceAllocationRow(rs);
            }
            return row;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   	 return null;
    }
    
    /**
     *  Returns a Resource Allocations with inputed year
     */
    public ArrayList<ResourceAllocationRow> getResourceAllocationYear(int year) {
    	Connection connection = getConnection();
    	try {
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Resource_Allocation WHERE RA_year="+year);
            ArrayList<ResourceAllocationRow> rows = new ArrayList<ResourceAllocationRow>();
            while(rs.next())
            {
           	 ResourceAllocationRow row = extractResourceAllocationRow(rs);
           	 rows.add(row);
            }
            return rows;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
   	 return null;
    }
    
    // extracts a resource allocation object from the response
    public ResourceAllocationRow extractResourceAllocationRow(ResultSet rs) throws SQLException {
	     ResourceAllocationRow resourceAllocationRow = new ResourceAllocationRow();
	   	 resourceAllocationRow.setId( rs.getInt("id") );
	   	 resourceAllocationRow.setRA_year( rs.getInt("RA_year") );
	   	 resourceAllocationRow.setRE( rs.getString("RE") );
	   	 resourceAllocationRow.setCRO( rs.getString("CRO") );
	   	 resourceAllocationRow.setProject_code( rs.getString("my_project_code") );
	   	 resourceAllocationRow.setJAN( rs.getDouble("JAN") );
	   	 resourceAllocationRow.setFEB( rs.getDouble("FEB") );
	   	 resourceAllocationRow.setMAR( rs.getDouble("MAR") );
	   	 resourceAllocationRow.setAPR( rs.getDouble("APR") );
	   	 resourceAllocationRow.setMAY( rs.getDouble("MAY") );
	   	 resourceAllocationRow.setJUN( rs.getDouble("JUN") );
	   	 resourceAllocationRow.setJUL( rs.getDouble("JUL") );
	   	 resourceAllocationRow.setAUG( rs.getDouble("AUG") );
	   	 resourceAllocationRow.setSEP( rs.getDouble("SEP") );
	   	 resourceAllocationRow.setOCT( rs.getDouble("OCT") );
	   	 resourceAllocationRow.setNOV( rs.getDouble("NOV") );
	   	 resourceAllocationRow.setDEC( rs.getDouble("DEC") );
	     return resourceAllocationRow;
    }
    
}