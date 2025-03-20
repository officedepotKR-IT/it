package com.officedepot.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberAddressDTO {
    private int ccaIdx;            // 주소 인덱스
    private String ccaAddr01B;      // 기본 주소1 (B)
    private String ccaAddr02B;      // 기본 주소2 (B)
    private String ccaAddr03B;      // 기본 주소3 (B)
    private String ccaZipcodeB;     // 우편번호 (B)
    private String ccaAddrB;        // 전체 주소 (B)

    private String ccaAddr01T;      // 기본 주소1 (T)
    private String ccaAddr02T;      // 기본 주소2 (T)
    private String ccaAddr03T;      // 기본 주소3 (T)
    private String ccaZipcodeT;     // 우편번호 (T)
    private String ccaAddrT;        // 전체 주소 (T)

    private String ccaManageCode;   // 관리 코드
    private String ccaManageGroup;  // 관리 그룹
    private String ccCode;          // 회사 코드
    private String ccGroupCode;     // 회사 그룹 코드
    private String mcId;            // 회원 ID
    private String ccDivision;      // 회사 구분
}
