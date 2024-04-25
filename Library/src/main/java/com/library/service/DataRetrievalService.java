package com.library.service;

import java.util.List;

public interface DataRetrievalService<T> {
    List<T> findAll();
}