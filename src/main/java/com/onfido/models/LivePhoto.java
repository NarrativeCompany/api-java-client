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


/**
 * LivePhoto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-08T15:56:57.777Z")
public class LivePhoto   {
  @SerializedName("id")
  private String id = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("applicant_id")
  private String applicantId = null;

  @SerializedName("href")
  private String href = null;

  @SerializedName("download_href")
  private String downloadHref = null;

  @SerializedName("file_name")
  private String fileName = null;

  @SerializedName("file_size")
  private Integer fileSize = null;

  @SerializedName("file_type")
  private String fileType = null;

  public LivePhoto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The unique identifier for the document.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The unique identifier for the document.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LivePhoto createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time at which the document was uploaded.
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "The date and time at which the document was uploaded.")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LivePhoto applicantId(String applicantId) {
    this.applicantId = applicantId;
    return this;
  }

   /**
   * The id of the applicant the live photo belongs to.
   * @return applicantId
  **/
  @ApiModelProperty(example = "null", value = "The id of the applicant the live photo belongs to.")
  public String getApplicantId() {
    return applicantId;
  }

  public void setApplicantId(String applicantId) {
    this.applicantId = applicantId;
  }

  public LivePhoto href(String href) {
    this.href = href;
    return this;
  }

   /**
   * The uri of this resource.
   * @return href
  **/
  @ApiModelProperty(example = "null", value = "The uri of this resource.")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public LivePhoto downloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
    return this;
  }

   /**
   * The uri that can be used to download the document.
   * @return downloadHref
  **/
  @ApiModelProperty(example = "null", value = "The uri that can be used to download the document.")
  public String getDownloadHref() {
    return downloadHref;
  }

  public void setDownloadHref(String downloadHref) {
    this.downloadHref = downloadHref;
  }

  public LivePhoto fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * The name of the uploaded file.
   * @return fileName
  **/
  @ApiModelProperty(example = "null", value = "The name of the uploaded file.")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public LivePhoto fileSize(Integer fileSize) {
    this.fileSize = fileSize;
    return this;
  }

   /**
   * The size of the file in bytes.
   * @return fileSize
  **/
  @ApiModelProperty(example = "null", value = "The size of the file in bytes.")
  public Integer getFileSize() {
    return fileSize;
  }

  public void setFileSize(Integer fileSize) {
    this.fileSize = fileSize;
  }

  public LivePhoto fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }

   /**
   * The file type of the uploaded file.
   * @return fileType
  **/
  @ApiModelProperty(example = "null", value = "The file type of the uploaded file.")
  public String getFileType() {
    return fileType;
  }

  public void setFileType(String fileType) {
    this.fileType = fileType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LivePhoto livePhoto = (LivePhoto) o;
    return Objects.equals(this.id, livePhoto.id) &&
        Objects.equals(this.createdAt, livePhoto.createdAt) &&
        Objects.equals(this.applicantId, livePhoto.applicantId) &&
        Objects.equals(this.href, livePhoto.href) &&
        Objects.equals(this.downloadHref, livePhoto.downloadHref) &&
        Objects.equals(this.fileName, livePhoto.fileName) &&
        Objects.equals(this.fileSize, livePhoto.fileSize) &&
        Objects.equals(this.fileType, livePhoto.fileType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, applicantId, href, downloadHref, fileName, fileSize, fileType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LivePhoto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    applicantId: ").append(toIndentedString(applicantId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    downloadHref: ").append(toIndentedString(downloadHref)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
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

