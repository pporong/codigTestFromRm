package com.gbr.rmSoft.CodingTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gbr.rmSoft.CodingTest.repository.ItemRepository;
import com.gbr.rmSoft.CodingTest.vo.ITEM_TB;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public List<ITEM_TB> getItemList(int item_id, String item_nm, int com_id) {
		return itemRepository.getItemList(item_id, item_nm, com_id);
	}
	
	public int getCountItems() {
		return itemRepository.getCountItems();
	}


}
