package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {

}
