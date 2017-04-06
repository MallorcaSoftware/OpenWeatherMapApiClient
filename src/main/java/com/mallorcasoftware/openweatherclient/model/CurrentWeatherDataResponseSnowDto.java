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
 * CurrentWeatherDataResponseSnowDto
 */

public class CurrentWeatherDataResponseSnowDto   {
  @SerializedName("3h")
  private Integer _3h = null;

  public CurrentWeatherDataResponseSnowDto _3h(Integer _3h) {
    this._3h = _3h;
    return this;
  }

   /**
   * Get _3h
   * @return _3h
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer get3h() {
    return _3h;
  }

  public void set3h(Integer _3h) {
    this._3h = _3h;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentWeatherDataResponseSnowDto currentWeatherDataResponseSnowDto = (CurrentWeatherDataResponseSnowDto) o;
    return Objects.equals(this._3h, currentWeatherDataResponseSnowDto._3h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_3h);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentWeatherDataResponseSnowDto {\n");
    
    sb.append("    _3h: ").append(toIndentedString(_3h)).append("\n");
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

