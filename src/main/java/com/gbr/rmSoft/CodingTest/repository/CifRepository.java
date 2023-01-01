package com.gbr.rmSoft.CodingTest.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gbr.rmSoft.CodingTest.vo.CTMINFO_TB;

@Mapper
public interface CifRepository {
	
	public List<CTMINFO_TB> getCifList(int ctminfo_buySeq, String ctminfo_reg_date, int ctm_id, int item_id, String ctm_nm, String item_nm, String item_price);

	public int getCountCif();

}
