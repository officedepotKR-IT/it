package com.officedepot.common.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDTO {
    private int oidx;
    private String omcid;
    private String occode;
    private String ocode;
    private int ono;
    private String oaddr01;
    private String oaddr02;
    private String oaddr03;
    private String ozipcode;
    private String odcmt;
    private String oacmt;
    private String oprocess;
    private Date oregdate;
    private String oaddr;
    private String otel;
    private String oemail;
    private String ohtel;
    private int oea;
    private int oprice;
    private int ototalPrice;
    private String oshortcodeA;
    private String ogCodeA;
    private Date odDate;
    private short opValue;
    private String obCode01;
    private short obCode02;
    private String oreceiver;
    private byte omethod;
    private short osettlement;
    private int opurchasePrice;
    private int oshipPrice;
    private int owebPrice;
    private int odept;
    private short oCollection;
    private String obCode03;
    private short obCode04;
    private String oredocument;
    private boolean oBilling;
    private String oponum;
    private String oaflag;
    private boolean opreidx;
    private String omcategory;
    private int odeptid;
    private String ogname;
    private byte oreturnFlag;
    private String offlag;
    private String oaddKey01;
    private String oaddKey02;
    private String oaddKey03;
    private String odriver;
    private String opaydetail;
    private int mro_order_seq;
    private String oCodeBak;
    private int oNoBak;
    private Date oShipDay;
    private String oRegID;
    private String oDirectVendor;
    private byte oDaAppNo;
    private Date oApprovalDate;
    private int oPayType;

}