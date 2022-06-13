package com.webtutsplus.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webtutsplus.order.model.Category;

@Repository
public interface Categoryrepository extends JpaRepository<Category, Integer> {

	Category findByCategoryName(String categoryName);

}
