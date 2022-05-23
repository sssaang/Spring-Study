package org.sssaang.logtracer.services

import org.springframework.stereotype.Service
import org.sssaang.logtracer.repositories.OrderRepository

@Service
class OrderService(private val orderRepository: OrderRepository) {

    fun orderItem(itemId: String) = orderRepository.save(itemId)
}