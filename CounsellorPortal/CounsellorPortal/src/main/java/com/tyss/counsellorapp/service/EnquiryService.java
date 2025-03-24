package com.tyss.counsellorapp.service;

import org.springframework.stereotype.Service;

import com.tyss.counsellorapp.repository.EnquiryRepository;

@Service
public class EnquiryService {

	private EnquiryRepository enquiryRepository;

	public EnquiryService(EnquiryRepository enquiryRepository) {
		this.enquiryRepository = enquiryRepository;
	}

}
