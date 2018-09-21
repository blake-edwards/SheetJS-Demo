package com.dataaccessobject.blake;
import java.util.ArrayList;

/**
 * Author: Blake Edwards
 * 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceAllocationDAO raDAO = new ResourceAllocationDAO();
		System.out.println("[?] Testing Data Access Object Code");
		
    	//System.out.println("[?] Retrieving all resource allocations . . . ");
    	/*
    	ArrayList<ResourceAllocationRow> rows = raDAO.getAllResourceAllocations();
    	for (ResourceAllocationRow row : rows) {
    		System.out.println(row.toString());
    	}*/
    	
		int id = 7;
		System.out.println("\n[?] Retrieving resource allocation with id = "+id+" . . .");
		System.out.println(raDAO.getResourceAllocationID(id).toString());
		
		int year = 2017;
		System.out.println("\n[?] Retrieving all resource allocations with RA_year = "+year+" . . .");
		ArrayList<ResourceAllocationRow> rows = raDAO.getResourceAllocationYear(year);
    	for (ResourceAllocationRow row : rows) {
    		System.out.println(row.toString());
    	}
		
		
		System.out.println("\n[+] Complete!");
	}

}
