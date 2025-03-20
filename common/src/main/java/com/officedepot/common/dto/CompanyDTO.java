package com.officedepot.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CompanyDTO {
    private Integer ccIdx;               // PK
    private String ccCode;               // 회사 코드
    private String ccCodeName;           // 회사명
    private String ccAutoCode;           // 자동 생성 코드
    private String ccPwd;                // 비밀번호
    private String ccNumber;             // 사업자등록번호
    private String ccType;               // 회사 유형
    private String ccCondition;          // 업태
    private String ccOwner;              // 대표자명
    private String ccTel;                // 전화번호
    private String ccHtel;               // 휴대전화
    private String ccFax;                // 팩스번호
    private String ccHomepage;           // 홈페이지
    private String ccEmail;              // 이메일
    private String ccPerson;             // 담당자
    private String ccBillCollecting;     // 결제 방식
    private Double ccUncollected;        // 미수금
    private Double ccPoint01;            // 포인트1
    private Double ccPoint02;            // 포인트2
    private String ccCredit;             // 신용 정보
    private String ccEstimate;           // 견적 정보
    private String ccGroupCode;          // 그룹 코드
    private Date ccRegDate;              // 등록일
    private String ccActivity;           // 활동 상태
    private String ccCmt;                // 비고
    private Integer ccApproval;          // 승인 상태
    private Date ccUpDate;               // 수정일
    private Boolean dataSend;            // 데이터 전송 여부
    private Short ccCreditValue;         // 신용 등급
    private Short ccEstimateValue;       // 견적 등급
    private String ccCollectionDate;     // 수금일
    private String ccCloseDate;          // 마감일
    private String shiptoCodeC;          // 배송 코드
    private String ccInvoiceCode;        // 송장 코드
    private String ccSalesManager;       // 영업 담당자
    private String ccSalesManagerID;     // 영업 담당자 ID
    private String ccReDocument;         // 재문서화 여부
    private String ccCalcManager;        // 정산 담당자
    private String ccStatus;             // 상태 (활성/비활성)
    private String ccPayMethod;          // 결제 방식
    private Double ccLimit;              // 신용 한도
    private String ccDFeeChk;            // 수수료 체크
    private Integer ccDFeeAmt;           // 수수료 금액
    private Integer ccDFee;              // 수수료
    private Short ccBClose;              // 마감 여부
    private String ccSurtax;             // 부가세 여부
    private Short ccAccountYear;         // 회계 연도
    private String ccErrTxt;             // 오류 메시지
    private Short ccMailSend;            // 메일 전송 여부
    private Short ccGoodsDisp;           // 상품 표시 여부
    private String ccEngUse;             // 영문 사용 여부
    private String ccOrderType;          // 주문 유형
    private Byte ccFPointValue;          // 포인트 값
    private String idPaperPO;            // 종이 PO 여부
    private String taxView;              // 세금 표시 여부
    private String ynRecv;               // 수신 여부
    private String ccSouringFlag;        // 조달 여부
    private String ccOrderMailSend;      // 주문 메일 전송 여부
    private Byte skipApp;                // 승인 생략 여부
    private String ccSDelivery;          // 특수 배송 여부
    private String ccMroTaxView;         // MRO 세금 표시
    private String ccB2BService;         // B2B 서비스 여부
    private String ccLastModId;          // 마지막 수정자
    private String ccCategoryBudget;     // 예산 카테고리 사용 여부
    private String ccSmsUse;             // SMS 사용 여부
    private String ccBottomUse;          // 하단 사용 여부
    private String ccAppMailUse;         // 승인 메일 사용 여부
    private String ccDirectMailUse;      // 직접 메일 사용 여부
    private String ccAddOrder;           // 추가 주문 가능 여부
    private String ccBasicPriceUse;      // 기본 가격 사용 여부
    private String ccAlias;              // 회사 별칭
    private String ccAutoReject;         // 자동 거절 여부
    private String ccCategoryHide;       // 카테고리 숨김 여부
    private String ccLimitPerPO;         // PO별 한도 설정 여부
    private Integer ccLimitPerPOAmt;     // PO별 한도 금액
    private String ccSmsYN;              // SMS 사용 여부
    private String ccEmailYN;            // 이메일 사용 여부
    private String ccUseMOU;             // MOU 사용 여부
    private String ccEmailTaxType;       // 이메일 세금 유형
    private Integer custScmYn;           // SCM 사용 여부
    private String cls4Cd;               // 4단계 코드
    private String ccForwardFlag;        // 전달 여부
    private String ccBNumber;            // 법인번호
    private String ccDeliveryMailUse;    // 배송 메일 사용 여부
    private String ccSmsUseApproval;     // SMS 승인 여부
    private Byte ccDeliverySite;         // 배송지 여부
    private String ccRepayFlag;          // 재결제 여부
    private String ccBillingDate;        // 청구일
    private String ccIsOrderConfirm;     // 주문 확인 여부
    private Date ccIsOrderConfirmDate;   // 주문 확인 날짜
    private String ccIsBudgetAfterApproval; // 승인 후 예산 사용 여부
    private Date ccIsBudgetAfterApprovalDate; // 승인 후 예산 사용 날짜
    private String ccAccountantID;       // 회계 담당자 ID
    private String ccPaymentOptions;     // 결제 옵션
    private Integer ccPaymentOptionApproval; // 결제 옵션 승인 상태
    private String ccReceivingSupplyName; // 수령 공급자명
    private String ccReceivingSupplyPhone; // 수령 공급자 전화번호
    private String ccApprovalNumber;      // 승인 번호

    private MemberAddressDTO memberAddress; // 회사 주소정보(MemberAddressDTO)
}
