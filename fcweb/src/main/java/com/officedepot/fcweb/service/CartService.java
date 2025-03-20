package com.officedepot.fcweb.service;

import com.officedepot.common.dto.CartDTO;
import java.util.List;

public interface CartService {

    /*장바구니 목록 조회*/
    List<CartDTO> getCartItems(String caId);
    /*장바구니 상품 추가*/
    String addCartItem(CartDTO cartDTO);
    /*장바구니 수량 수정*/
    String updateCartItemQuantity(int caIdx, int caEA);
    /*장바구니 항목 선택삭제*/
    String deleteCartItem(int caIdx);
    /*장바구니 항목 전체삭제*/
    String clearCart(String caId);
}
