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

import io.swagger.client.model.Dashboard
import io.swagger.client.model.DashboardBase
import io.swagger.client.model.Error
import io.swagger.client.model.Prefetch
import io.swagger.client.model.PrefetchDashboardFilterValue
import io.swagger.client.model.PrefetchDashboardRequest
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

class DashboardApi(
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
  val helper = new DashboardApiAsyncHelper(client, config)

  /**
   * Get All Dashboards
   * ### Get information about all active dashboards.  Returns an array of **abbreviated dashboard objects**. Dashboards marked as deleted are excluded from this list.  Get the **full details** of a specific dashboard by id with [Dashboard](#!/Dashboard/dashboard)  Find **deleted dashboards** with [Search Dashboards](#!/Dashboard/search_dashboards) 
   *
   * @param fields Requested fields. (optional)
   * @return List[DashboardBase]
   */
  def allDashboards(fields: Option[String] = None): Option[List[DashboardBase]] = {
    val await = Try(Await.result(allDashboardsAsync(fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Dashboards asynchronously
   * ### Get information about all active dashboards.  Returns an array of **abbreviated dashboard objects**. Dashboards marked as deleted are excluded from this list.  Get the **full details** of a specific dashboard by id with [Dashboard](#!/Dashboard/dashboard)  Find **deleted dashboards** with [Search Dashboards](#!/Dashboard/search_dashboards) 
   *
   * @param fields Requested fields. (optional)
   * @return Future(List[DashboardBase])
   */
  def allDashboardsAsync(fields: Option[String] = None): Future[List[DashboardBase]] = {
      helper.allDashboards(fields)
  }

  /**
   * Create Dashboard
   * ### Create a dashboard with the specified information  Creates a new dashboard object, returning the dashboard details, including the created id.  **Update** an existing dashboard with [Update Dashboard](#!/Dashboard/update_dashboard)  **Permanently delete** an existing dashboard with [Delete Dashboard](#!/Dashboard/delete_dashboard) 
   *
   * @param body Dashboard (optional)
   * @return Dashboard
   */
  def createDashboard(body: Option[Dashboard] = None): Option[Dashboard] = {
    val await = Try(Await.result(createDashboardAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create Dashboard asynchronously
   * ### Create a dashboard with the specified information  Creates a new dashboard object, returning the dashboard details, including the created id.  **Update** an existing dashboard with [Update Dashboard](#!/Dashboard/update_dashboard)  **Permanently delete** an existing dashboard with [Delete Dashboard](#!/Dashboard/delete_dashboard) 
   *
   * @param body Dashboard (optional)
   * @return Future(Dashboard)
   */
  def createDashboardAsync(body: Option[Dashboard] = None): Future[Dashboard] = {
      helper.createDashboard(body)
  }

  /**
   * Create Dashboard Prefetch
   * ### Create a prefetch for a dashboard with the specified information.  **Deprecated** Use [DataGroups](#!/Datagroup) to manage cache invalidation of groups of queries. 
   *
   * @param dashboardId Id of dashboard 
   * @param body Parameters for prefetch request (optional)
   * @return PrefetchDashboardRequest
   */
  def createDashboardPrefetch(dashboardId: String, body: Option[PrefetchDashboardRequest] = None): Option[PrefetchDashboardRequest] = {
    val await = Try(Await.result(createDashboardPrefetchAsync(dashboardId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create Dashboard Prefetch asynchronously
   * ### Create a prefetch for a dashboard with the specified information.  **Deprecated** Use [DataGroups](#!/Datagroup) to manage cache invalidation of groups of queries. 
   *
   * @param dashboardId Id of dashboard 
   * @param body Parameters for prefetch request (optional)
   * @return Future(PrefetchDashboardRequest)
   */
  def createDashboardPrefetchAsync(dashboardId: String, body: Option[PrefetchDashboardRequest] = None): Future[PrefetchDashboardRequest] = {
      helper.createDashboardPrefetch(dashboardId, body)
  }

  /**
   * Get Dashboard
   * ### Get information about the dashboard with the specified id  Returns the full details of the identified dashboard object  Get a **summary list** of all active dashboards with [All Dashboards](#!/Dashboard/all_dashboards)  **Search** for dashboards with [Search Dashboards](#!/Dashboard/search_dashboards) 
   *
   * @param dashboardId Id of dashboard 
   * @param fields Requested fields. (optional)
   * @return Dashboard
   */
  def dashboard(dashboardId: String, fields: Option[String] = None): Option[Dashboard] = {
    val await = Try(Await.result(dashboardAsync(dashboardId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Dashboard asynchronously
   * ### Get information about the dashboard with the specified id  Returns the full details of the identified dashboard object  Get a **summary list** of all active dashboards with [All Dashboards](#!/Dashboard/all_dashboards)  **Search** for dashboards with [Search Dashboards](#!/Dashboard/search_dashboards) 
   *
   * @param dashboardId Id of dashboard 
   * @param fields Requested fields. (optional)
   * @return Future(Dashboard)
   */
  def dashboardAsync(dashboardId: String, fields: Option[String] = None): Future[Dashboard] = {
      helper.dashboard(dashboardId, fields)
  }

  /**
   * Get Dashboard Prefetch
   * ### Get a prefetch for a dashboard with the specified information.  **Deprecated** Use [DataGroups](#!/Datagroup) to manage cache invalidation of groups of queries. 
   *
   * @param dashboardId Id of dashboard 
   * @param dashboardFilters JSON encoded string of Dashboard filters that were applied to prefetch (optional)
   * @return Prefetch
   */
  def dashboardPrefetch(dashboardId: String, dashboardFilters: Option[List[PrefetchDashboardFilterValue]] = None): Option[Prefetch] = {
    val await = Try(Await.result(dashboardPrefetchAsync(dashboardId, dashboardFilters), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Dashboard Prefetch asynchronously
   * ### Get a prefetch for a dashboard with the specified information.  **Deprecated** Use [DataGroups](#!/Datagroup) to manage cache invalidation of groups of queries. 
   *
   * @param dashboardId Id of dashboard 
   * @param dashboardFilters JSON encoded string of Dashboard filters that were applied to prefetch (optional)
   * @return Future(Prefetch)
   */
  def dashboardPrefetchAsync(dashboardId: String, dashboardFilters: Option[List[PrefetchDashboardFilterValue]] = None): Future[Prefetch] = {
      helper.dashboardPrefetch(dashboardId, dashboardFilters)
  }

  /**
   * Delete Dashboard
   * ### Delete the dashboard with the specified id  Permanently **deletes** a dashboard. (The dashboard cannot be recovered after this operation.)  \&quot;Soft\&quot; delete or hide a dashboard by setting its &#x60;deleted&#x60; status to &#x60;True&#x60; with [Update Dashboard](#!/Dashboard/update_dashboard).  Note: When a dashboard is deleted in the UI, it is soft deleted. Use this API call to permanently remove it, if desired. 
   *
   * @param dashboardId Id of dashboard 
   * @return String
   */
  def deleteDashboard(dashboardId: String): Option[String] = {
    val await = Try(Await.result(deleteDashboardAsync(dashboardId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete Dashboard asynchronously
   * ### Delete the dashboard with the specified id  Permanently **deletes** a dashboard. (The dashboard cannot be recovered after this operation.)  \&quot;Soft\&quot; delete or hide a dashboard by setting its &#x60;deleted&#x60; status to &#x60;True&#x60; with [Update Dashboard](#!/Dashboard/update_dashboard).  Note: When a dashboard is deleted in the UI, it is soft deleted. Use this API call to permanently remove it, if desired. 
   *
   * @param dashboardId Id of dashboard 
   * @return Future(String)
   */
  def deleteDashboardAsync(dashboardId: String): Future[String] = {
      helper.deleteDashboard(dashboardId)
  }

  /**
   * Search Dashboards
   * ### Search all dashboards for matching criteria.  Returns an **array of dashboard objects** that match the specified search criteria.  The parameters &#x60;limit&#x60;, and &#x60;offset&#x60; are recommended for \&quot;paging\&quot; the returned results.  Get a **single dashboard** by id with [Dashboard](#!/Dashboard/dashboard) 
   *
   * @param fields Requested fields. (optional)
   * @param id Match dashboard id. (optional)
   * @param page Requested page. (optional)
   * @param perPage Results per page. (optional)
   * @param limit Number of results to return. (used with offset and takes priority over page and per_page) (optional)
   * @param offset Number of results to skip before returning any. (used with limit and takes priority over page and per_page) (optional)
   * @param sorts Fields to sort by. (optional)
   * @param title Match Dashboard title. (optional)
   * @param description Match Dashboard description. (optional)
   * @param contentFavoriteId Filter on a content favorite id. (optional)
   * @param spaceId Filter on a particular space. (optional)
   * @param deleted Filter on dashboards deleted status. (optional)
   * @param userId Filter on dashboards created by a particular user. (optional)
   * @param viewCount Filter on a particular value of view_count (optional)
   * @return List[Dashboard]
   */
  def searchDashboards(fields: Option[String] = None, id: Option[Long] = None, page: Option[Long] = None, perPage: Option[Long] = None, limit: Option[Long] = None, offset: Option[Long] = None, sorts: Option[String] = None, title: Option[String] = None, description: Option[String] = None, contentFavoriteId: Option[Long] = None, spaceId: Option[String] = None, deleted: Option[String] = None, userId: Option[String] = None, viewCount: Option[String] = None): Option[List[Dashboard]] = {
    val await = Try(Await.result(searchDashboardsAsync(fields, id, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, deleted, userId, viewCount), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Search Dashboards asynchronously
   * ### Search all dashboards for matching criteria.  Returns an **array of dashboard objects** that match the specified search criteria.  The parameters &#x60;limit&#x60;, and &#x60;offset&#x60; are recommended for \&quot;paging\&quot; the returned results.  Get a **single dashboard** by id with [Dashboard](#!/Dashboard/dashboard) 
   *
   * @param fields Requested fields. (optional)
   * @param id Match dashboard id. (optional)
   * @param page Requested page. (optional)
   * @param perPage Results per page. (optional)
   * @param limit Number of results to return. (used with offset and takes priority over page and per_page) (optional)
   * @param offset Number of results to skip before returning any. (used with limit and takes priority over page and per_page) (optional)
   * @param sorts Fields to sort by. (optional)
   * @param title Match Dashboard title. (optional)
   * @param description Match Dashboard description. (optional)
   * @param contentFavoriteId Filter on a content favorite id. (optional)
   * @param spaceId Filter on a particular space. (optional)
   * @param deleted Filter on dashboards deleted status. (optional)
   * @param userId Filter on dashboards created by a particular user. (optional)
   * @param viewCount Filter on a particular value of view_count (optional)
   * @return Future(List[Dashboard])
   */
  def searchDashboardsAsync(fields: Option[String] = None, id: Option[Long] = None, page: Option[Long] = None, perPage: Option[Long] = None, limit: Option[Long] = None, offset: Option[Long] = None, sorts: Option[String] = None, title: Option[String] = None, description: Option[String] = None, contentFavoriteId: Option[Long] = None, spaceId: Option[String] = None, deleted: Option[String] = None, userId: Option[String] = None, viewCount: Option[String] = None): Future[List[Dashboard]] = {
      helper.searchDashboards(fields, id, page, perPage, limit, offset, sorts, title, description, contentFavoriteId, spaceId, deleted, userId, viewCount)
  }

  /**
   * Update Dashboard
   * ### Update the dashboard with the specified id  Changes simple (scalar) properties of the dashboard. 
   *
   * @param dashboardId Id of dashboard 
   * @param body Dashboard 
   * @return Dashboard
   */
  def updateDashboard(dashboardId: String, body: Dashboard): Option[Dashboard] = {
    val await = Try(Await.result(updateDashboardAsync(dashboardId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update Dashboard asynchronously
   * ### Update the dashboard with the specified id  Changes simple (scalar) properties of the dashboard. 
   *
   * @param dashboardId Id of dashboard 
   * @param body Dashboard 
   * @return Future(Dashboard)
   */
  def updateDashboardAsync(dashboardId: String, body: Dashboard): Future[Dashboard] = {
      helper.updateDashboard(dashboardId, body)
  }

}

class DashboardApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def allDashboards(fields: Option[String] = None
    )(implicit reader: ClientResponseReader[List[DashboardBase]]): Future[List[DashboardBase]] = {
    // create path and map variables
    val path = (addFmt("/dashboards"))

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

  def createDashboard(body: Option[Dashboard] = None
    )(implicit reader: ClientResponseReader[Dashboard], writer: RequestWriter[Option[Dashboard]]): Future[Dashboard] = {
    // create path and map variables
    val path = (addFmt("/dashboards"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createDashboardPrefetch(dashboardId: String,
    body: Option[PrefetchDashboardRequest] = None
    )(implicit reader: ClientResponseReader[PrefetchDashboardRequest], writer: RequestWriter[Option[PrefetchDashboardRequest]]): Future[PrefetchDashboardRequest] = {
    // create path and map variables
    val path = (addFmt("/dashboards/{dashboard_id}/prefetch")
      replaceAll("\\{" + "dashboard_id" + "\\}", dashboardId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (dashboardId == null) throw new Exception("Missing required parameter 'dashboardId' when calling DashboardApi->createDashboardPrefetch")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def dashboard(dashboardId: String,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[Dashboard]): Future[Dashboard] = {
    // create path and map variables
    val path = (addFmt("/dashboards/{dashboard_id}")
      replaceAll("\\{" + "dashboard_id" + "\\}", dashboardId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (dashboardId == null) throw new Exception("Missing required parameter 'dashboardId' when calling DashboardApi->dashboard")

    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def dashboardPrefetch(dashboardId: String,
    dashboardFilters: Option[List[PrefetchDashboardFilterValue]] = None
    )(implicit reader: ClientResponseReader[Prefetch]): Future[Prefetch] = {
    // create path and map variables
    val path = (addFmt("/dashboards/{dashboard_id}/prefetch")
      replaceAll("\\{" + "dashboard_id" + "\\}", dashboardId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (dashboardId == null) throw new Exception("Missing required parameter 'dashboardId' when calling DashboardApi->dashboardPrefetch")

    dashboardFilters match {
      case Some(param) => queryParams += "dashboard_filters" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteDashboard(dashboardId: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/dashboards/{dashboard_id}")
      replaceAll("\\{" + "dashboard_id" + "\\}", dashboardId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (dashboardId == null) throw new Exception("Missing required parameter 'dashboardId' when calling DashboardApi->deleteDashboard")


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def searchDashboards(fields: Option[String] = None,
    id: Option[Long] = None,
    page: Option[Long] = None,
    perPage: Option[Long] = None,
    limit: Option[Long] = None,
    offset: Option[Long] = None,
    sorts: Option[String] = None,
    title: Option[String] = None,
    description: Option[String] = None,
    contentFavoriteId: Option[Long] = None,
    spaceId: Option[String] = None,
    deleted: Option[String] = None,
    userId: Option[String] = None,
    viewCount: Option[String] = None
    )(implicit reader: ClientResponseReader[List[Dashboard]]): Future[List[Dashboard]] = {
    // create path and map variables
    val path = (addFmt("/dashboards/search"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }
    id match {
      case Some(param) => queryParams += "id" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }
    perPage match {
      case Some(param) => queryParams += "per_page" -> param.toString
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
    title match {
      case Some(param) => queryParams += "title" -> param.toString
      case _ => queryParams
    }
    description match {
      case Some(param) => queryParams += "description" -> param.toString
      case _ => queryParams
    }
    contentFavoriteId match {
      case Some(param) => queryParams += "content_favorite_id" -> param.toString
      case _ => queryParams
    }
    spaceId match {
      case Some(param) => queryParams += "space_id" -> param.toString
      case _ => queryParams
    }
    deleted match {
      case Some(param) => queryParams += "deleted" -> param.toString
      case _ => queryParams
    }
    userId match {
      case Some(param) => queryParams += "user_id" -> param.toString
      case _ => queryParams
    }
    viewCount match {
      case Some(param) => queryParams += "view_count" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateDashboard(dashboardId: String,
    body: Dashboard)(implicit reader: ClientResponseReader[Dashboard], writer: RequestWriter[Dashboard]): Future[Dashboard] = {
    // create path and map variables
    val path = (addFmt("/dashboards/{dashboard_id}")
      replaceAll("\\{" + "dashboard_id" + "\\}", dashboardId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (dashboardId == null) throw new Exception("Missing required parameter 'dashboardId' when calling DashboardApi->updateDashboard")

    if (body == null) throw new Exception("Missing required parameter 'body' when calling DashboardApi->updateDashboard")

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
