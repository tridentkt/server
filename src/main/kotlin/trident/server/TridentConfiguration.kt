package trident.server

import com.uchuhimo.konf.ConfigSpec

class TridentConfiguration : ConfigSpec() {
    val maxPlayers by required<Int>()
}