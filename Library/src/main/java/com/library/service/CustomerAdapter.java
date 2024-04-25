package com.library.service;

import com.library.dto.CustomerDto;
import com.library.model.Customer;

public interface CustomerAdapter {
    CustomerDto customerToDto(Customer customer);
    Customer dtoToCustomer(CustomerDto dto);
}
