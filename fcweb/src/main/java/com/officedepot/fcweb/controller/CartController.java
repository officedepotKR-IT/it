package com.officedepot.fcweb.controller;


import com.officedepot.common.dto.CartDTO;
import com.officedepot.fcweb.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cart")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    /*장바구니 목록 조회*/
    @GetMapping("/list")
    public String cartList(@RequestParam("caId") String caId, Model model) {

        // 장바구니 리스트
        List<CartDTO> cartList = cartService.getCartItems(caId);
        // 본사사업장 정보(견적서용)
        List<String> branchList = new ArrayList<>();

        model.addAttribute("cartList" , cartList);
        model.addAttribute("branchList" , branchList);

        return "cart/cartList";
    }

    /*장바구니 상품 추가*/
    @PostMapping("/add")
    public String addCartItem(@ModelAttribute CartDTO cartDTO, RedirectAttributes redirectAttributes) {
        String result = cartService.addCartItem(cartDTO);
        redirectAttributes.addFlashAttribute("message", result.equals("SUCCESS") ? "상품이 장바구니에 추가되었습니다." : "상품 추가 실패");
        return "redirect:/cart/list?caId=" + cartDTO.getCaId();
    }

    /*장바구니 수량 수정*/
    @PostMapping("update")
    public String updateCartItem(@RequestParam("caIdx") int caIdx, @RequestParam("caId") String caId, @RequestParam("caEA") int caEA, RedirectAttributes redirectAttributes) {
        String result = cartService.updateCartItemQuantity(caIdx, caEA);
        redirectAttributes.addFlashAttribute("message", result.equals("SUCCESS") ? "수량 변경되었습니다." : "수량 변경 실패");
        return "redirect:/cart/list?caId=" + caId;
    }

    /*장바구니 항목 선택삭제*/
    @PostMapping("delete")
    public String deleteCartItem(@RequestParam("caIdx") int caIdx, @RequestParam("caId") String caId, RedirectAttributes redirectAttributes) {
        String result = cartService.deleteCartItem(caIdx);
        redirectAttributes.addFlashAttribute("message", result.equals("SUCCESS") ? "상품 삭제되었습니다." : "삭제 실패");
        return "redirect:/cart/list?caId=" + caId;
    }

    /*장바구니 항목 전체삭제*/
    @PostMapping("clear")
    public String clearCart(@RequestParam("caId") String caId, RedirectAttributes redirectAttributes) {
        String result = cartService.clearCart(caId);
        redirectAttributes.addFlashAttribute("message", result.equals("SUCCESS") ? "장바구니 비워졌습니다." : "장바구니 비우기 실패");
        return "redirect:/cart/list?caId=" + caId;
    }
}
