package com.webtutsplus.order.repository;

import com.webtutsplus.order.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {
}
