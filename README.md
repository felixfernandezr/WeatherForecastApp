# WeatherForecastApp

An Android application for searching and displaying both current and extended weather forecasts. Built using **Kotlin**, this app provides real-time weather updates and a search history feature using **Room Database**. It employs **MVVM architecture** for better separation of concerns and code reusability.

---

## API Integration
- Integrated with [Weatherbit.io API](https://www.weatherbit.io) to fetch real-time weather data.
- **API Key Management**: Stored securely in the `Constants` file inside `api` package.

---

## Installation
1. Clone this repository:
   ```bash
   git clone https://github.com/felixfernandezr/WeatherForecastApp.git
2. Open the project in Android Studio.
3. Add your Weatherbit.io API Key in the Constants file.
4. Build and run the project on an emulator or device.

---

## Features
- **Search by City**: Enter a city name to fetch and display its current weather.
- **7-Day Forecast**: View detailed weather predictions for the next seven days in a separate activity.
- **Search History**: Save and display a searchable history of cities using **Room DAO** and fragments.
- **User-Friendly UI**: Optimized with **RecyclerView** and custom adapters for smooth list display.
- **Live Weather Updates**: Fetches data from the [Weatherbit.io API](https://www.weatherbit.io).
- **Offline Storage**: Preserve your search history using **Room Database**.

---

## Tech Stack
### Architecture
- **MVVM**: Ensures a clean separation of UI and business logic.
  
### Core Components
- **Retrofit**: For API communication.
- **Room Database**: For local storage of search history.

---

## How It Works
### MainActivity
- Displays current weather for the searched city.
- Use the `Extended Forecast` or `Search History` buttons to navigate to other screens.
- Use `Back` buttons on both screens to navigate back to MainActivity.

### ForecastDetail Activity
- Displays a **RecyclerView** with a 7-day forecast.
- Receives data via `Intent` from MainActivity.

### HistoryFragment
- Displays a list of previously searched cities stored in the **Room Database** within a fragment.

### Network State Handler
- **ApiResult** is a sealed class used for handling the network state
- This helps to manage and display network results in a consistent and more accessible manner.

---

## Demo Video

Check out the demo video of the app:

[![Weather App Demo](https://img.youtube.com/vi/0cB-uqg27Qg/0.jpg)](https://youtu.be/0cB-uqg27Qg?feature=shared)
