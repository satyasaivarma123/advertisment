package com.cts.adver.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.cts.adver.exception.AdvertisementInstallmentException;
import com.cts.adver.model.AdvertisementInstallmentPayment;
import com.cts.adver.util.ApplicationUtil;



public class AdvertisementInstallmentDAO {
	public static Connection connection,connection1 = null;

	public boolean insertAdvertisementInstallmentPyt(ArrayList <AdvertisementInstallmentPayment> advInstlmtPyts) throws AdvertisementInstallmentException {
		boolean recordsAdded = false;

		// TYPE YOUR CODE HERE

		return recordsAdded;
		
		
	}
	
}
