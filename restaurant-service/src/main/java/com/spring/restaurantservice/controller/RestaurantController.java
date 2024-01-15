package com.spring.restaurantservice.controller;

import com.spring.restaurantservice.dto.OrderResponseDTO;
import com.spring.restaurantservice.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 16 Jan 2024
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantController {


    private final RestaurantService service;

    @GetMapping
    public String greetingMessage() {
        return service.greeting();
    }

    @GetMapping("/orders/status/{orderId}")
    public OrderResponseDTO getOrder(@PathVariable String orderId) {
        return service.getOrder(orderId);
    }
}