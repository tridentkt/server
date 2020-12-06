package trident.server.entity.player

import trident.api.entity.player.Player
import trident.api.entity.player.PlayerInventory
import trident.api.network.GameProfile
import trident.api.network.NetworkSession
import trident.server.entity.TridentCommandSender
import java.util.*

class TridentPlayer(
        isOp: Boolean,
        permissions: MutableSet<String>,
        override val name: String,
        override val uuid: UUID,
        override val isPremium: Boolean,
        override val gameProfile: GameProfile,
        override val session: NetworkSession,
        override val inventory: PlayerInventory,
        override var hunger: Int,
        override var health: Int
) : TridentCommandSender(isOp, permissions), Player {
    override val isDead: Boolean
        get() = health == 0

    override fun message(message: String) {
        TODO("Not yet implemented")
    }

    override fun ban(message: String, time: Long): Boolean {
        TODO("Not yet implemented")
    }

    override fun unban(): Boolean {
        TODO("Not yet implemented")
    }

    override fun kick(message: String) {
        session.disconnect(message)
    }

    override fun kill() {
        health = 0
    }
}