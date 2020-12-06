package trident.server.entity

import trident.api.entity.CommandSender
import trident.api.message.SimpleMessage

abstract class TridentCommandSender(
        override val isOp: Boolean,
        override val permissions: MutableSet<String>
) : TridentEntity(), CommandSender {
    override fun message(message: String) {
        message(SimpleMessage(message))
    }
}