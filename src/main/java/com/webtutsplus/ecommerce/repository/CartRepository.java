package com.webtutsplus.order.repository;

import com.webtutsplus.order.model.Cart;
import com.webtutsplus.order.model.User;
import com.webtutsplus.order.model.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);

    List<Cart> deleteByUser(User user);

}

