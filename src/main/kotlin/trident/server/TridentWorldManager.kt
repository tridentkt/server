package trident.server

import trident.api.world.World
import trident.api.world.WorldManager
import trident.api.world.generation.WorldGenerator

class TridentWorldManager : WorldManager {
    override val worlds = mutableSetOf<World>()
    override val worldGenerators = mutableSetOf<WorldGenerator>()
}