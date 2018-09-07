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

package io.swagger.client.model


case class SqlQuery (
  // The identifier of the SQL query
  slug: Option[String] = None,
  // Number of seconds this query took to run the most recent time it was run
  lastRuntime: Option[Float] = None,
  // Number of times this query has been run
  runCount: Option[Long] = None,
  // Maximum number of rows this query will display on the SQL Runner page
  browserLimit: Option[Long] = None,
  // SQL query text
  sql: Option[String] = None,
  // The most recent time this query was run
  lastRunAt: Option[String] = None,
  // Connection this query uses
  connection: Option[DBConnectionBase] = None,
  // Model name this query uses
  modelName: Option[String] = None,
  // User who created this SQL query
  creator: Option[UserPublic] = None,
  // Explore page URL for this SQL query
  exploreUrl: Option[String] = None,
  // Should this query be rendered as plain text
  plaintext: Option[Boolean] = None,
  // Operations the current user is able to perform on this object
  can: Option[Map[String, Boolean]] = None
)

