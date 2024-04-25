package com.library.service;

import java.util.List;

import com.library.model.Order;
import com.library.model.ShoppingCart;


public interface OrderService {
    Order save(ShoppingCart shoppingCart);

    List<Order> findAll(String username);

    List<Order> findALlOrders();

    Order acceptOrder(Long id);

    void cancelOrder(Long id);
}
