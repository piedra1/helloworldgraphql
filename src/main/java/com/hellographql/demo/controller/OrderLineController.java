package com.hellographql.demo.controller;

import com.hellographql.demo.entity.OrderLine;
import com.hellographql.demo.repository.OrderLineRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class OrderLineController {

    private final OrderLineRepository orderLineRepository;

    public OrderLineController(OrderLineRepository orderLineRepository) {
        this.orderLineRepository = orderLineRepository;
    }

    @QueryMapping
    public Iterable<OrderLine> orderLines(){
        return this.orderLineRepository.findAll();
    }
}
