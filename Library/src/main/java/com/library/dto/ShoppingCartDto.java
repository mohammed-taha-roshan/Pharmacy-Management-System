package com.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

import com.library.model.Customer;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShoppingCartDto implements dto{
    private Long id;

    private Customer customer;

    private double totalPrice;

    private int totalItems;

    private Set<CartItemDto> cartItems;

}
