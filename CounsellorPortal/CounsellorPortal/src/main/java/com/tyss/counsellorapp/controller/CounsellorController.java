package com.tyss.counsellorapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.counsellorapp.dto.CounsellorRequest;
import com.tyss.counsellorapp.service.CousellorService;

import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/counsellor")
public class CounsellorController {

	private CousellorService cousellorService;

	public CounsellorController(CousellorService cousellorService) {
		this.cousellorService = cousellorService;
	}

	@PostMapping("/register")
	public ResponseEntity<String> registerCounsellor(@RequestBody CounsellorRequest counsellorRequest) {
		boolean registered = cousellorService.registerCounsellor(counsellorRequest);
		if (registered) {
			return ResponseEntity.ok("registered");
		} else {
			return ResponseEntity.badRequest().body("already registered");
		}
	}

	
}
