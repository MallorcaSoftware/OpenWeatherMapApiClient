package com.mallorcasoftware.openweatherclient;

import com.mallorcasoftware.openweatherclient.api.DefaultApi;
import com.mallorcasoftware.openweatherclient.model.CurrentWeatherDataResponse;
import com.mallorcasoftware.openweatherclient.model.ForecastDataResponse;

public class Application {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        apiClient.setApiKey("9b20ab81abcf81ed25609ba174c839b6");
        DefaultApi defaultApi = new DefaultApi(apiClient);
        System.out.println("Wetter");

        try {
            CurrentWeatherDataResponse currentWeather = defaultApi.getCurrentWeatherData("New York", null, "metric", "de_DE");
            System.out.println(currentWeather);
        } catch (ApiException e) {
            e.printStackTrace();
        }

        try {
            ForecastDataResponse forecastDataResponse = defaultApi.getForecast("Cala Ratjada", null, "metric", "de_DE");
            System.out.println(forecastDataResponse);
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
