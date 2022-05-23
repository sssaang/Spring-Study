package org.sssaang.simplemarket.repositories

import org.springframework.stereotype.Repository

@Repository
class OrderRepository {

    fun save (itemId: String) {
        if (itemId == "ex") {
            throw IllegalStateException("exception occur")
        }

        sleep(1000)
    }

    fun sleep(time: Long) {
        try {
            Thread.sleep(time)
        } catch (e: InterruptedException) {
            println(e)
        }
    }
}