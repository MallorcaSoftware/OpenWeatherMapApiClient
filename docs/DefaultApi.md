# DefaultApi

All URIs are relative to *http://api.openweathermap.org/data/2.5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCurrentWeatherData**](DefaultApi.md#getCurrentWeatherData) | **GET** /weather | 


<a name="getCurrentWeatherData"></a>
# **getCurrentWeatherData**
> CurrentWeatherDataResponse getCurrentWeatherData(q, id, units, lang)



Access current weather data for any location on Earth including over 200,000 cities! Current weather is frequently updated based on global models and data from more than 40,000 weather stations. Data is available in JSON, XML, or HTML format. 

### Example
```java
// Import classes:
//import com.mallorcasoftware.openweatherclient.ApiClient;
//import com.mallorcasoftware.openweatherclient.ApiException;
//import com.mallorcasoftware.openweatherclient.Configuration;
//import com.mallorcasoftware.openweatherclient.auth.*;
//import com.mallorcasoftware.openweatherclient.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: UserSecurity
ApiKeyAuth UserSecurity = (ApiKeyAuth) defaultClient.getAuthentication("UserSecurity");
UserSecurity.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//UserSecurity.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String q = "q_example"; // String | By city name
String id = "id_example"; // String | By city id
String units = "units_example"; // String | Standard, metric, and imperial units are available.
String lang = "lang_example"; // String | You can use lang parameter to get the output in your language.
try {
    CurrentWeatherDataResponse result = apiInstance.getCurrentWeatherData(q, id, units, lang);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCurrentWeatherData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| By city name | [optional]
 **id** | **String**| By city id | [optional]
 **units** | **String**| Standard, metric, and imperial units are available. | [optional]
 **lang** | **String**| You can use lang parameter to get the output in your language. | [optional]

### Return type

[**CurrentWeatherDataResponse**](CurrentWeatherDataResponse.md)

### Authorization

[UserSecurity](../README.md#UserSecurity)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

