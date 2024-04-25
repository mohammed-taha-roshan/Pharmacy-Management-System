package com.library.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.library.model.City;
import com.library.repository.CityRepository;
//import com.library.service.CityService;
import com.library.service.DataRetrievalService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CityServiceImpl implements DataRetrievalService<City> {
    private final CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return cityRepository.findAll();
    }
}