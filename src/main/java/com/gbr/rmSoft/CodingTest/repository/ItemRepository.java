package com.gbr.rmSoft.CodingTest.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.gbr.rmSoft.CodingTest.vo.ITEM_TB;

@Mapper
public interface ItemRepository {

//	public List<ITEM_TB> getItemList();

	public int getCountItems();
	
	public List<ITEM_TB> getItemList(int item_id, String item_nm, int com_id);
	
	
}
