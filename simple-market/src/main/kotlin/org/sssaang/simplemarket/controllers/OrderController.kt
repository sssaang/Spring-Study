package org.sssaang.simplemarket.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.sssaang.simplemarket.services.OrderService

@RestController
class OrderController(private val orderService: OrderService) {

    @GetMapping("/request")
    fun request(itemId: String): String {
        orderService.orderItem(itemId)
        return "ok"
    }
}