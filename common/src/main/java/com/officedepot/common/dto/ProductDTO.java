package com.officedepot.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class ProductDTO {
    private int gidx;
    private String gshortCode;
    private String gbarCode;
    private String gbarCodeR;
    private String grepCode;
    private String gprvCode;
    private String gboxCode;
    private int gpieceQty;
    private String gcategoryCode;
    private String gname;
    private String gnameEng;
    private String gproduction;
    private String gvendorName;
    private String gorigin;
    private int gshipQty;
    private int gwebPrice;
    private int gbtobPrice;
    private String gaDisplay;
    private String gbtobDisplay;
    private String gdivision;
    private String step01;
    private String step02;
    private String step03;
    private boolean preidx;
    private int gshipPrice;
    private int gpurchasePrice;
    private int gcsmPrice;
    private String gcnt;
    private String gunit;
    private boolean gmainD;
    private char gIsNoTax;
    private String gkeyWord;
    private String gusingGroup;
    private String gloc01;
    private String gloc02;
    private int gType3Price;
    private String oDJcode;
    private String oDJcodeName;
    private Date gdate;
    private String oDKClass1;
    private String oDKClass1Name;
    private String oDKClass2;
    private String oDKClass2Name;
    private String gimgUrl;
    private String gimgDetail;
    private String gimgNotice;
    private int gorder;
    private String gidCode;
    private String gDCMemo;
    private char gOrderBlock;
    private int gmultipleQty;
    private String grecvDate;
    private String gshipType;
    private int gdeliveryDay01;
    private int gdeliveryDay02;
}
