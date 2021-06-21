package com.order.orderservice2.service;

import com.order.orderservice2.entity.Order;

public interface OrderService {
    public Order getOrderInformation(Long orderId);
}