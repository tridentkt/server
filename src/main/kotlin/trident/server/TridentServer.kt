package trident.server

import mu.KotlinLogging
import trident.api.Trident
import trident.api.entity.Entity
import trident.api.server.Server
import trident.server.network.TridentNetworkManager

class TridentServer(override val isPremium: Boolean) : Server {
    override val logger = KotlinLogging.logger("Server")
    override val pluginManager = TridentPluginManager()
    override val commandManager = TridentCommandManager()
    override val networkManager = TridentNetworkManager()
    override val eventManager = TridentEventManager()
    override val playerManager = TridentPlayerManager()
    override val worldManager = TridentWorldManager()
    override val entities = mutableSetOf<Entity>()

    fun start() {

    }

    override fun stop() {
    }

    override fun reload() {

    }

}