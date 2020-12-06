package trident.server

import trident.api.LightMutableMap
import trident.api.LightMutableSet
import trident.api.event.Event
import trident.api.event.EventManager
import trident.api.event.RegisteredEventListener
import trident.api.event.RegisteredEventListenerImpl
import trident.api.plugin.Plugin
import kotlin.reflect.KClass

class TridentEventManager : EventManager, LightMutableMap<KClass<out Event>, MutableList<RegisteredEventListener<out Event>>> {
    override fun <E : Event> add(`class`: KClass<E>, plugin: Plugin?, callback: (E) -> Unit) {
        if (this[`class`] == null) this[`class`] = mutableListOf()

        this[`class`]!!.add(RegisteredEventListenerImpl(`class`, plugin, callback))
    }

    override fun <E : Event> call(event: E) {
        this[event::class]
                ?.filterIsInstance<RegisteredEventListener<E>>()
                ?.forEach {
                    it(event)
                }

        event.finish()
    }
}