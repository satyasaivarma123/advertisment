package com.cts.adver.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.cts.adver.exception.AdvertisementInstallmentException;



public class DBConnectionManager {

	 private static Connection con = null;
	 private static DBConnectionManager instance;
	public  DBConnectionManager()  throws AdvertisementInstallmentException
	{
		FileInputStream fis=null;
		 
		// TYPE YOUR CODE HERE
		    
	}
	public static DBConnectionManager getInstance() throws AdvertisementInstallmentException {
		
		
		// TYPE YOUR CODE HERE
		
		return instance;

	}
	public Connection getConnection() {
		
		
		// TYPE YOUR CODE HERE
		return con;
	}
}
