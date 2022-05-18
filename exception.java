package com.cts.adver.exception;

public class AdvertisementInstallmentException extends Exception{
	
	String strMsg1;
	Throwable strMsg2;

	public AdvertisementInstallmentException() {
		super();
	}

	public AdvertisementInstallmentException(String strMsg1, Throwable strMsg2) {
		super();
		this.strMsg1 = strMsg1;
		this.strMsg2 = strMsg2;
	}

}
