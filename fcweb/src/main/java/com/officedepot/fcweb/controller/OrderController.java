package com.officedepot.fcweb.controller;

import com.officedepot.common.dto.OrderDTO;
import com.officedepot.fcweb.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/orderList")

    @PostMapping("/create")
    public String createOrder(@RequestBody OrderDTO orderDTO) {
        try {
            orderService.insertOrder(orderDTO);
            return "주문이 성공적으로 등록되었습니다.";
        } catch (IllegalArgumentException e) {
            // 한도 초과 예외 발생 시 메세지 반환
            return e.getMessage();
        }
    }
}
