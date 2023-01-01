package com.gbr.rmSoft.CodingTest.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResultData {
	
	private int total_item_count;
	private Object list;
	
	public ResultData(int total_item_count, Object list, Object... args) {
		this.total_item_count = total_item_count;
		this.list = list;
	}


	public static ResultData from(int total_item_count, Object list) {
		ResultData rd = new ResultData();
		rd.total_item_count = total_item_count;
		rd.list = list;

		return rd;
	}


}
