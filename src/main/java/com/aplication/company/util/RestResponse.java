package com.aplication.company.util;

public class RestResponse {
	
	private Integer responseCode;
	private Object message;
	
	public RestResponse(Integer responseCode) {
		super();
		this.responseCode= responseCode;
		
	}
	
	public RestResponse(Integer responseCode, Object message) {
		super();
		this.responseCode= responseCode;
		this.message= message;	
	}
	
	public Integer getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}
	public Object getMessage() {
		return message;
	}
	public void setMessage(Object message) {
		this.message = message;
	}
	

}
