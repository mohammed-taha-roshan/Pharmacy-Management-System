package com.library.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemDto implements dto {
    private Long id;

    private ShoppingCartDto cart;

    private ProductDto product;

    private int quantity;

    private double unitPrice;

}
