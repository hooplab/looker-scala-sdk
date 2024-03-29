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


case class Project (
  // Project Id
  id: Option[String] = None,
  // Project display name
  name: Option[String] = None,
  // If true the project is configured with a git repository
  usesGit: Option[Boolean] = None,
  // Git remote repository url
  gitRemoteUrl: Option[String] = None,
  // Git username for HTTPS authentication. (For production only, if using user attributes.)
  gitUsername: Option[String] = None,
  // (Write-Only) Git password for HTTPS authentication. (For production only, if using user attributes.)
  gitPassword: Option[String] = None,
  // User attribute name for username in per-user HTTPS authentication.
  gitUsernameUserAttribute: Option[String] = None,
  // User attribute name for password in per-user HTTPS authentication.
  gitPasswordUserAttribute: Option[String] = None,
  // Name of the git service provider
  gitServiceName: Option[String] = None,
  // (Write-Only) Optional secret token with which to authenticate requests to the webhook deploy endpoint. If not set, endpoint is unauthenticated.
  deploySecret: Option[String] = None,
  // (Write-Only) When true, unsets the deploy secret to allow unauthenticated access to the webhook deploy endpoint.
  unsetDeploySecret: Option[Boolean] = None,
  // The git pull request policy for this project. Valid values are: \"off\", \"links\", \"recommended\", \"required\".
  pullRequestMode: Option[String] = None,
  // Validation policy: If true, the project must pass all validation checks before project changes can be committed to the git repository
  validationRequired: Option[Boolean] = None,
  // If true the project is an example project and cannot be modified
  isExample: Option[Boolean] = None,
  // Operations the current user is able to perform on this object
  can: Option[Map[String, Boolean]] = None
)

