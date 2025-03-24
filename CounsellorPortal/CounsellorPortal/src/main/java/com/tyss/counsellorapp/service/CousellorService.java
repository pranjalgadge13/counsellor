package com.tyss.counsellorapp.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.tyss.counsellorapp.dto.CounsellorRequest;
import com.tyss.counsellorapp.entity.Counsellor;
import com.tyss.counsellorapp.repository.CounsellorRepository;

@Service
public class CousellorService {

	private CounsellorRepository counsellorRepository;

	public CousellorService(CounsellorRepository counsellorRepository) {
		this.counsellorRepository = counsellorRepository;
	}

	public boolean registerCounsellor(CounsellorRequest request) {
		Optional<Counsellor> opt = counsellorRepository.findByEmail(request.getEmail());

		if (opt.isPresent()) {
			return false;
		} else {
			Counsellor counsellor = new Counsellor();
			BeanUtils.copyProperties(request, counsellor);
			counsellorRepository.save(counsellor);
			return true;
		}

	}
}
