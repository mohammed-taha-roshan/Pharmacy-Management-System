package com.library.service.impl;

import java.util.Collections;

import org.springframework.stereotype.Service;

import com.library.dto.CustomerDto;
import com.library.model.Customer;
import com.library.repository.RoleRepository;
import com.library.service.CustomerAdapter;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerAdapterImpl implements CustomerAdapter {
    private final RoleRepository roleRepository;

    @Override
    public CustomerDto customerToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setFirstName(customer.getFirstName());
        customerDto.setLastName(customer.getLastName());
        customerDto.setUsername(customer.getUsername());
        customerDto.setPassword(customer.getPassword());
        customerDto.setAddress(customer.getAddress());
        customerDto.setPhoneNumber(customer.getPhoneNumber());
        customerDto.setCity(customer.getCity());
        customerDto.setCountry(customer.getCountry());
        return customerDto;
    }

    @Override
    public Customer dtoToCustomer(CustomerDto dto) {
        Customer customer = new Customer();
        customer.setFirstName(dto.getFirstName());
        customer.setLastName(dto.getLastName());
        customer.setPassword(dto.getPassword());
        customer.setUsername(dto.getUsername());
        customer.setRoles(Collections.singletonList(roleRepository.findByName("CUSTOMER")));
        customer.setAddress(dto.getAddress());
        customer.setPhoneNumber(dto.getPhoneNumber());
        customer.setCity(dto.getCity());
        customer.setCountry(dto.getCountry());
        return customer;
    }
}
