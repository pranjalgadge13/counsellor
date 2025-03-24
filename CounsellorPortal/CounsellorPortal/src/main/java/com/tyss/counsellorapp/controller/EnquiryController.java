package com.tyss.counsellorapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.counsellorapp.service.EnquiryService;

@RestController
@RequestMapping("/enquiry")
public class EnquiryController {

	private EnquiryService enquiryService;

	public EnquiryController(EnquiryService enquiryService) {
		this.enquiryService = enquiryService;
	}
	
	

}
