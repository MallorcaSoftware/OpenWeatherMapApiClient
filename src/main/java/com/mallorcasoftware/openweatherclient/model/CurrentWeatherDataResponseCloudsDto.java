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
 * CurrentWeatherDataResponseCloudsDto
 */

public class CurrentWeatherDataResponseCloudsDto   {
  @SerializedName("all")
  private Integer all = null;

  public CurrentWeatherDataResponseCloudsDto all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * Get all
   * @return all
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentWeatherDataResponseCloudsDto currentWeatherDataResponseCloudsDto = (CurrentWeatherDataResponseCloudsDto) o;
    return Objects.equals(this.all, currentWeatherDataResponseCloudsDto.all);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentWeatherDataResponseCloudsDto {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
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

