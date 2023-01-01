package com.gbr.rmSoft.CodingTest.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CTMINFO_TB {
    private int ctminfo_buySeq;
    private String ctminfo_reg_date;
    private int ctm_id;
    private int item_id;
    
    private String ctm_nm;
    private String item_nm;
    private String item_price;
}
