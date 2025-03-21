package com.officedepot.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BranchInfoDTO {

    private String biGroupCode;     // 그룹 코드
    private String biCompanyCode;   // 회사 코드
    private int biCode;             // 코드
    private String biPkCode;        // PK 코드
    private String biName;          // 지점명
    private String biNumber;        // 사업자 번호
    private String biType;          // 업종
    private String biCondition;     // 업태
    private String biOwner;         // 대표자명
    private String biTel;           // 전화번호
    private String biHTel;          // 핸드폰번호
    private String biFax;           // 팩스번호
    private String biHomepage;      // 홈페이지
    private String biEmail;         // 이메일
    private String biZipcode;       // 우편번호
    private String biSido;          // 시/도
    private String biGugun;         // 구/군
    private String biDong;          // 동/읍/면
    private String biAddr;          // 상세주소
    private boolean biPermit;       // 허가 여부
    private String biBankAccount;   // 은행 계좌
    private String biSupervisor;    // 감독자
}
