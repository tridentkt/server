package trident.server

import trident.api.LightMutableSet
import trident.api.entity.player.Player
import trident.api.player.PlayerManager

class TridentPlayerManager : PlayerManager, LightMutableSet<Player> {
    override fun add(element: Player): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): MutableIterator<Player> {
        TODO("Not yet implemented")
    }

    override fun remove(element: Player): Boolean {
        TODO("Not yet implemented")
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: Player): Boolean {
        TODO("Not yet implemented")
    }
}