package com.spring.restaurantservice.service;

import com.spring.restaurantservice.dao.RestaurantOrderDAO;
import com.spring.restaurantservice.dto.OrderResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 16 Jan 2024
 */
@Service
@RequiredArgsConstructor
public class RestaurantService {

    private RestaurantOrderDAO orderDAO;

    public String greeting() {
        return "Welcome to Swiggy Restaurant service";
    }

    public OrderResponseDTO getOrder(String orderId) {
        return orderDAO.getOrders(orderId);
    }
}
