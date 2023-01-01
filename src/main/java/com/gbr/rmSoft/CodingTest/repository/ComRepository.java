package com.gbr.rmSoft.CodingTest.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gbr.rmSoft.CodingTest.vo.COMPANY_TB;

@Mapper
public interface ComRepository {

	public int getCountComs();

	public List<COMPANY_TB> getComList(int com_id, String com_nm, String com_bossNm);

}
