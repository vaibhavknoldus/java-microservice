package com.order.orderservice2.service;

import com.order.orderservice2.entity.Order;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    List<Order> orderInformation = List.of(
            new Order(1L,"AC",true,true, LocalDateTime.now(),1L),
            new Order(2L,"Mobile",true,true, LocalDateTime.now(),2L)
    );

    @Override
    public Order getOrderInformation(Long orderId) {
        return orderInformation.stream().filter(order -> orderId.equals(order.getOrderId())).findAny().orElse(null);
    }
}