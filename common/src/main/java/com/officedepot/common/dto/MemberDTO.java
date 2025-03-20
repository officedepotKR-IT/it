package com.officedepot.common.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {
    private int mcIdx;
    private String mcId;
    private String mcName;
    private byte[] mcPwd;
    private String mcSerialNumber;
    private boolean mcMemberCard;
    private String mcTel;
    private String mcHTel;
    private String mcFax;
    private String mcTotalManage;
    private String mcCondition;
    private String mcCompanyManage;
    private String mcHomepage;
    private String mcEmail;
    private double mcUncollected;
    private double mcPoint01;
    private double mcPoint02;
    private String mcFPoint;
    private String mcMemo;
    private String ccCode;
    private String ccGroupCode;
    private LocalDateTime mcRegDate;
    private String mcActivity;
    private String mcAutoCode;
    private String mcDivision;
    private LocalDateTime mcUpDate;
    private boolean dataSend;
    private short mcTotalManageValue;
    private short mcCompanyManageValue;
    private short mcFPointValue;
    private short mcConditionValue;
    private int mcRIdx;
    private String mcErrTxt;
    private String mcManageValue;
    private String oAddKey01;
    private String oAddKey02;
    private String oAddKey03;
    private String billInfo01;
    private String billInfo02;
    private String billInfo03;
    private String billInfo04;
    private int billInfo;
    private LocalDateTime mcLastLogin;
    private String mcLastMcid;
    private String custId;
    private String idPaperPo;
    private int mcDeptIdx;
    private char mcSmsYn;
    private String mcTaxEmail;

    private CompanyDTO company; // 회사정보(CompanyDTO)
}
