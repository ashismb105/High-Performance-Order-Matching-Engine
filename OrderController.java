package com.tradingengine.controller;

import com.tradingengine.entity.Order;
import com.tradingengine.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService service;

    public OrderController(OrderService service) {
        this.service = service;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return service.save(order);
    }

    @GetMapping
    public List<Order> getOrders() {
        return service.getAllOrders();
    }
}
