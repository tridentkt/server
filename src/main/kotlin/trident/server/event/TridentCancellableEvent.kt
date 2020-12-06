package trident.server.event

import trident.api.event.CancellableEvent

open class TridentCancellableEvent(
        override val callback: () -> Unit
) : TridentEvent(), CancellableEvent {
    override var isCancelled = false

    override fun finish() {
        if (!isCancelled) {
            callback()
        }
    }
}