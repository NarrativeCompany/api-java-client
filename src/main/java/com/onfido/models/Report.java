/**
 * Onfido API
 * The Onfido API is used to submit check requests.
 *
 * OpenAPI spec version: 2.0.0
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


package com.onfido.models;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


/**
 * Report
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-14T11:19:36.236Z")
public class Report   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("result")
  private String result = null;

  @SerializedName("sub_result")
  private String subResult = null;

  @SerializedName("variant")
  private String variant = null;

  @SerializedName("options")
  private Object options = null;

  @SerializedName("breakdown")
  private Object breakdown = null;

  @SerializedName("properties")
  private Object properties = null;

  @SerializedName("documents")
  private List<Object> documents = new ArrayList<Object>();

   /**
   * The unique identifier for the report.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier for the report.")
  public String getId() {
    return id;
  }

  public Report createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the report was first initiated.
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "The date and time at which the report was first initiated.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Report href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The API endpoint to retrieve the report.
   * @return href
  **/
  @ApiModelProperty(example = "null", value = "The API endpoint to retrieve the report.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Report name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Report type string identifier.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Report type string identifier.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Report status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The current state of the report in the checking process.
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "The current state of the report in the checking process.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Report result(String result) {
    this.result = result;
    return this;
  }

   /**
   * The result of the report.
   * @return result
  **/
  @ApiModelProperty(example = "null", value = "The result of the report.")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Report subResult(String subResult) {
    this.subResult = subResult;
    return this;
  }

   /**
   * The sub_result of the report. It gives a more detailed result for document reports only, and will be null otherwise.
   * @return subResult
  **/
  @ApiModelProperty(example = "null", value = "The sub_result of the report. It gives a more detailed result for document reports only, and will be null otherwise.")
  public String getSubResult() {
    return subResult;
  }

  public void setSubResult(String subResult) {
    this.subResult = subResult;
  }

  public Report variant(String variant) {
    this.variant = variant;
    return this;
  }

   /**
   * Report variant string identifier. Some reports e.g. criminal_history have sub-types, which are identified by this field.
   * @return variant
  **/
  @ApiModelProperty(example = "null", value = "Report variant string identifier. Some reports e.g. criminal_history have sub-types, which are identified by this field.")
  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public Report options(Object options) {
    this.options = options;
    return this;
  }

   /**
   * Report options. Some reports e.g. criminal_history expose additional options.
   * @return options
  **/
  @ApiModelProperty(example = "null", value = "Report options. Some reports e.g. criminal_history expose additional options.")
  public Object getOptions() {
    return options;
  }

  public void setOptions(Object options) {
    this.options = options;
  }

  public Report breakdown(Object breakdown) {
    this.breakdown = breakdown;
    return this;
  }

   /**
   * The details of the report. This is specific to each type of report.
   * @return breakdown
  **/
  @ApiModelProperty(example = "null", value = "The details of the report. This is specific to each type of report.")
  public Object getBreakdown() {
    return breakdown;
  }

  public void setBreakdown(Object breakdown) {
    this.breakdown = breakdown;
  }

  public Report properties(Object properties) {
    this.properties = properties;
    return this;
  }

   /**
   * The properties associated with the report, if any.
   * @return properties
  **/
  @ApiModelProperty(example = "null", value = "The properties associated with the report, if any.")
  public Object getProperties() {
    return properties;
  }

  public void setProperties(Object properties) {
    this.properties = properties;
  }

  public Report documents(List<Object> documents) {
    this.documents = documents;
    return this;
  }

  public Report addDocumentsItem(Object documentsItem) {
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Array of objects with document ids that were used in the Onfido engine. [ONLY USED IN A DOCUMENT CHECK]
   * @return documents
  **/
  @ApiModelProperty(example = "null", value = "Array of objects with document ids that were used in the Onfido engine. [ONLY USED IN A DOCUMENT CHECK]")
  public List<Object> getDocuments() {
    return documents;
  }

  public void setDocuments(List<Object> documents) {
    this.documents = documents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Report report = (Report) o;
    return Objects.equals(this.id, report.id) &&
        Objects.equals(this.createdAt, report.createdAt) &&
        Objects.equals(this.href, report.href) &&
        Objects.equals(this.name, report.name) &&
        Objects.equals(this.status, report.status) &&
        Objects.equals(this.result, report.result) &&
        Objects.equals(this.subResult, report.subResult) &&
        Objects.equals(this.variant, report.variant) &&
        Objects.equals(this.options, report.options) &&
        Objects.equals(this.breakdown, report.breakdown) &&
        Objects.equals(this.properties, report.properties) &&
        Objects.equals(this.documents, report.documents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, href, name, status, result, subResult, variant, options, breakdown, properties, documents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Report {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    subResult: ").append(toIndentedString(subResult)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
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

