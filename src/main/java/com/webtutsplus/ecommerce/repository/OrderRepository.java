package com.webtutsplus.order.repository;

import com.webtutsplus.order.model.Cart;
import com.webtutsplus.order.model.Order;
import com.webtutsplus.order.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository  extends JpaRepository<Order, Integer> {
    List<Order> findAllByUserOrderByCreatedDateDesc(User user);

}
