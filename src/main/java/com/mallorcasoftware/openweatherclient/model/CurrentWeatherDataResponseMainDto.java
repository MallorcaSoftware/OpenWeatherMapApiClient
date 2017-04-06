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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * CurrentWeatherDataResponseMainDto
 */

public class CurrentWeatherDataResponseMainDto   {
  @SerializedName("temp")
  private Double temp = null;

  @SerializedName("pressure")
  private Integer pressure = null;

  @SerializedName("humidity")
  private Integer humidity = null;

  @SerializedName("temp_min")
  private Double tempMin = null;

  @SerializedName("temp_max")
  private Double tempMax = null;

  public CurrentWeatherDataResponseMainDto temp(Double temp) {
    this.temp = temp;
    return this;
  }

   /**
   * Get temp
   * @return temp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTemp() {
    return temp;
  }

  public void setTemp(Double temp) {
    this.temp = temp;
  }

  public CurrentWeatherDataResponseMainDto pressure(Integer pressure) {
    this.pressure = pressure;
    return this;
  }

   /**
   * Get pressure
   * @return pressure
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPressure() {
    return pressure;
  }

  public void setPressure(Integer pressure) {
    this.pressure = pressure;
  }

  public CurrentWeatherDataResponseMainDto humidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }

   /**
   * Get humidity
   * @return humidity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getHumidity() {
    return humidity;
  }

  public void setHumidity(Integer humidity) {
    this.humidity = humidity;
  }

  public CurrentWeatherDataResponseMainDto tempMin(Double tempMin) {
    this.tempMin = tempMin;
    return this;
  }

   /**
   * Get tempMin
   * @return tempMin
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTempMin() {
    return tempMin;
  }

  public void setTempMin(Double tempMin) {
    this.tempMin = tempMin;
  }

  public CurrentWeatherDataResponseMainDto tempMax(Double tempMax) {
    this.tempMax = tempMax;
    return this;
  }

   /**
   * Get tempMax
   * @return tempMax
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getTempMax() {
    return tempMax;
  }

  public void setTempMax(Double tempMax) {
    this.tempMax = tempMax;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentWeatherDataResponseMainDto currentWeatherDataResponseMainDto = (CurrentWeatherDataResponseMainDto) o;
    return Objects.equals(this.temp, currentWeatherDataResponseMainDto.temp) &&
        Objects.equals(this.pressure, currentWeatherDataResponseMainDto.pressure) &&
        Objects.equals(this.humidity, currentWeatherDataResponseMainDto.humidity) &&
        Objects.equals(this.tempMin, currentWeatherDataResponseMainDto.tempMin) &&
        Objects.equals(this.tempMax, currentWeatherDataResponseMainDto.tempMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(temp, pressure, humidity, tempMin, tempMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentWeatherDataResponseMainDto {\n");
    
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    pressure: ").append(toIndentedString(pressure)).append("\n");
    sb.append("    humidity: ").append(toIndentedString(humidity)).append("\n");
    sb.append("    tempMin: ").append(toIndentedString(tempMin)).append("\n");
    sb.append("    tempMax: ").append(toIndentedString(tempMax)).append("\n");
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

