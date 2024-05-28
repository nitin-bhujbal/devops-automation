package com.student.exception;

import java.util.Date;

public class ErrorDetail {
	
	private String Message;
	private Date date;
	private String Detail;
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDetail() {
		return Detail;
	}
	public void setDetail(String detail) {
		Detail = detail;
	}
	@Override
	public String toString() {
		return "ErrorDetail [Message=" + Message + ", date=" + date + ", Detail=" + Detail + "]";
	}
	public ErrorDetail(String message, Date date, String detail) {
		super();
		Message = message;
		this.date = date;
		Detail = detail;
	}
	public ErrorDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
