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

import io.swagger.client.model.Error
import io.swagger.client.model.Workspace
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

class WorkspaceApi(
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
  val helper = new WorkspaceApiAsyncHelper(client, config)

  /**
   * Get All Workspaces
   * ### Get All Workspaces  Returns all workspaces available to the calling user. 
   *
   * @return List[Workspace]
   */
  def allWorkspaces(): Option[List[Workspace]] = {
    val await = Try(Await.result(allWorkspacesAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Workspaces asynchronously
   * ### Get All Workspaces  Returns all workspaces available to the calling user. 
   *
   * @return Future(List[Workspace])
   */
  def allWorkspacesAsync(): Future[List[Workspace]] = {
      helper.allWorkspaces()
  }

  /**
   * Get Workspace
   * ### Get A Workspace  Returns information about a workspace such as the git status and selected branches of all projects available to the caller&#39;s user account.  A workspace defines which versions of project files will be used to evaluate expressions and operations that use model definitions - operations such as running queries or rendering dashboards. Each project has its own git repository, and each project in a workspace may be configured to reference particular branch or revision within their respective repositories.  There are two predefined workspaces available: \&quot;production\&quot; and \&quot;dev\&quot;.  The production workspace is shared across all Looker users. Models in the production workspace are read-only. Changing files in production is accomplished by modifying files in a git branch and using Pull Requests to merge the changes from the dev branch into the production branch, and then telling Looker to sync with production.  The dev workspace is local to each Looker user. Changes made to project/model files in the dev workspace only affect that user, and only when the dev workspace is selected as the active workspace for the API session. (See set_session_workspace()).  The dev workspace is NOT unique to an API session. Two applications accessing the Looker API using the same user account will see the same files in the dev workspace. To avoid collisions between API clients it&#39;s best to have each client login with API3 credentials for a different user account.  Changes made to files in a dev workspace are persistent across API sessions. It&#39;s a good idea to commit any changes you&#39;ve made to the git repository, but not strictly required. Your modified files reside in a special user-specific directory on the Looker server and will still be there when you login in again later and use update_session(workspace_id: \&quot;dev\&quot;) to select the dev workspace for the new API session. 
   *
   * @param workspaceId Id of the workspace  
   * @return Workspace
   */
  def workspace(workspaceId: String): Option[Workspace] = {
    val await = Try(Await.result(workspaceAsync(workspaceId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Workspace asynchronously
   * ### Get A Workspace  Returns information about a workspace such as the git status and selected branches of all projects available to the caller&#39;s user account.  A workspace defines which versions of project files will be used to evaluate expressions and operations that use model definitions - operations such as running queries or rendering dashboards. Each project has its own git repository, and each project in a workspace may be configured to reference particular branch or revision within their respective repositories.  There are two predefined workspaces available: \&quot;production\&quot; and \&quot;dev\&quot;.  The production workspace is shared across all Looker users. Models in the production workspace are read-only. Changing files in production is accomplished by modifying files in a git branch and using Pull Requests to merge the changes from the dev branch into the production branch, and then telling Looker to sync with production.  The dev workspace is local to each Looker user. Changes made to project/model files in the dev workspace only affect that user, and only when the dev workspace is selected as the active workspace for the API session. (See set_session_workspace()).  The dev workspace is NOT unique to an API session. Two applications accessing the Looker API using the same user account will see the same files in the dev workspace. To avoid collisions between API clients it&#39;s best to have each client login with API3 credentials for a different user account.  Changes made to files in a dev workspace are persistent across API sessions. It&#39;s a good idea to commit any changes you&#39;ve made to the git repository, but not strictly required. Your modified files reside in a special user-specific directory on the Looker server and will still be there when you login in again later and use update_session(workspace_id: \&quot;dev\&quot;) to select the dev workspace for the new API session. 
   *
   * @param workspaceId Id of the workspace  
   * @return Future(Workspace)
   */
  def workspaceAsync(workspaceId: String): Future[Workspace] = {
      helper.workspace(workspaceId)
  }

}

class WorkspaceApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def allWorkspaces()(implicit reader: ClientResponseReader[List[Workspace]]): Future[List[Workspace]] = {
    // create path and map variables
    val path = (addFmt("/workspaces"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def workspace(workspaceId: String)(implicit reader: ClientResponseReader[Workspace]): Future[Workspace] = {
    // create path and map variables
    val path = (addFmt("/workspaces/{workspace_id}")
      replaceAll("\\{" + "workspace_id" + "\\}", workspaceId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (workspaceId == null) throw new Exception("Missing required parameter 'workspaceId' when calling WorkspaceApi->workspace")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}