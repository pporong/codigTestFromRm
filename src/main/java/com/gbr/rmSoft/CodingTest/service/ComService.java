package com.gbr.rmSoft.CodingTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbr.rmSoft.CodingTest.repository.ComRepository;
import com.gbr.rmSoft.CodingTest.vo.COMPANY_TB;

@Service
public class ComService {
	
	@Autowired
	private ComRepository comRepository;
	
	public List<COMPANY_TB> getComList(int com_id, String com_nm, String com_bossNm) {
		return comRepository.getComList(com_id, com_nm, com_bossNm);
	}
	
	public int getCountComs() {
		return comRepository.getCountComs();
	}


}
