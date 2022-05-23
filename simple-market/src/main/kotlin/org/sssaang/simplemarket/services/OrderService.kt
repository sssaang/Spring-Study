package org.sssaang.simplemarket.services

import org.springframework.stereotype.Service
import org.sssaang.simplemarket.repositories.OrderRepository

@Service
class OrderService(private val orderRepository: OrderRepository) {

    fun orderItem(itemId: String) = orderRepository.save(itemId)
}