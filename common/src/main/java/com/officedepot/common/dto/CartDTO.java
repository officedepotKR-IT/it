package com.officedepot.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CartDTO {

    private int caidx;             // 장바구니 ID (PK)
    private String caId;           // 회원 ID
    private int caMkey;            // 상품 키
    private String caPvalue;       // 상품 값 (예: 옵션 정보)
    private LocalDateTime caregdate; // 장바구니 등록일
    private int caStorageDate;     // 보관 일수
    private int caea;              // 수량
    private String caMtable;       // 상품 테이블명

}
