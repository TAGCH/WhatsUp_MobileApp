package org.classapp.whatsup

sealed class DestinationScreens (val route: String) {
    object Highlight : DestinationScreens("hightlight")
    object NearMe : DestinationScreens("nearMe")
    object MyEvents : DestinationScreens("myEvents")
}