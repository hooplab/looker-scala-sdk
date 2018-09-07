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

import io.swagger.client.model.ContentFavorite
import io.swagger.client.model.ContentMeta
import io.swagger.client.model.ContentMetaGroupUser
import io.swagger.client.model.ContentView
import io.swagger.client.model.Error
import io.swagger.client.model.ValidationError
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

class ContentApi(
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
  val helper = new ContentApiAsyncHelper(client, config)

  /**
   * Get All Content Metadata Accesss
   * ### All content metadata access records for a content metadata item. 
   *
   * @param contentMetadataId Id of content metadata (optional)
   * @param fields Requested fields. (optional)
   * @return List[ContentMetaGroupUser]
   */
  def allContentMetadataAccesss(contentMetadataId: Option[Long] = None, fields: Option[String] = None): Option[List[ContentMetaGroupUser]] = {
    val await = Try(Await.result(allContentMetadataAccesssAsync(contentMetadataId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Content Metadata Accesss asynchronously
   * ### All content metadata access records for a content metadata item. 
   *
   * @param contentMetadataId Id of content metadata (optional)
   * @param fields Requested fields. (optional)
   * @return Future(List[ContentMetaGroupUser])
   */
  def allContentMetadataAccesssAsync(contentMetadataId: Option[Long] = None, fields: Option[String] = None): Future[List[ContentMetaGroupUser]] = {
      helper.allContentMetadataAccesss(contentMetadataId, fields)
  }

  /**
   * Get All Content Metadatas
   * ### Get information about all content metadata in a space. 
   *
   * @param parentId Parent space of content. 
   * @param fields Requested fields. (optional)
   * @return List[ContentMeta]
   */
  def allContentMetadatas(parentId: Long, fields: Option[String] = None): Option[List[ContentMeta]] = {
    val await = Try(Await.result(allContentMetadatasAsync(parentId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Content Metadatas asynchronously
   * ### Get information about all content metadata in a space. 
   *
   * @param parentId Parent space of content. 
   * @param fields Requested fields. (optional)
   * @return Future(List[ContentMeta])
   */
  def allContentMetadatasAsync(parentId: Long, fields: Option[String] = None): Future[List[ContentMeta]] = {
      helper.allContentMetadatas(parentId, fields)
  }

  /**
   * Get Favorite Content
   * ### Get favorite content by its id
   *
   * @param contentFavoriteId Id of favorite content 
   * @param fields Requested fields. (optional)
   * @return ContentFavorite
   */
  def contentFavorite(contentFavoriteId: Long, fields: Option[String] = None): Option[ContentFavorite] = {
    val await = Try(Await.result(contentFavoriteAsync(contentFavoriteId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Favorite Content asynchronously
   * ### Get favorite content by its id
   *
   * @param contentFavoriteId Id of favorite content 
   * @param fields Requested fields. (optional)
   * @return Future(ContentFavorite)
   */
  def contentFavoriteAsync(contentFavoriteId: Long, fields: Option[String] = None): Future[ContentFavorite] = {
      helper.contentFavorite(contentFavoriteId, fields)
  }

  /**
   * Get Content Metadata
   * ### Get information about an individual content metadata record. 
   *
   * @param contentMetadataId Id of content metadata 
   * @param fields Requested fields. (optional)
   * @return ContentMeta
   */
  def contentMetadata(contentMetadataId: Long, fields: Option[String] = None): Option[ContentMeta] = {
    val await = Try(Await.result(contentMetadataAsync(contentMetadataId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Content Metadata asynchronously
   * ### Get information about an individual content metadata record. 
   *
   * @param contentMetadataId Id of content metadata 
   * @param fields Requested fields. (optional)
   * @return Future(ContentMeta)
   */
  def contentMetadataAsync(contentMetadataId: Long, fields: Option[String] = None): Future[ContentMeta] = {
      helper.contentMetadata(contentMetadataId, fields)
  }

  /**
   * Create Favorite Content
   * ### Create favorite content
   *
   * @param body Favorite Content (optional)
   * @return ContentFavorite
   */
  def createContentFavorite(body: Option[ContentFavorite] = None): Option[ContentFavorite] = {
    val await = Try(Await.result(createContentFavoriteAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create Favorite Content asynchronously
   * ### Create favorite content
   *
   * @param body Favorite Content (optional)
   * @return Future(ContentFavorite)
   */
  def createContentFavoriteAsync(body: Option[ContentFavorite] = None): Future[ContentFavorite] = {
      helper.createContentFavorite(body)
  }

  /**
   * Create Content Metadata Access
   * ### Create content metadata access. 
   *
   * @param body Content Metadata Access (optional)
   * @return ContentMetaGroupUser
   */
  def createContentMetadataAccess(body: Option[ContentMetaGroupUser] = None): Option[ContentMetaGroupUser] = {
    val await = Try(Await.result(createContentMetadataAccessAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create Content Metadata Access asynchronously
   * ### Create content metadata access. 
   *
   * @param body Content Metadata Access (optional)
   * @return Future(ContentMetaGroupUser)
   */
  def createContentMetadataAccessAsync(body: Option[ContentMetaGroupUser] = None): Future[ContentMetaGroupUser] = {
      helper.createContentMetadataAccess(body)
  }

  /**
   * Delete Favorite Content
   * ### Delete favorite content
   *
   * @param contentFavoriteId Id of favorite content 
   * @return String
   */
  def deleteContentFavorite(contentFavoriteId: Long): Option[String] = {
    val await = Try(Await.result(deleteContentFavoriteAsync(contentFavoriteId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete Favorite Content asynchronously
   * ### Delete favorite content
   *
   * @param contentFavoriteId Id of favorite content 
   * @return Future(String)
   */
  def deleteContentFavoriteAsync(contentFavoriteId: Long): Future[String] = {
      helper.deleteContentFavorite(contentFavoriteId)
  }

  /**
   * Delete Content Metadata Access
   * ### Remove content metadata access. 
   *
   * @param contentMetadataAccessId Id of content metadata access 
   * @return String
   */
  def deleteContentMetadataAccess(contentMetadataAccessId: Long): Option[String] = {
    val await = Try(Await.result(deleteContentMetadataAccessAsync(contentMetadataAccessId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete Content Metadata Access asynchronously
   * ### Remove content metadata access. 
   *
   * @param contentMetadataAccessId Id of content metadata access 
   * @return Future(String)
   */
  def deleteContentMetadataAccessAsync(contentMetadataAccessId: Long): Future[String] = {
      helper.deleteContentMetadataAccess(contentMetadataAccessId)
  }

  /**
   * Search Favorite Contents
   * ### Search Favorite Content 
   *
   * @param userId Match User Id (optional)
   * @param limit Number of results to return. (used with offset) (optional)
   * @param offset Number of results to skip before returning any. (used with limit) (optional)
   * @param sorts Fields to sort by. (optional)
   * @param fields Requested fields. (optional)
   * @return List[ContentFavorite]
   */
  def searchContentFavorites(userId: Option[Long] = None, limit: Option[Long] = None, offset: Option[Long] = None, sorts: Option[String] = None, fields: Option[String] = None): Option[List[ContentFavorite]] = {
    val await = Try(Await.result(searchContentFavoritesAsync(userId, limit, offset, sorts, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Search Favorite Contents asynchronously
   * ### Search Favorite Content 
   *
   * @param userId Match User Id (optional)
   * @param limit Number of results to return. (used with offset) (optional)
   * @param offset Number of results to skip before returning any. (used with limit) (optional)
   * @param sorts Fields to sort by. (optional)
   * @param fields Requested fields. (optional)
   * @return Future(List[ContentFavorite])
   */
  def searchContentFavoritesAsync(userId: Option[Long] = None, limit: Option[Long] = None, offset: Option[Long] = None, sorts: Option[String] = None, fields: Option[String] = None): Future[List[ContentFavorite]] = {
      helper.searchContentFavorites(userId, limit, offset, sorts, fields)
  }

  /**
   * Search Content Views
   * ### Search Content View 
   *
   * @param viewCount Match view count (optional)
   * @param groupId Match Group Id (optional)
   * @param lookId Match look_id (optional)
   * @param dashboardId Match dashboard_id (optional)
   * @param contentMetadataId Match content metadata id (optional)
   * @param startOfWeekDate Match start of week date (optional)
   * @param allTime True if only all time view records should be returned (optional)
   * @param userId Match user id (optional)
   * @param limit Number of results to return. Use with &#x60;offset&#x60; to manage pagination of results (optional)
   * @param offset Number of results to skip before returning data (optional)
   * @param sorts Fields to sort by (optional)
   * @param fields Requested fields. (optional)
   * @return List[ContentView]
   */
  def searchContentViews(viewCount: Option[Long] = None, groupId: Option[Long] = None, lookId: Option[String] = None, dashboardId: Option[String] = None, contentMetadataId: Option[Long] = None, startOfWeekDate: Option[String] = None, allTime: Option[Boolean] = None, userId: Option[Long] = None, limit: Option[Long] = None, offset: Option[Long] = None, sorts: Option[String] = None, fields: Option[String] = None): Option[List[ContentView]] = {
    val await = Try(Await.result(searchContentViewsAsync(viewCount, groupId, lookId, dashboardId, contentMetadataId, startOfWeekDate, allTime, userId, limit, offset, sorts, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Search Content Views asynchronously
   * ### Search Content View 
   *
   * @param viewCount Match view count (optional)
   * @param groupId Match Group Id (optional)
   * @param lookId Match look_id (optional)
   * @param dashboardId Match dashboard_id (optional)
   * @param contentMetadataId Match content metadata id (optional)
   * @param startOfWeekDate Match start of week date (optional)
   * @param allTime True if only all time view records should be returned (optional)
   * @param userId Match user id (optional)
   * @param limit Number of results to return. Use with &#x60;offset&#x60; to manage pagination of results (optional)
   * @param offset Number of results to skip before returning data (optional)
   * @param sorts Fields to sort by (optional)
   * @param fields Requested fields. (optional)
   * @return Future(List[ContentView])
   */
  def searchContentViewsAsync(viewCount: Option[Long] = None, groupId: Option[Long] = None, lookId: Option[String] = None, dashboardId: Option[String] = None, contentMetadataId: Option[Long] = None, startOfWeekDate: Option[String] = None, allTime: Option[Boolean] = None, userId: Option[Long] = None, limit: Option[Long] = None, offset: Option[Long] = None, sorts: Option[String] = None, fields: Option[String] = None): Future[List[ContentView]] = {
      helper.searchContentViews(viewCount, groupId, lookId, dashboardId, contentMetadataId, startOfWeekDate, allTime, userId, limit, offset, sorts, fields)
  }

  /**
   * Update Content Metadata
   * ### Move a piece of content. 
   *
   * @param contentMetadataId Id of content metadata 
   * @param body Content Metadata 
   * @return ContentMeta
   */
  def updateContentMetadata(contentMetadataId: Long, body: ContentMeta): Option[ContentMeta] = {
    val await = Try(Await.result(updateContentMetadataAsync(contentMetadataId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update Content Metadata asynchronously
   * ### Move a piece of content. 
   *
   * @param contentMetadataId Id of content metadata 
   * @param body Content Metadata 
   * @return Future(ContentMeta)
   */
  def updateContentMetadataAsync(contentMetadataId: Long, body: ContentMeta): Future[ContentMeta] = {
      helper.updateContentMetadata(contentMetadataId, body)
  }

  /**
   * Update Content Metadata Access
   * ### Update type of access for content metadata. 
   *
   * @param contentMetadataAccessId Id of content metadata access 
   * @param body Content Metadata Access 
   * @return ContentMetaGroupUser
   */
  def updateContentMetadataAccess(contentMetadataAccessId: Long, body: ContentMetaGroupUser): Option[ContentMetaGroupUser] = {
    val await = Try(Await.result(updateContentMetadataAccessAsync(contentMetadataAccessId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update Content Metadata Access asynchronously
   * ### Update type of access for content metadata. 
   *
   * @param contentMetadataAccessId Id of content metadata access 
   * @param body Content Metadata Access 
   * @return Future(ContentMetaGroupUser)
   */
  def updateContentMetadataAccessAsync(contentMetadataAccessId: Long, body: ContentMetaGroupUser): Future[ContentMetaGroupUser] = {
      helper.updateContentMetadataAccess(contentMetadataAccessId, body)
  }

}

class ContentApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def allContentMetadataAccesss(contentMetadataId: Option[Long] = None,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[List[ContentMetaGroupUser]]): Future[List[ContentMetaGroupUser]] = {
    // create path and map variables
    val path = (addFmt("/content_metadata_access"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    contentMetadataId match {
      case Some(param) => queryParams += "content_metadata_id" -> param.toString
      case _ => queryParams
    }
    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def allContentMetadatas(parentId: Long,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[List[ContentMeta]]): Future[List[ContentMeta]] = {
    // create path and map variables
    val path = (addFmt("/content_metadata"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    queryParams += "parent_id" -> parentId.toString
    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def contentFavorite(contentFavoriteId: Long,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[ContentFavorite]): Future[ContentFavorite] = {
    // create path and map variables
    val path = (addFmt("/content_favorite/{content_favorite_id}")
      replaceAll("\\{" + "content_favorite_id" + "\\}", contentFavoriteId.toString))

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

  def contentMetadata(contentMetadataId: Long,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[ContentMeta]): Future[ContentMeta] = {
    // create path and map variables
    val path = (addFmt("/content_metadata/{content_metadata_id}")
      replaceAll("\\{" + "content_metadata_id" + "\\}", contentMetadataId.toString))

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

  def createContentFavorite(body: Option[ContentFavorite] = None
    )(implicit reader: ClientResponseReader[ContentFavorite], writer: RequestWriter[Option[ContentFavorite]]): Future[ContentFavorite] = {
    // create path and map variables
    val path = (addFmt("/content_favorite"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createContentMetadataAccess(body: Option[ContentMetaGroupUser] = None
    )(implicit reader: ClientResponseReader[ContentMetaGroupUser], writer: RequestWriter[Option[ContentMetaGroupUser]]): Future[ContentMetaGroupUser] = {
    // create path and map variables
    val path = (addFmt("/content_metadata_access"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteContentFavorite(contentFavoriteId: Long)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content_favorite/{content_favorite_id}")
      replaceAll("\\{" + "content_favorite_id" + "\\}", contentFavoriteId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteContentMetadataAccess(contentMetadataAccessId: Long)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/content_metadata_access/{content_metadata_access_id}")
      replaceAll("\\{" + "content_metadata_access_id" + "\\}", contentMetadataAccessId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def searchContentFavorites(userId: Option[Long] = None,
    limit: Option[Long] = None,
    offset: Option[Long] = None,
    sorts: Option[String] = None,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[List[ContentFavorite]]): Future[List[ContentFavorite]] = {
    // create path and map variables
    val path = (addFmt("/content_favorite/search"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    userId match {
      case Some(param) => queryParams += "user_id" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    offset match {
      case Some(param) => queryParams += "offset" -> param.toString
      case _ => queryParams
    }
    sorts match {
      case Some(param) => queryParams += "sorts" -> param.toString
      case _ => queryParams
    }
    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def searchContentViews(viewCount: Option[Long] = None,
    groupId: Option[Long] = None,
    lookId: Option[String] = None,
    dashboardId: Option[String] = None,
    contentMetadataId: Option[Long] = None,
    startOfWeekDate: Option[String] = None,
    allTime: Option[Boolean] = None,
    userId: Option[Long] = None,
    limit: Option[Long] = None,
    offset: Option[Long] = None,
    sorts: Option[String] = None,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[List[ContentView]]): Future[List[ContentView]] = {
    // create path and map variables
    val path = (addFmt("/content_view/search"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    viewCount match {
      case Some(param) => queryParams += "view_count" -> param.toString
      case _ => queryParams
    }
    groupId match {
      case Some(param) => queryParams += "group_id" -> param.toString
      case _ => queryParams
    }
    lookId match {
      case Some(param) => queryParams += "look_id" -> param.toString
      case _ => queryParams
    }
    dashboardId match {
      case Some(param) => queryParams += "dashboard_id" -> param.toString
      case _ => queryParams
    }
    contentMetadataId match {
      case Some(param) => queryParams += "content_metadata_id" -> param.toString
      case _ => queryParams
    }
    startOfWeekDate match {
      case Some(param) => queryParams += "start_of_week_date" -> param.toString
      case _ => queryParams
    }
    allTime match {
      case Some(param) => queryParams += "all_time" -> param.toString
      case _ => queryParams
    }
    userId match {
      case Some(param) => queryParams += "user_id" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    offset match {
      case Some(param) => queryParams += "offset" -> param.toString
      case _ => queryParams
    }
    sorts match {
      case Some(param) => queryParams += "sorts" -> param.toString
      case _ => queryParams
    }
    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateContentMetadata(contentMetadataId: Long,
    body: ContentMeta)(implicit reader: ClientResponseReader[ContentMeta], writer: RequestWriter[ContentMeta]): Future[ContentMeta] = {
    // create path and map variables
    val path = (addFmt("/content_metadata/{content_metadata_id}")
      replaceAll("\\{" + "content_metadata_id" + "\\}", contentMetadataId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ContentApi->updateContentMetadata")

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateContentMetadataAccess(contentMetadataAccessId: Long,
    body: ContentMetaGroupUser)(implicit reader: ClientResponseReader[ContentMetaGroupUser], writer: RequestWriter[ContentMetaGroupUser]): Future[ContentMetaGroupUser] = {
    // create path and map variables
    val path = (addFmt("/content_metadata_access/{content_metadata_access_id}")
      replaceAll("\\{" + "content_metadata_access_id" + "\\}", contentMetadataAccessId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling ContentApi->updateContentMetadataAccess")

    val resFuture = client.submit("PUT", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}