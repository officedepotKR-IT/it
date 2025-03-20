package com.officedepot.fcweb.service.impl;

import com.officedepot.common.dto.CartDTO;
import com.officedepot.fcweb.service.CartService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {

    private final SqlSession sqlSession;

    /*장바구니 목록 조회*/
    @Override
    public List<CartDTO> getCartItems(String caId) {
        return sqlSession.selectList("CartMapper.getCartItems", caId);
    }

    /*장바구니 상품 추가*/
    @Override
    public String addCartItem(CartDTO cartDTO) {
        int result = sqlSession.insert("CartMapper.addCartItem", cartDTO);
        return (result > 0) ? "SUCCESS" : "FAIL";
    }

    /*장바구니 수량 수정*/
    @Override
    public String updateCartItemQuantity(int caIdx, int caEA) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("caIdx", caIdx);
        paramMap.put("caEA", caEA);
        int result = sqlSession.update("CartMapper.updateCartItemQuantity", paramMap);
        return (result > 0) ? "SUCCESS" : "FAIL";
    }

    /*장바구니 항목 선택삭제*/
    @Override
    public String deleteCartItem(int caIdx) {
        int result = sqlSession.delete("CartMapper.deleteCartItem", caIdx);
        return (result > 0) ? "SUCCESS" : "FAIL";
    }

    /*장바구니 항목 전체삭제*/
    @Override
    public String clearCart(String caId) {
        int result = sqlSession.delete("CartMapper.clearCart", caId);
        return (result > 0) ? "SUCCESS" : "FAIL";
    }
}
