package com.student.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(IdEmptyException.class)
	public ResponseEntity<?> idEmptyException(IdEmptyException exception, WebRequest request){
		ErrorDetail error = new ErrorDetail(exception.getMessage(), new Date(), request.getDescription(false));
		return new ResponseEntity<>(error, HttpStatus.EXPECTATION_FAILED);
	}
	
}
