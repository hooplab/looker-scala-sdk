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


case class Dialect (
  // The name of the dialect
  name: Option[String] = None,
  // The human-readable label of the connection
  label: Option[String] = None,
  // Whether the dialect supports query cost estimates
  supportsCostEstimate: Option[Boolean] = None,
  // Whether the dialect supports uploading tables
  supportsUploadTables: Option[Boolean] = None,
  // PDT index columns
  persistentTableIndexes: Option[String] = None,
  // PDT sortkey columns
  persistentTableSortkeys: Option[String] = None,
  // PDT distkey column
  persistentTableDistkey: Option[String] = None,
  // Suports streaming results
  supportsStreaming: Option[Boolean] = None,
  // Should SQL Runner snippets automatically be run
  automaticallyRunSqlRunnerSnippets: Option[Boolean] = None,
  // Array of names of the tests that can be run on a connection using this dialect
  connectionTests: Option[List[String]] = None,
  // Operations the current user is able to perform on this object
  can: Option[Map[String, Boolean]] = None
)
