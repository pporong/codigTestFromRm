package com.gbr.rmSoft.CodingTest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gbr.rmSoft.CodingTest.service.CifService;
import com.gbr.rmSoft.CodingTest.service.ComService;
import com.gbr.rmSoft.CodingTest.service.CtmService;
import com.gbr.rmSoft.CodingTest.service.ItemService;
import com.gbr.rmSoft.CodingTest.vo.COMPANY_TB;
import com.gbr.rmSoft.CodingTest.vo.CTMINFO_TB;
import com.gbr.rmSoft.CodingTest.vo.CUSTOMER_TB;
import com.gbr.rmSoft.CodingTest.vo.ITEM_TB;
import com.gbr.rmSoft.CodingTest.vo.ResultData;

@Controller
public class CodingTestController {

	@Autowired
	private ItemService itemService;
	@Autowired
	private ComService comService;
	@Autowired
	private CtmService ctmService;
	@Autowired
	private CifService cifService;
	
	@RequestMapping("/")
	@ResponseBody
	public String test() {
		return "안녕하세요";
	}
	
	@RequestMapping("/result/itemList")
	@ResponseBody
	public ResultData getItemList(@RequestParam(defaultValue = "0")int item_id, 
									@RequestParam(defaultValue = "")String item_nm,
									@RequestParam(defaultValue = "0")int com_id) {
		
		int itemsCount = itemService.getCountItems();
		
//		List<ITEM_TB> itemList = itemService.getItemList();
		List<ITEM_TB> itemList = itemService.getItemList(item_id, item_nm, com_id);
		
		ResultData rd = ResultData.from(itemsCount, itemList);
		
		return rd;
	}
	
	@RequestMapping("/result/comList")
	@ResponseBody
	public ResultData getComList(@RequestParam(defaultValue = "0") int com_id, @RequestParam(defaultValue = "") String com_nm, @RequestParam(defaultValue = "") String com_bossNm) {
		
		int comsCount = comService.getCountComs();
		
		List<COMPANY_TB> comList = comService.getComList(com_id, com_nm, com_bossNm);
		
		ResultData rd = ResultData.from(comsCount, comList);
		
		return rd;
	}
	
	@RequestMapping("/result/ctmList")
	@ResponseBody
	public ResultData getCtmList(@RequestParam(defaultValue = "0") int ctm_id, @RequestParam(defaultValue = "") String ctm_nm, @RequestParam(defaultValue = "") String ctm_hp) {
		
		int ctmsCount = ctmService.getCountCtms();
		
		List<CUSTOMER_TB> ctmList = ctmService.getCtmList(ctm_id, ctm_nm, ctm_hp);
		
		ResultData rd = ResultData.from(ctmsCount, ctmList);
		
		return rd;
	}
	
	@RequestMapping("/result/cifList")
	@ResponseBody
	public ResultData getCifList(@RequestParam(defaultValue = "0") int ctminfo_buySeq, String ctminfo_reg_date,
			@RequestParam(defaultValue = "0") int ctm_id, @RequestParam(defaultValue = "0") int item_id, 
			 @RequestParam(defaultValue = "") String ctm_nm, @RequestParam(defaultValue = "") String item_nm, @RequestParam(defaultValue = "") String item_price) {
		
		int cifCount = cifService.getCountCif();
		
		List<CTMINFO_TB> cifList = cifService.getCifList(ctminfo_buySeq, ctminfo_reg_date, ctm_id, item_id, ctm_nm, item_nm, item_price);
		
		ResultData rd = ResultData.from(cifCount, cifList);
		
		return rd;
	}
}
