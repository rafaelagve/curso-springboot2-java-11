package com.rafael.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafael.course.entities.Order;
import com.rafael.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{


	
}
