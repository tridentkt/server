package trident.server.network

import trident.api.LightMutableSet
import trident.api.network.Network
import trident.api.network.NetworkSession
import java.net.ServerSocket

class TridentNetwork(
        override val host: String,
        override val port: Int
) : Network {
    override val sessions = object : LightMutableSet<NetworkSession> {
        override fun add(element: NetworkSession): Boolean {
            TODO("Not yet implemented")
        }

        override fun iterator(): MutableIterator<NetworkSession> {
            TODO("Not yet implemented")
        }

        override fun remove(element: NetworkSession): Boolean {
            TODO("Not yet implemented")
        }

        override val size: Int
            get() = TODO("Not yet implemented")

        override fun contains(element: NetworkSession): Boolean {
            TODO("Not yet implemented")
        }
    }

    override var isListening = false

    private val server = ServerSocket(port)

    fun open() {
        isListening = true

        while (isListening) {
            val socket = server.accept()!!
            val bytes = socket.getInputStream().readAllBytes()
        }
    }

    override fun close() {
        TODO("Not yet implemented")
    }
}