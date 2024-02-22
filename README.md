# WhatsUp

Welcome to WhatsUp, an Android application built using Kotlin and Android Studio.

## About

WhatsUp allows users to log in using the following credentials:
- Username: `android`
- Password: `google`

Once logged in, users will be redirected to the Highlight page, where they can view highlighted events with their start and end dates. Event data is stored on Google Firebase.

Additionally, users can navigate to the Near Me page to view their location on Google Maps.

## Installation

To install WhatsUp, follow these steps:

1. Clone this repository to your local machine.
2. In the `secrets.propertiesExample` file, change `YOUR_API_KEY` in `MAPS_API_KEY=YOUR_API_KEY` to your Google Maps API key. You can generate a key [here](https://developers.google.com/maps/documentation/android-sdk/start). Then, rename the file to `secrets.properties`.

Enjoy using WhatsUp!
