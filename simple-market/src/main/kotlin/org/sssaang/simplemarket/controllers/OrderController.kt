package org.sssaang.logtracer.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.sssaang.logtracer.services.OrderService

@RestController
class OrderController(private val orderService: OrderService) {

    @GetMapping("/request")
    fun request(itemId: String): String {
        orderService.orderItem(itemId)
        return "ok"
    }
}