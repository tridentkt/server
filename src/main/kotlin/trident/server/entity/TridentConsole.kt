package trident.server.entity

import trident.api.entity.Console
import trident.api.permission.PermissionSet

class TridentConsole : TridentCommandSender(true, PermissionSet(true)), Console {
    override fun message(message: String) {
        println(message)
    }
}