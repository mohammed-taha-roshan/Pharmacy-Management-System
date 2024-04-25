package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.Order;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	Order getById(Long id);
}
