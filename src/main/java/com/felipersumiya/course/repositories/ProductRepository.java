package com.felipersumiya.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipersumiya.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
