package com.gbr.rmSoft.CodingTest.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ITEM_TB {
    private int item_id;
    private String item_nm;
    private String item_price;
    private String item_reg_date;
    private int com_id;
    
    private String company; // 업체명
}
