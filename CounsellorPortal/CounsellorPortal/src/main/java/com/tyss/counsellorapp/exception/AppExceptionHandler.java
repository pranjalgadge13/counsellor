package com.tyss.counsellorapp.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppExceptionHandler {

	@ExceptionHandler(CounsellorNotFound.class)
	public HeadersBuilder<?> catchCounsellorNotFound() {
		return ResponseEntity.notFound();
	}

	@ExceptionHandler(EnquiryNotFoundException.class)
	public HeadersBuilder<?> catchEnquiryNotFoundException() {
		return ResponseEntity.notFound();
	}

}
