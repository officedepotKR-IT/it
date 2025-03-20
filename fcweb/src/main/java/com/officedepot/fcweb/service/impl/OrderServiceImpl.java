package com.officedepot.fcweb.service.impl;

import com.officedepot.common.dto.MemberAddressDTO;
import com.officedepot.common.dto.MemberDTO;
import com.officedepot.common.dto.OrderDTO;
import com.officedepot.fcweb.service.OrderService;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final SqlSession sqlSession;

    @Override
    public MemberDTO getMemberInfo(String mcid) {
        return sqlSession.selectOne("OrderMapper.selectMemberInfo", mcid);
    }

    @Override
    public float getMemberLimit(String mcid) {
        return sqlSession.selectOne("OrderMapper.selectMemberLimit", mcid);
    }

    @Override
    public MemberAddressDTO getMemberAddress(String mcid) {
        return sqlSession.selectOne("OrderMapper.selectMemberAddress", mcid);
    }

    @Override
    public void insertOrder(OrderDTO orderDTO) {

        float memberLimit = getMemberLimit(orderDTO.getOmcid());

        // 여신한도 넘을 시
        if (orderDTO.getOtotalPrice() > memberLimit) {
            throw new IllegalArgumentException("한도 초과: 현재 한도는 " + memberLimit + "원 입니다.");
        }
        else {
            sqlSession.insert("OrderMapper.insertOrder", orderDTO);
        }
    }
}
