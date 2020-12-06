package trident.server

import trident.api.LightMutableSet
import trident.api.plugin.Plugin
import trident.api.plugin.PluginManager

class TridentPluginManager : PluginManager, LightMutableSet<Plugin> {
    override fun add(element: Plugin): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): MutableIterator<Plugin> {
        TODO("Not yet implemented")
    }

    override fun remove(element: Plugin): Boolean {
        TODO("Not yet implemented")
    }

    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: Plugin): Boolean {
        TODO("Not yet implemented")
    }
}