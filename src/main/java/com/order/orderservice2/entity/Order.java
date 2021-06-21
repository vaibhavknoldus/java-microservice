package com.order.orderservice2.entity;


import java.time.LocalDateTime;
import java.util.Date;

public class Order {
    private long orderId;
    private String orderItem;
    private boolean isPaymentReceived;
    private boolean isShipped;
    private LocalDateTime orderDateAndTime;
    private long customerId;

    public Order() {
    }

    public Order(long orderId, String orderItem, boolean isPaymentReceived, boolean isShipped, LocalDateTime orderDateAndTime, long customerId) {
        this.orderId = orderId;
        this.orderItem = orderItem;
        this.isPaymentReceived = isPaymentReceived;
        this.isShipped = isShipped;
        this.orderDateAndTime = orderDateAndTime;
        this.customerId = customerId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(String orderItem) {
        this.orderItem = orderItem;
    }

    public boolean isPaymentReceived() {
        return isPaymentReceived;
    }

    public void setPaymentReceived(boolean paymentReceived) {
        isPaymentReceived = paymentReceived;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void setShipped(boolean shipped) {
        isShipped = shipped;
    }

    public LocalDateTime getOrderDateAndTime() {
        return orderDateAndTime;
    }

    public void setOrderDateAndTime(LocalDateTime orderDateAndTime) {
        this.orderDateAndTime = orderDateAndTime;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
}

