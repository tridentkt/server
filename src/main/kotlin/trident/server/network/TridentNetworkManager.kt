package trident.server.network

import trident.api.network.NetworkManager

class TridentNetworkManager(
        override val network: TridentNetwork
) : NetworkManager