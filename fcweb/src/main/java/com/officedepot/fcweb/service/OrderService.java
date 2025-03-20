package com.officedepot.fcweb.service;

import com.officedepot.common.dto.MemberDTO;
import com.officedepot.common.dto.OrderDTO;
import com.officedepot.common.dto.MemberAddressDTO;

public interface OrderService {

    /** 회원 정보 조회 */
    MemberDTO getMemberInfo(String mcid);

    /** 회원 한도 조회 */
    float getMemberLimit(String mcid);

    /** 배송지 조회 */
    MemberAddressDTO getMemberAddress(String mcid);

    /** 주문 등록 */
    void insertOrder(OrderDTO orderDTO);
}
