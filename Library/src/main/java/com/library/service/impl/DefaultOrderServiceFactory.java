package com.library.service.impl;

import org.springframework.stereotype.Component;

import com.library.service.OrderService;

@Component
public class DefaultOrderServiceFactory implements OrderServiceFactory {

    private  OrderServiceImpl orderServiceImpl;

    public DefaultOrderServiceFactory(OrderServiceImpl orderServiceImpl) {
        this.orderServiceImpl = orderServiceImpl;
    }

    @Override
    public OrderService createOrderService() {
        return orderServiceImpl;
    }
}
