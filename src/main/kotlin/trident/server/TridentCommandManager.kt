package trident.server

import trident.api.LightMutableSet
import trident.api.command.CommandManager
import trident.api.command.RegisteredCommand

class TridentCommandManager : CommandManager, LightMutableSet<RegisteredCommand> {
    override fun add(element: RegisteredCommand): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): MutableIterator<RegisteredCommand> {
        TODO("Not yet implemented")
    }

    override fun remove(element: RegisteredCommand): Boolean {
        TODO("Not yet implemented")
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: RegisteredCommand): Boolean {
        TODO("Not yet implemented")
    }
}