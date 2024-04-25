package com.library.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.library.dto.CustomerDto;
import com.library.model.Customer;
import com.library.repository.CustomerRepository;
import com.library.repository.RoleRepository;
import com.library.service.CustomerAdapter;
import com.library.service.CustomerService;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerAdapter customerAdapter;

    @Override
    public Customer save(CustomerDto customerDto) {
        Customer customer = customerAdapter.dtoToCustomer(customerDto);
        return customerRepository.save(customer);
    }

    @Override
    public Customer findByUsername(String username) {
        return customerRepository.findByUsername(username);
    }

    @Override
    public CustomerDto getCustomer(String username) {
        Customer customer = customerRepository.findByUsername(username);
        return customerAdapter.customerToDto(customer);
    }

    @Override
    public Customer changePass(CustomerDto customerDto) {
        Customer customer = customerRepository.findByUsername(customerDto.getUsername());
        customer.setPassword(customerDto.getPassword());
        return customerRepository.save(customer);
    }

    @Override
    public Customer update(CustomerDto dto) {
        Customer customer = customerRepository.findByUsername(dto.getUsername());
        customer.setAddress(dto.getAddress());
        customer.setCity(dto.getCity());
        customer.setCountry(dto.getCountry());
        customer.setPhoneNumber(dto.getPhoneNumber());
        return customerRepository.save(customer);
    }
}
