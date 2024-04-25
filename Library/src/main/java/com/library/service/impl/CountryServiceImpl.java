package com.library.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.library.model.Country;
import com.library.repository.CountryRepository;
//import com.library.service.CountryService;
import com.library.service.DataRetrievalService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryServiceImpl implements DataRetrievalService<Country> {
    private final CountryRepository countryRepository;

    @Override
    public List<Country> findAll() {
        return countryRepository.findAll();
    }
}