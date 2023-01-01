package com.gbr.rmSoft.CodingTest.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gbr.rmSoft.CodingTest.vo.CUSTOMER_TB;

@Mapper
public interface CtmRepository {

	public List<CUSTOMER_TB> getCtmList(int ctm_id, String ctm_nm, String ctm_hp);

	public int getCountCtms();

}
