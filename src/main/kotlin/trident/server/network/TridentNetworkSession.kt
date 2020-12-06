package trident.server.network

import trident.api.network.NetworkSession
import trident.api.network.packet.Packet
import java.net.SocketAddress

class TridentNetworkSession : NetworkSession {
    override val host: String
        get() = TODO("Not yet implemented")
    override val port: Int
        get() = TODO("Not yet implemented")
    override val localAddress: SocketAddress
        get() = TODO("Not yet implemented")
    override val remoteAddress: SocketAddress
        get() = TODO("Not yet implemented")
    override var compressionThreshold: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var connectTimeout: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var readTimeout: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override val writeTimeout: Int
        get() = TODO("Not yet implemented")
    override val isConnected: Boolean
        get() = TODO("Not yet implemented")

    override fun send(packet: Packet) {
        TODO("Not yet implemented")
    }

    override fun connect() {
        TODO("Not yet implemented")
    }

    override fun connect(boolean: Boolean) {
        TODO("Not yet implemented")
    }

    override fun disconnect(string: String) {
        TODO("Not yet implemented")
    }

    override fun disconnect(string: String, throwable: Throwable) {
        TODO("Not yet implemented")
    }
}