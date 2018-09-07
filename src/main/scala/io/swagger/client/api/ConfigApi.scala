/**
 * Looker API 3.0 Reference
 * ### Authorization  The Looker API uses Looker **API3** credentials for authorization and access control. Looker admins can create API3 credentials on Looker's **Admin/Users** page. Pass API3 credentials to the **_/login** endpoint to obtain a temporary access_token. Include that access_token in the Authorization header of Looker API requests. For details, see [Looker API Authorization](https://looker.com/docs/r/api/authorization)  ### Client SDKs  The Looker API is a RESTful system that should be usable by any programming language capable of making HTTPS requests. Client SDKs for a variety of programming languages can be generated from the Looker API's Swagger JSON metadata to streamline use of the Looker API in your applications. A client SDK for Ruby is available as an example. For more information, see [Looker API Client SDKs](https://looker.com/docs/r/api/client_sdks)  ### Try It Out!  The 'api-docs' page served by the Looker instance includes 'Try It Out!' buttons for each API method. After logging in with API3 credentials, you can use the \"Try It Out!\" buttons to call the API directly from the documentation page to interactively explore API features and responses.  ### Versioning  Future releases of Looker will expand this API release-by-release to securely expose more and more of the core power of Looker to API client applications. API endpoints marked as \"beta\" may receive breaking changes without warning. Stable (non-beta) API endpoints should not receive breaking changes in future releases. For more information, see [Looker API Versioning](https://looker.com/docs/r/api/versioning) 
 *
 * OpenAPI spec version: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.ApiVersion
import io.swagger.client.model.BackupConfiguration
import io.swagger.client.model.Error
import io.swagger.client.model.LegacyFeature
import io.swagger.client.model.Timezone
import io.swagger.client.model.ValidationError
import io.swagger.client.model.WhitelabelConfiguration
import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class ConfigApi(
  val defBasePath: String = "https://hoopla.eu.looker.com:19999/api/3.0",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new ConfigApiAsyncHelper(client, config)

  /**
   * Get All Legacy Features
   * ### Get all legacy features. 
   *
   * @return List[LegacyFeature]
   */
  def allLegacyFeatures(): Option[List[LegacyFeature]] = {
    val await = Try(Await.result(allLegacyFeaturesAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Legacy Features asynchronously
   * ### Get all legacy features. 
   *
   * @return Future(List[LegacyFeature])
   */
  def allLegacyFeaturesAsync(): Future[List[LegacyFeature]] = {
      helper.allLegacyFeatures()
  }

  /**
   * Get All Timezones
   * ### Get a list of timezones that Looker supports (e.g. useful for scheduling tasks). 
   *
   * @return List[Timezone]
   */
  def allTimezones(): Option[List[Timezone]] = {
    val await = Try(Await.result(allTimezonesAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Timezones asynchronously
   * ### Get a list of timezones that Looker supports (e.g. useful for scheduling tasks). 
   *
   * @return Future(List[Timezone])
   */
  def allTimezonesAsync(): Future[List[Timezone]] = {
      helper.allTimezones()
  }

  /**
   * Get Backup Configuration
   * ### Get the current Looker internal database backup configuration. 
   *
   * @return BackupConfiguration
   */
  def backupConfiguration(): Option[BackupConfiguration] = {
    val await = Try(Await.result(backupConfigurationAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Backup Configuration asynchronously
   * ### Get the current Looker internal database backup configuration. 
   *
   * @return Future(BackupConfiguration)
   */
  def backupConfigurationAsync(): Future[BackupConfiguration] = {
      helper.backupConfiguration()
  }

  /**
   * Get Legacy Feature
   * ### Get information about the legacy feature with a specific id. 
   *
   * @param legacyFeatureId id of legacy feature 
   * @return LegacyFeature
   */
  def legacyFeature(legacyFeatureId: Long): Option[LegacyFeature] = {
    val await = Try(Await.result(legacyFeatureAsync(legacyFeatureId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Legacy Feature asynchronously
   * ### Get information about the legacy feature with a specific id. 
   *
   * @param legacyFeatureId id of legacy feature 
   * @return Future(LegacyFeature)
   */
  def legacyFeatureAsync(legacyFeatureId: Long): Future[LegacyFeature] = {
      helper.legacyFeature(legacyFeatureId)
  }

  /**
   * Update Backup Configuration
   * ### Update the Looker internal database backup configuration. 
   *
   * @param body Options for Backup Configuration 
   * @return BackupConfiguration
   */
  def updateBackupConfiguration(body: BackupConfiguration): Option[BackupConfiguration] = {
    val await = Try(Await.result(updateBackupConfigurationAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update Backup Configuration asynchronously
   * ### Update the Looker internal database backup configuration. 
   *
   * @param body Options for Backup Configuration 
   * @return Future(BackupConfiguration)
   */
  def updateBackupConfigurationAsync(body: BackupConfiguration): Future[BackupConfiguration] = {
      helper.updateBackupConfiguration(body)
  }

  /**
   * Update Legacy Feature
   * ### Update information about the legacy feature with a specific id. 
   *
   * @param legacyFeatureId id of legacy feature 
   * @param body Legacy Feature 
   * @return LegacyFeature
   */
  def updateLegacyFeature(legacyFeatureId: Long, body: LegacyFeature): Option[LegacyFeature] = {
    val await = Try(Await.result(updateLegacyFeatureAsync(legacyFeatureId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update Legacy Feature asynchronously
   * ### Update information about the legacy feature with a specific id. 
   *
   * @param legacyFeatureId id of legacy feature 
   * @param body Legacy Feature 
   * @return Future(LegacyFeature)
   */
  def updateLegacyFeatureAsync(legacyFeatureId: Long, body: LegacyFeature): Future[LegacyFeature] = {
      helper.updateLegacyFeature(legacyFeatureId, body)
  }

  /**
   * Update Whitelabel configuration
   * ### Update the whitelabel configuration 
   *
   * @param body Whitelabel configuration 
   * @return WhitelabelConfiguration
   */
  def updateWhitelabelConfiguration(body: WhitelabelConfiguration): Option[WhitelabelConfiguration] = {
    val await = Try(Await.result(updateWhitelabelConfigurationAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update Whitelabel configuration asynchronously
   * ### Update the whitelabel configuration 
   *
   * @param body Whitelabel configuration 
   * @return Future(WhitelabelConfiguration)
   */
  def updateWhitelabelConfigurationAsync(body: WhitelabelConfiguration): Future[WhitelabelConfiguration] = {
      helper.updateWhitelabelConfiguration(body)
  }

  /**
   * Get ApiVersion
   * ### Get information about all API versions supported by this Looker instance. 
   *
   * @param fields Requested fields. (optional)
   * @return ApiVersion
   */
  def versions(fields: Option[String] = None): Option[ApiVersion] = {
    val await = Try(Await.result(versionsAsync(fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get ApiVersion asynchronously
   * ### Get information about all API versions supported by this Looker instance. 
   *
   * @param fields Requested fields. (optional)
   * @return Future(ApiVersion)
   */
  def versionsAsync(fields: Option[String] = None): Future[ApiVersion] = {
      helper.versions(fields)
  }

  /**
   * Get Whitelabel configuration
   * ### This feature is enabled only by special license. ### Gets the whitelabel configuration, which includes hiding documentation links, custom favicon uploading, etc. 
   *
   * @param fields Requested fields. (optional)
   * @return WhitelabelConfiguration
   */
  def whitelabelConfiguration(fields: Option[String] = None): Option[WhitelabelConfiguration] = {
    val await = Try(Await.result(whitelabelConfigurationAsync(fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Whitelabel configuration asynchronously
   * ### This feature is enabled only by special license. ### Gets the whitelabel configuration, which includes hiding documentation links, custom favicon uploading, etc. 
   *
   * @param fields Requested fields. (optional)
   * @return Future(WhitelabelConfiguration)
   */
  def whitelabelConfigurationAsync(fields: Option[String] = None): Future[WhitelabelConfiguration] = {
      helper.whitelabelConfiguration(fields)
  }

}

class ConfigApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def allLegacyFeatures()(implicit reader: ClientResponseReader[List[LegacyFeature]]): Future[List[LegacyFeature]] = {
    // create path and map variables
    val path = (addFmt("/legacy_features"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def allTimezones()(implicit reader: ClientResponseReader[List[Timezone]]): Future[List[Timezone]] = {
    // create path and map variables
    val path = (addFmt("/timezones"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def backupConfiguration()(implicit reader: ClientResponseReader[BackupConfiguration]): Future[BackupConfiguration] = {
    // create path and map variables
    val path = (addFmt("/backup_configuration"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def legacyFeature(legacyFeatureId: Long)(implicit reader: ClientResponseReader[LegacyFeature]): Future[LegacyFeature] = {
    // create path and map variables
    val path = (addFmt("/legacy_features/{legacy_feature_id}")
      replaceAll("\\{" + "legacy_feature_id" + "\\}", legacyFeatureId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateBackupConfiguration(body: BackupConfiguration)(implicit reader: ClientResponseReader[BackupConfiguration], writer: RequestWriter[BackupConfiguration]): Future[BackupConfiguration] = {
    // create path and map variables
    val path = (addFmt("/backup_configuration"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ConfigApi->updateBackupConfiguration")

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateLegacyFeature(legacyFeatureId: Long,
    body: LegacyFeature)(implicit reader: ClientResponseReader[LegacyFeature], writer: RequestWriter[LegacyFeature]): Future[LegacyFeature] = {
    // create path and map variables
    val path = (addFmt("/legacy_features/{legacy_feature_id}")
      replaceAll("\\{" + "legacy_feature_id" + "\\}", legacyFeatureId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ConfigApi->updateLegacyFeature")

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateWhitelabelConfiguration(body: WhitelabelConfiguration)(implicit reader: ClientResponseReader[WhitelabelConfiguration], writer: RequestWriter[WhitelabelConfiguration]): Future[WhitelabelConfiguration] = {
    // create path and map variables
    val path = (addFmt("/whitelabel_configuration"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ConfigApi->updateWhitelabelConfiguration")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def versions(fields: Option[String] = None
    )(implicit reader: ClientResponseReader[ApiVersion]): Future[ApiVersion] = {
    // create path and map variables
    val path = (addFmt("/versions"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def whitelabelConfiguration(fields: Option[String] = None
    )(implicit reader: ClientResponseReader[WhitelabelConfiguration]): Future[WhitelabelConfiguration] = {
    // create path and map variables
    val path = (addFmt("/whitelabel_configuration"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
