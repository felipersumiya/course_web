package com.felipersumiya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipersumiya.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
