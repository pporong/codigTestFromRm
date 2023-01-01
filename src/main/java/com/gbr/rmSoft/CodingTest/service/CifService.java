package com.gbr.rmSoft.CodingTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbr.rmSoft.CodingTest.repository.CifRepository;
import com.gbr.rmSoft.CodingTest.vo.CTMINFO_TB;

@Service
public class CifService {
	
	@Autowired
	private CifRepository cifRepository;
	
	public List<CTMINFO_TB> getCifList(int ctminfo_buySeq, String ctminfo_reg_date, int ctm_id, int item_id, String ctm_nm, String item_nm, String item_price) {
		return cifRepository.getCifList(ctminfo_buySeq, ctminfo_reg_date, ctm_id, item_id, ctm_nm, item_nm, item_price);
	}
	
	public int getCountCif() {
		return cifRepository.getCountCif();
	}


}
