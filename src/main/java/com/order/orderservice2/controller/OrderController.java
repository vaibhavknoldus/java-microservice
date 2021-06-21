package com.order.orderservice2.controller;


import com.order.orderservice2.entity.Order;
import com.order.orderservice2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/{orderId}")
    public Order getOrderInformation(@PathVariable("orderId") Long orderId){
        return orderService.getOrderInformation(orderId);
    }
}
