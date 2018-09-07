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
import io.swagger.client.model.UserAttribute
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

class UserAttributeApi(
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
  val helper = new UserAttributeApiAsyncHelper(client, config)

  /**
   * Get User Attribute Group Values
   * ### Returns all values of a user attribute defined by user groups, in precedence order.  A user may be a member of multiple groups which define different values for a given user attribute. The order of group-values in the response determines precedence for selecting which group-value applies to a given user.  For more information, see [Set User Attribute Group Values](#!/UserAttribute/set_user_attribute_group_values).  Results will only include groups that the caller&#39;s user account has permission to see. 
   *
   * @param userAttributeId Id of user attribute 
   * @param fields Requested fields. (optional)
   * @return List[UserAttributeGroupValue]
   */
  def allUserAttributeGroupValues(userAttributeId: Long, fields: Option[String] = None): Option[List[UserAttributeGroupValue]] = {
    val await = Try(Await.result(allUserAttributeGroupValuesAsync(userAttributeId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get User Attribute Group Values asynchronously
   * ### Returns all values of a user attribute defined by user groups, in precedence order.  A user may be a member of multiple groups which define different values for a given user attribute. The order of group-values in the response determines precedence for selecting which group-value applies to a given user.  For more information, see [Set User Attribute Group Values](#!/UserAttribute/set_user_attribute_group_values).  Results will only include groups that the caller&#39;s user account has permission to see. 
   *
   * @param userAttributeId Id of user attribute 
   * @param fields Requested fields. (optional)
   * @return Future(List[UserAttributeGroupValue])
   */
  def allUserAttributeGroupValuesAsync(userAttributeId: Long, fields: Option[String] = None): Future[List[UserAttributeGroupValue]] = {
      helper.allUserAttributeGroupValues(userAttributeId, fields)
  }

  /**
   * Get All User Attributes
   * ### Get information about all user attributes. 
   *
   * @param fields Requested fields. (optional)
   * @param sorts Fields to sort by. (optional)
   * @return List[UserAttribute]
   */
  def allUserAttributes(fields: Option[String] = None, sorts: Option[String] = None): Option[List[UserAttribute]] = {
    val await = Try(Await.result(allUserAttributesAsync(fields, sorts), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get All User Attributes asynchronously
   * ### Get information about all user attributes. 
   *
   * @param fields Requested fields. (optional)
   * @param sorts Fields to sort by. (optional)
   * @return Future(List[UserAttribute])
   */
  def allUserAttributesAsync(fields: Option[String] = None, sorts: Option[String] = None): Future[List[UserAttribute]] = {
      helper.allUserAttributes(fields, sorts)
  }

  /**
   * Create User Attribute
   * ### Create a new user attribute. 
   *
   * @param body User Attribute (optional)
   * @param fields Requested fields. (optional)
   * @return UserAttribute
   */
  def createUserAttribute(body: Option[UserAttribute] = None, fields: Option[String] = None): Option[UserAttribute] = {
    val await = Try(Await.result(createUserAttributeAsync(body, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create User Attribute asynchronously
   * ### Create a new user attribute. 
   *
   * @param body User Attribute (optional)
   * @param fields Requested fields. (optional)
   * @return Future(UserAttribute)
   */
  def createUserAttributeAsync(body: Option[UserAttribute] = None, fields: Option[String] = None): Future[UserAttribute] = {
      helper.createUserAttribute(body, fields)
  }

  /**
   * Delete User Attribute
   * ### Delete a user attribute (admin only). 
   *
   * @param userAttributeId Id of user_attribute 
   * @return String
   */
  def deleteUserAttribute(userAttributeId: Long): Option[String] = {
    val await = Try(Await.result(deleteUserAttributeAsync(userAttributeId), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Delete User Attribute asynchronously
   * ### Delete a user attribute (admin only). 
   *
   * @param userAttributeId Id of user_attribute 
   * @return Future(String)
   */
  def deleteUserAttributeAsync(userAttributeId: Long): Future[String] = {
      helper.deleteUserAttribute(userAttributeId)
  }

  /**
   * Set User Attribute Group Values
   * ### Define values for a user attribute across a set of groups, in priority order.  This function defines all values for a user attribute defined by user groups. This is a global setting, potentially affecting all users in the system. This function replaces any existing group value definitions for the indicated user attribute.  The value of a user attribute for a given user is determined by searching the following locations, in this order:  1. the user&#39;s account settings 2. the groups that the user is a member of 3. the default value of the user attribute, if any  The user may be a member of multiple groups which define different values for that user attribute. The order of items in the group_values parameter determines which group takes priority for that user. Lowest array index wins.  An alternate method to indicate the selection precedence of group-values is to assign numbers to the &#39;rank&#39; property of each group-value object in the array. Lowest &#39;rank&#39; value wins. If you use this technique, you must assign a rank value to every group-value object in the array.  To set a user attribute value for a single user, see [Set User Attribute User Value](#!/User/set_user_attribute_user_value). To set a user attribute value for all members of a group, see [Set User Attribute Group Value](#!/Group/update_user_attribute_group_value). 
   *
   * @param userAttributeId Id of user attribute 
   * @param body Array of group values. 
   * @return List[UserAttributeGroupValue]
   */
  def setUserAttributeGroupValues(userAttributeId: Long, body: List[UserAttributeGroupValue]): Option[List[UserAttributeGroupValue]] = {
    val await = Try(Await.result(setUserAttributeGroupValuesAsync(userAttributeId, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Set User Attribute Group Values asynchronously
   * ### Define values for a user attribute across a set of groups, in priority order.  This function defines all values for a user attribute defined by user groups. This is a global setting, potentially affecting all users in the system. This function replaces any existing group value definitions for the indicated user attribute.  The value of a user attribute for a given user is determined by searching the following locations, in this order:  1. the user&#39;s account settings 2. the groups that the user is a member of 3. the default value of the user attribute, if any  The user may be a member of multiple groups which define different values for that user attribute. The order of items in the group_values parameter determines which group takes priority for that user. Lowest array index wins.  An alternate method to indicate the selection precedence of group-values is to assign numbers to the &#39;rank&#39; property of each group-value object in the array. Lowest &#39;rank&#39; value wins. If you use this technique, you must assign a rank value to every group-value object in the array.  To set a user attribute value for a single user, see [Set User Attribute User Value](#!/User/set_user_attribute_user_value). To set a user attribute value for all members of a group, see [Set User Attribute Group Value](#!/Group/update_user_attribute_group_value). 
   *
   * @param userAttributeId Id of user attribute 
   * @param body Array of group values. 
   * @return Future(List[UserAttributeGroupValue])
   */
  def setUserAttributeGroupValuesAsync(userAttributeId: Long, body: List[UserAttributeGroupValue]): Future[List[UserAttributeGroupValue]] = {
      helper.setUserAttributeGroupValues(userAttributeId, body)
  }

  /**
   * Update User Attribute
   * ### Update a user attribute definition. 
   *
   * @param userAttributeId Id of user attribute 
   * @param body User Attribute 
   * @param fields Requested fields. (optional)
   * @return UserAttribute
   */
  def updateUserAttribute(userAttributeId: Long, body: UserAttribute, fields: Option[String] = None): Option[UserAttribute] = {
    val await = Try(Await.result(updateUserAttributeAsync(userAttributeId, body, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Update User Attribute asynchronously
   * ### Update a user attribute definition. 
   *
   * @param userAttributeId Id of user attribute 
   * @param body User Attribute 
   * @param fields Requested fields. (optional)
   * @return Future(UserAttribute)
   */
  def updateUserAttributeAsync(userAttributeId: Long, body: UserAttribute, fields: Option[String] = None): Future[UserAttribute] = {
      helper.updateUserAttribute(userAttributeId, body, fields)
  }

  /**
   * Get User Attribute
   * ### Get information about a user attribute. 
   *
   * @param userAttributeId Id of user attribute 
   * @param fields Requested fields. (optional)
   * @return UserAttribute
   */
  def userAttribute(userAttributeId: Long, fields: Option[String] = None): Option[UserAttribute] = {
    val await = Try(Await.result(userAttributeAsync(userAttributeId, fields), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get User Attribute asynchronously
   * ### Get information about a user attribute. 
   *
   * @param userAttributeId Id of user attribute 
   * @param fields Requested fields. (optional)
   * @return Future(UserAttribute)
   */
  def userAttributeAsync(userAttributeId: Long, fields: Option[String] = None): Future[UserAttribute] = {
      helper.userAttribute(userAttributeId, fields)
  }

}

class UserAttributeApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def allUserAttributeGroupValues(userAttributeId: Long,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[List[UserAttributeGroupValue]]): Future[List[UserAttributeGroupValue]] = {
    // create path and map variables
    val path = (addFmt("/user_attributes/{user_attribute_id}/group_values")
      replaceAll("\\{" + "user_attribute_id" + "\\}", userAttributeId.toString))

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

  def allUserAttributes(fields: Option[String] = None,
    sorts: Option[String] = None
    )(implicit reader: ClientResponseReader[List[UserAttribute]]): Future[List[UserAttribute]] = {
    // create path and map variables
    val path = (addFmt("/user_attributes"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
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

  def createUserAttribute(body: Option[UserAttribute] = None,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[UserAttribute], writer: RequestWriter[Option[UserAttribute]]): Future[UserAttribute] = {
    // create path and map variables
    val path = (addFmt("/user_attributes"))

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

  def deleteUserAttribute(userAttributeId: Long)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/user_attributes/{user_attribute_id}")
      replaceAll("\\{" + "user_attribute_id" + "\\}", userAttributeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("DELETE", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def setUserAttributeGroupValues(userAttributeId: Long,
    body: List[UserAttributeGroupValue])(implicit reader: ClientResponseReader[List[UserAttributeGroupValue]], writer: RequestWriter[List[UserAttributeGroupValue]]): Future[List[UserAttributeGroupValue]] = {
    // create path and map variables
    val path = (addFmt("/user_attributes/{user_attribute_id}/group_values")
      replaceAll("\\{" + "user_attribute_id" + "\\}", userAttributeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling UserAttributeApi->setUserAttributeGroupValues")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def updateUserAttribute(userAttributeId: Long,
    body: UserAttribute,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[UserAttribute], writer: RequestWriter[UserAttribute]): Future[UserAttribute] = {
    // create path and map variables
    val path = (addFmt("/user_attributes/{user_attribute_id}")
      replaceAll("\\{" + "user_attribute_id" + "\\}", userAttributeId.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (body == null) throw new Exception("Missing required parameter 'body' when calling UserAttributeApi->updateUserAttribute")
    fields match {
      case Some(param) => queryParams += "fields" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def userAttribute(userAttributeId: Long,
    fields: Option[String] = None
    )(implicit reader: ClientResponseReader[UserAttribute]): Future[UserAttribute] = {
    // create path and map variables
    val path = (addFmt("/user_attributes/{user_attribute_id}")
      replaceAll("\\{" + "user_attribute_id" + "\\}", userAttributeId.toString))

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