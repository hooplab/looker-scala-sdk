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
import io.swagger.client.model.Group
import io.swagger.client.model.GroupIdForGroupInclusion
import io.swagger.client.model.GroupIdForGroupUserInclusion
import io.swagger.client.model.User
import io.swagger.client.model.UserAttributeGroupValue
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

class GroupApi(
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
  val helper = new GroupApiAsyncHelper(client, config)

  /**
   * Add a Group to Group
   * ### Adds a new group to a group. 
   *
   * @param groupId Id of group 
   * @param body Group id to add (optional)
   * @return Group
   */
  def addGroupGroup(groupId: Long, body: Option[GroupIdForGroupInclusion] = None): Option[Group] = {
    val await = Try(Await.result(addGroupGroupAsync(groupId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a Group to Group asynchronously
   * ### Adds a new group to a group. 
   *
   * @param groupId Id of group 
   * @param body Group id to add (optional)
   * @return Future(Group)
   */
  def addGroupGroupAsync(groupId: Long, body: Option[GroupIdForGroupInclusion] = None): Future[Group] = {
      helper.addGroupGroup(groupId, body)
  }

  /**
   * Add a User to Group
   * ### Adds a new user to a group. 
   *
   * @param groupId Id of group 
   * @param body User id to add (optional)
   * @return User
   */
  def addGroupUser(groupId: Long, body: Option[GroupIdForGroupUserInclusion] = None): Option[User] = {
    val await = Try(Await.result(addGroupUserAsync(groupId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Add a User to Group asynchronously
   * ### Adds a new user to a group. 
   *
   * @param groupId Id of group 
   * @param body User id to add (optional)
   * @return Future(User)
   */
  def addGroupUserAsync(groupId: Long, body: Option[GroupIdForGroupUserInclusion] = None): Future[User] = {
      helper.addGroupUser(groupId, body)
  }

  /**
   * Get All Groups in Group
   * ### Get information about all the groups in a group 
   *
   * @param groupId Id of group 
   * @param fields Requested fields. (optional)
   * @return List[Group]
   */
  def allGroupGroups(groupId: Long, fields: Option[String] = None): Option[List[Group]] = {
    val await = Try(Await.result(allGroupGroupsAsync(groupId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Groups in Group asynchronously
   * ### Get information about all the groups in a group 
   *
   * @param groupId Id of group 
   * @param fields Requested fields. (optional)
   * @return Future(List[Group])
   */
  def allGroupGroupsAsync(groupId: Long, fields: Option[String] = None): Future[List[Group]] = {
      helper.allGroupGroups(groupId, fields)
  }

  /**
   * Get All Users in Group
   * ### Get information about all the users directly included in a group. 
   *
   * @param groupId Id of group 
   * @param fields Requested fields. (optional)
   * @param page Requested page. (optional)
   * @param perPage Results per page. (optional)
   * @param sorts Fields to sort by. (optional)
   * @return List[User]
   */
  def allGroupUsers(groupId: Long, fields: Option[String] = None, page: Option[Long] = None, perPage: Option[Long] = None, sorts: Option[String] = None): Option[List[User]] = {
    val await = Try(Await.result(allGroupUsersAsync(groupId, fields, page, perPage, sorts), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Users in Group asynchronously
   * ### Get information about all the users directly included in a group. 
   *
   * @param groupId Id of group 
   * @param fields Requested fields. (optional)
   * @param page Requested page. (optional)
   * @param perPage Results per page. (optional)
   * @param sorts Fields to sort by. (optional)
   * @return Future(List[User])
   */
  def allGroupUsersAsync(groupId: Long, fields: Option[String] = None, page: Option[Long] = None, perPage: Option[Long] = None, sorts: Option[String] = None): Future[List[User]] = {
      helper.allGroupUsers(groupId, fields, page, perPage, sorts)
  }

  /**
   * Get All Groups
   * ### Get information about all groups. 
   *
   * @param fields Requested fields. (optional)
   * @param page Requested page. (optional)
   * @param perPage Results per page. (optional)
   * @param sorts Fields to sort by. (optional)
   * @param ids Optional of ids to get specific groups. (optional)
   * @param contentMetadataId Id of content metadata to which groups must have access. (optional)
   * @param canAddToContentMetadata Select only groups that either can/cannot be given access to content. (optional)
   * @return List[Group]
   */
  def allGroups(fields: Option[String] = None, page: Option[Long] = None, perPage: Option[Long] = None, sorts: Option[String] = None, ids: Option[List[Long]] = None, contentMetadataId: Option[Long] = None, canAddToContentMetadata: Option[Boolean] = None): Option[List[Group]] = {
    val await = Try(Await.result(allGroupsAsync(fields, page, perPage, sorts, ids, contentMetadataId, canAddToContentMetadata), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All Groups asynchronously
   * ### Get information about all groups. 
   *
   * @param fields Requested fields. (optional)
   * @param page Requested page. (optional)
   * @param perPage Results per page. (optional)
   * @param sorts Fields to sort by. (optional)
   * @param ids Optional of ids to get specific groups. (optional)
   * @param contentMetadataId Id of content metadata to which groups must have access. (optional)
   * @param canAddToContentMetadata Select only groups that either can/cannot be given access to content. (optional)
   * @return Future(List[Group])
   */
  def allGroupsAsync(fields: Option[String] = None, page: Option[Long] = None, perPage: Option[Long] = None, sorts: Option[String] = None, ids: Option[List[Long]] = None, contentMetadataId: Option[Long] = None, canAddToContentMetadata: Option[Boolean] = None): Future[List[Group]] = {
      helper.allGroups(fields, page, perPage, sorts, ids, contentMetadataId, canAddToContentMetadata)
  }

  /**
   * Create Group
   * ### Creates a new group (admin only). 
   *
   * @param body Group (optional)
   * @param fields Requested fields. (optional)
   * @return Group
   */
  def createGroup(body: Option[Group] = None, fields: Option[String] = None): Option[Group] = {
    val await = Try(Await.result(createGroupAsync(body, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create Group asynchronously
   * ### Creates a new group (admin only). 
   *
   * @param body Group (optional)
   * @param fields Requested fields. (optional)
   * @return Future(Group)
   */
  def createGroupAsync(body: Option[Group] = None, fields: Option[String] = None): Future[Group] = {
      helper.createGroup(body, fields)
  }

  /**
   * Delete Group
   * ### Deletes a group (admin only). 
   *
   * @param groupId Id of group 
   * @return String
   */
  def deleteGroup(groupId: Long): Option[String] = {
    val await = Try(Await.result(deleteGroupAsync(groupId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete Group asynchronously
   * ### Deletes a group (admin only). 
   *
   * @param groupId Id of group 
   * @return Future(String)
   */
  def deleteGroupAsync(groupId: Long): Future[String] = {
      helper.deleteGroup(groupId)
  }

  /**
   * Deletes a Group from Group
   * ### Removes a group from a group. 
   *
   * @param groupId Id of group 
   * @param deletingGroupId Id of group to delete 
   * @return void
   */
  def deleteGroupFromGroup(groupId: Long, deletingGroupId: Long) = {
    val await = Try(Await.result(deleteGroupFromGroupAsync(groupId, deletingGroupId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Deletes a Group from Group asynchronously
   * ### Removes a group from a group. 
   *
   * @param groupId Id of group 
   * @param deletingGroupId Id of group to delete 
   * @return Future(void)
   */
  def deleteGroupFromGroupAsync(groupId: Long, deletingGroupId: Long) = {
      helper.deleteGroupFromGroup(groupId, deletingGroupId)
  }

  /**
   * Remove a User from Group
   * ### Removes a user from a group. 
   *
   * @param groupId Id of group 
   * @param userId Id of user to remove from group 
   * @return void
   */
  def deleteGroupUser(groupId: Long, userId: Long) = {
    val await = Try(Await.result(deleteGroupUserAsync(groupId, userId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Remove a User from Group asynchronously
   * ### Removes a user from a group. 
   *
   * @param groupId Id of group 
   * @param userId Id of user to remove from group 
   * @return Future(void)
   */
  def deleteGroupUserAsync(groupId: Long, userId: Long) = {
      helper.deleteGroupUser(groupId, userId)
  }

  /**
   * Delete User Attribute Group Value
   * ### Remove a user attribute value from a group. 
   *
   * @param groupId Id of group 
   * @param userAttributeId Id of user attribute 
   * @return void
   */
  def deleteUserAttributeGroupValue(groupId: Long, userAttributeId: Long) = {
    val await = Try(Await.result(deleteUserAttributeGroupValueAsync(groupId, userAttributeId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete User Attribute Group Value asynchronously
   * ### Remove a user attribute value from a group. 
   *
   * @param groupId Id of group 
   * @param userAttributeId Id of user attribute 
   * @return Future(void)
   */
  def deleteUserAttributeGroupValueAsync(groupId: Long, userAttributeId: Long) = {
      helper.deleteUserAttributeGroupValue(groupId, userAttributeId)
  }

  /**
   * Get Group
   * ### Get information about a group. 
   *
   * @param groupId Id of group 
   * @param fields Requested fields. (optional)
   * @return Group
   */
  def group(groupId: Long, fields: Option[String] = None): Option[Group] = {
    val await = Try(Await.result(groupAsync(groupId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get Group asynchronously
   * ### Get information about a group. 
   *
   * @param groupId Id of group 
   * @param fields Requested fields. (optional)
   * @return Future(Group)
   */
  def groupAsync(groupId: Long, fields: Option[String] = None): Future[Group] = {
      helper.group(groupId, fields)
  }

  /**
   * Update Group
   * ### Updates the a group (admin only).
   *
   * @param groupId Id of group 
   * @param body Group 
   * @param fields Requested fields. (optional)
   * @return Group
   */
  def updateGroup(groupId: Long, body: Group, fields: Option[String] = None): Option[Group] = {
    val await = Try(Await.result(updateGroupAsync(groupId, body, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update Group asynchronously
   * ### Updates the a group (admin only).
   *
   * @param groupId Id of group 
   * @param body Group 
   * @param fields Requested fields. (optional)
   * @return Future(Group)
   */
  def updateGroupAsync(groupId: Long, body: Group, fields: Option[String] = None): Future[Group] = {
      helper.updateGroup(groupId, body, fields)
  }

  /**
   * Set User Attribute Group Value
   * ### Set the value of a user attribute for a group.  For information about how user attribute values are calculated, see [Set User Attribute Group Values](#!/UserAttribute/set_user_attribute_group_values). 
   *
   * @param groupId Id of group 
   * @param userAttributeId Id of user attribute 
   * @param body New value for group. 
   * @return UserAttributeGroupValue
   */
  def updateUserAttributeGroupValue(groupId: Long, userAttributeId: Long, body: UserAttributeGroupValue): Option[UserAttributeGroupValue] = {
    val await = Try(Await.result(updateUserAttributeGroupValueAsync(groupId, userAttributeId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Set User Attribute Group Value asynchronously
   * ### Set the value of a user attribute for a group.  For information about how user attribute values are calculated, see [Set User Attribute Group Values](#!/UserAttribute/set_user_attribute_group_values). 
   *
   * @param groupId Id of group 
   * @param userAttributeId Id of user attribute 
   * @param body New value for group. 
   * @return Future(UserAttributeGroupValue)
   */
  def updateUserAttributeGroupValueAsync(groupId: Long, userAttributeId: Long, body: UserAttributeGroupValue): Future[UserAttributeGroupValue] = {
      helper.updateUserAttributeGroupValue(groupId, userAttributeId, body)
  }

}

class GroupApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def addGroupGroup(groupId: Long,
    body: Option[GroupIdForGroupInclusion] = None
    )(implicit reader: ClientResponseReader[Group], writer: RequestWriter[Option[GroupIdForGroupInclusion]]): Future[Group] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}/groups")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def addGroupUser(groupId: Long,
    body: Option[GroupIdForGroupUserInclusion] = None
    )(implicit reader: ClientResponseReader[User], writer: RequestWriter[Option[GroupIdForGroupUserInclusion]]): Future[User] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}/users")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def allGroupGroups(groupId: Long,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[List[Group]]): Future[List[Group]] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}/groups")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString))

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

  def allGroupUsers(groupId: Long,
    fields: Option[String] = None,
    page: Option[Long] = None,
    perPage: Option[Long] = None,
    sorts: Option[String] = None
    )(implicit reader: ClientResponseReader[List[User]]): Future[List[User]] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}/users")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
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
    sorts match {
      case Some(param) => queryParams += "sorts" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def allGroups(fields: Option[String] = None,
    page: Option[Long] = None,
    perPage: Option[Long] = None,
    sorts: Option[String] = None,
    ids: Option[List[Long]] = None,
    contentMetadataId: Option[Long] = None,
    canAddToContentMetadata: Option[Boolean] = None
    )(implicit reader: ClientResponseReader[List[Group]]): Future[List[Group]] = {
    // create path and map variables
    val path = (addFmt("/groups"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
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
    sorts match {
      case Some(param) => queryParams += "sorts" -> param.toString
      case _ => queryParams
    }
    ids match {
      case Some(param) => queryParams += "ids" -> param.toString
      case _ => queryParams
    }
    contentMetadataId match {
      case Some(param) => queryParams += "content_metadata_id" -> param.toString
      case _ => queryParams
    }
    canAddToContentMetadata match {
      case Some(param) => queryParams += "can_add_to_content_metadata" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createGroup(body: Option[Group] = None,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[Group], writer: RequestWriter[Option[Group]]): Future[Group] = {
    // create path and map variables
    val path = (addFmt("/groups"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteGroup(groupId: Long)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteGroupFromGroup(groupId: Long,
    deletingGroupId: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}/groups/{deleting_group_id}")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString)
      replaceAll("\\{" + "deleting_group_id" + "\\}", deletingGroupId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteGroupUser(groupId: Long,
    userId: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}/users/{user_id}")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString)
      replaceAll("\\{" + "user_id" + "\\}", userId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def deleteUserAttributeGroupValue(groupId: Long,
    userAttributeId: Long)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}/attribute_values/{user_attribute_id}")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString)
      replaceAll("\\{" + "user_attribute_id" + "\\}", userAttributeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def group(groupId: Long,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[Group]): Future[Group] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString))

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

  def updateGroup(groupId: Long,
    body: Group,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[Group], writer: RequestWriter[Group]): Future[Group] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling GroupApi->updateGroup")
    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateUserAttributeGroupValue(groupId: Long,
    userAttributeId: Long,
    body: UserAttributeGroupValue)(implicit reader: ClientResponseReader[UserAttributeGroupValue], writer: RequestWriter[UserAttributeGroupValue]): Future[UserAttributeGroupValue] = {
    // create path and map variables
    val path = (addFmt("/groups/{group_id}/attribute_values/{user_attribute_id}")
      replaceAll("\\{" + "group_id" + "\\}", groupId.toString)
      replaceAll("\\{" + "user_attribute_id" + "\\}", userAttributeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling GroupApi->updateUserAttributeGroupValue")

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}