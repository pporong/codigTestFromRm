package com.gbr.rmSoft.CodingTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbr.rmSoft.CodingTest.repository.CtmRepository;
import com.gbr.rmSoft.CodingTest.vo.CUSTOMER_TB;

@Service
public class CtmService {
	
	@Autowired
	private CtmRepository ctmRepository;
		
	public List<CUSTOMER_TB> getCtmList(int ctm_id, String ctm_nm, String ctm_hp) {
		return ctmRepository.getCtmList(ctm_id, ctm_nm, ctm_hp);
	}
	
	public int getCountCtms() {
		return ctmRepository.getCountCtms();
	}


}
