/**
 * OpenWeatherMap Client
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.mallorcasoftware.openweatherclient.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.mallorcasoftware.openweatherclient.model.CurrentWeatherDataResponseCloudsDto;
import com.mallorcasoftware.openweatherclient.model.CurrentWeatherDataResponseMainDto;
import com.mallorcasoftware.openweatherclient.model.CurrentWeatherDataResponseRainDto;
import com.mallorcasoftware.openweatherclient.model.CurrentWeatherDataResponseSnowDto;
import com.mallorcasoftware.openweatherclient.model.CurrentWeatherDataResponseWeatherDto;
import com.mallorcasoftware.openweatherclient.model.CurrentWeatherDataResponseWindDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * ForecastDataListItemDto
 */

public class ForecastDataListItemDto   {
  @SerializedName("dt")
  private String dt = null;

  @SerializedName("main")
  private CurrentWeatherDataResponseMainDto main = null;

  @SerializedName("weather")
  private List<CurrentWeatherDataResponseWeatherDto> weather = new ArrayList<CurrentWeatherDataResponseWeatherDto>();

  @SerializedName("wind")
  private CurrentWeatherDataResponseWindDto wind = null;

  @SerializedName("clouds")
  private CurrentWeatherDataResponseCloudsDto clouds = null;

  @SerializedName("rain")
  private CurrentWeatherDataResponseRainDto rain = null;

  @SerializedName("snow")
  private CurrentWeatherDataResponseSnowDto snow = null;

  @SerializedName("dt_txt")
  private String dtTxt = null;

  public ForecastDataListItemDto dt(String dt) {
    this.dt = dt;
    return this;
  }

   /**
   * Get dt
   * @return dt
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDt() {
    return dt;
  }

  public void setDt(String dt) {
    this.dt = dt;
  }

  public ForecastDataListItemDto main(CurrentWeatherDataResponseMainDto main) {
    this.main = main;
    return this;
  }

   /**
   * Get main
   * @return main
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentWeatherDataResponseMainDto getMain() {
    return main;
  }

  public void setMain(CurrentWeatherDataResponseMainDto main) {
    this.main = main;
  }

  public ForecastDataListItemDto weather(List<CurrentWeatherDataResponseWeatherDto> weather) {
    this.weather = weather;
    return this;
  }

  public ForecastDataListItemDto addWeatherItem(CurrentWeatherDataResponseWeatherDto weatherItem) {
    this.weather.add(weatherItem);
    return this;
  }

   /**
   * Get weather
   * @return weather
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<CurrentWeatherDataResponseWeatherDto> getWeather() {
    return weather;
  }

  public void setWeather(List<CurrentWeatherDataResponseWeatherDto> weather) {
    this.weather = weather;
  }

  public ForecastDataListItemDto wind(CurrentWeatherDataResponseWindDto wind) {
    this.wind = wind;
    return this;
  }

   /**
   * Get wind
   * @return wind
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentWeatherDataResponseWindDto getWind() {
    return wind;
  }

  public void setWind(CurrentWeatherDataResponseWindDto wind) {
    this.wind = wind;
  }

  public ForecastDataListItemDto clouds(CurrentWeatherDataResponseCloudsDto clouds) {
    this.clouds = clouds;
    return this;
  }

   /**
   * Get clouds
   * @return clouds
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentWeatherDataResponseCloudsDto getClouds() {
    return clouds;
  }

  public void setClouds(CurrentWeatherDataResponseCloudsDto clouds) {
    this.clouds = clouds;
  }

  public ForecastDataListItemDto rain(CurrentWeatherDataResponseRainDto rain) {
    this.rain = rain;
    return this;
  }

   /**
   * Get rain
   * @return rain
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentWeatherDataResponseRainDto getRain() {
    return rain;
  }

  public void setRain(CurrentWeatherDataResponseRainDto rain) {
    this.rain = rain;
  }

  public ForecastDataListItemDto snow(CurrentWeatherDataResponseSnowDto snow) {
    this.snow = snow;
    return this;
  }

   /**
   * Get snow
   * @return snow
  **/
  @ApiModelProperty(example = "null", value = "")
  public CurrentWeatherDataResponseSnowDto getSnow() {
    return snow;
  }

  public void setSnow(CurrentWeatherDataResponseSnowDto snow) {
    this.snow = snow;
  }

  public ForecastDataListItemDto dtTxt(String dtTxt) {
    this.dtTxt = dtTxt;
    return this;
  }

   /**
   * Get dtTxt
   * @return dtTxt
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDtTxt() {
    return dtTxt;
  }

  public void setDtTxt(String dtTxt) {
    this.dtTxt = dtTxt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ForecastDataListItemDto forecastDataListItemDto = (ForecastDataListItemDto) o;
    return Objects.equals(this.dt, forecastDataListItemDto.dt) &&
        Objects.equals(this.main, forecastDataListItemDto.main) &&
        Objects.equals(this.weather, forecastDataListItemDto.weather) &&
        Objects.equals(this.wind, forecastDataListItemDto.wind) &&
        Objects.equals(this.clouds, forecastDataListItemDto.clouds) &&
        Objects.equals(this.rain, forecastDataListItemDto.rain) &&
        Objects.equals(this.snow, forecastDataListItemDto.snow) &&
        Objects.equals(this.dtTxt, forecastDataListItemDto.dtTxt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dt, main, weather, wind, clouds, rain, snow, dtTxt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForecastDataListItemDto {\n");
    
    sb.append("    dt: ").append(toIndentedString(dt)).append("\n");
    sb.append("    main: ").append(toIndentedString(main)).append("\n");
    sb.append("    weather: ").append(toIndentedString(weather)).append("\n");
    sb.append("    wind: ").append(toIndentedString(wind)).append("\n");
    sb.append("    clouds: ").append(toIndentedString(clouds)).append("\n");
    sb.append("    rain: ").append(toIndentedString(rain)).append("\n");
    sb.append("    snow: ").append(toIndentedString(snow)).append("\n");
    sb.append("    dtTxt: ").append(toIndentedString(dtTxt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

