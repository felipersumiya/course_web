package com.felipersumiya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipersumiya.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
