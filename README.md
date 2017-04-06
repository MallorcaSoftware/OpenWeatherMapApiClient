# openweatherclient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.mallorcasoftware</groupId>
    <artifactId>openweatherclient</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.mallorcasoftware:openweatherclient:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/openweatherclient-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.mallorcasoftware.openweatherclient.*;
import com.mallorcasoftware.openweatherclient.auth.*;
import com.mallorcasoftware.openweatherclient.model.*;
import com.mallorcasoftware.openweatherclient.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: UserSecurity
        ApiKeyAuth UserSecurity = (ApiKeyAuth) defaultClient.getAuthentication("UserSecurity");
        UserSecurity.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //UserSecurity.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        String q = "q_example"; // String | By city name
        String id = "id_example"; // String | By city id
        try {
            CurrentWeatherDataResponse result = apiInstance.getCurrentWeatherData(q, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCurrentWeatherData");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://api.openweathermap.org/data/2.5*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**getCurrentWeatherData**](docs/DefaultApi.md#getCurrentWeatherData) | **GET** /weather | 


## Documentation for Models

 - [CurrentWeatherDataResponse](docs/CurrentWeatherDataResponse.md)
 - [CurrentWeatherDataResponseCloudsDto](docs/CurrentWeatherDataResponseCloudsDto.md)
 - [CurrentWeatherDataResponseMainDto](docs/CurrentWeatherDataResponseMainDto.md)
 - [CurrentWeatherDataResponseRainDto](docs/CurrentWeatherDataResponseRainDto.md)
 - [CurrentWeatherDataResponseSnowDto](docs/CurrentWeatherDataResponseSnowDto.md)
 - [CurrentWeatherDataResponseSysDto](docs/CurrentWeatherDataResponseSysDto.md)
 - [CurrentWeatherDataResponseWeatherDto](docs/CurrentWeatherDataResponseWeatherDto.md)
 - [CurrentWeatherDataResponseWindDto](docs/CurrentWeatherDataResponseWindDto.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### UserSecurity

- **Type**: API key
- **API key parameter name**: APPID
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author

MallorcaSoftware