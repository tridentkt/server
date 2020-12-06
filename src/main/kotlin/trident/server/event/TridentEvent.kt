package trident.server.event

import trident.api.event.Event

open class TridentEvent : Event {
    override val time = System.currentTimeMillis()

    override fun finish() {}
}