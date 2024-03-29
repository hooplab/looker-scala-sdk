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

import java.util.Date

case class ScheduledPlan (
  // Unique Id
  id: Option[Long] = None,
  // Name
  name: Option[String] = None,
  // Date and time when ScheduledPlan was created
  createdAt: Option[Date] = None,
  // Date and time when ScheduledPlan was last updated
  updatedAt: Option[Date] = None,
  // Title
  title: Option[String] = None,
  // User Id which owns this ScheduledPlan
  userId: Option[Long] = None,
  // User who owns this ScheduledPlan
  user: Option[UserPublic] = None,
  // Whether schedule is ran as recipient (only applicable for email recipients)
  runAsRecipient: Option[Boolean] = None,
  // Whether the ScheduledPlan is enabled
  enabled: Option[Boolean] = None,
  // When the ScheduledPlan will next run (null if running once)
  nextRunAt: Option[Date] = None,
  // When the ScheduledPlan was last run
  lastRunAt: Option[Date] = None,
  // Id of a look
  lookId: Option[Long] = None,
  // Id of a dashboard
  dashboardId: Option[Long] = None,
  // Id of a LookML dashboard
  lookmlDashboardId: Option[String] = None,
  // Query string to run look or dashboard with
  filtersString: Option[String] = None,
  // (DEPRECATED) Alias for filters_string field
  dashboardFilters: Option[String] = None,
  // Delivery should occur if running the dashboard or look returns results
  requireResults: Option[Boolean] = None,
  // Delivery should occur if the dashboard look does not return results
  requireNoResults: Option[Boolean] = None,
  // Delivery should occur if data have changed since the last run
  requireChange: Option[Boolean] = None,
  // Will run an unlimited query and send all results.
  sendAllResults: Option[Boolean] = None,
  // Vixie-Style crontab specification when to run
  crontab: Option[String] = None,
  // Name of a datagroup; if specified will run when datagroup triggered (can't be used with cron string)
  datagroup: Option[String] = None,
  // Timezone for interpreting the specified crontab (default is Looker instance timezone)
  timezone: Option[String] = None,
  // Query id
  queryId: Option[String] = None,
  // Scheduled plan destinations
  scheduledPlanDestination: Option[List[ScheduledPlanDestination]] = None,
  // Whether the plan in question should only be run once (usually for testing)
  runOnce: Option[Boolean] = None,
  // Whether links back to Looker should be included in this ScheduledPlan
  includeLinks: Option[Boolean] = None,
  // Operations the current user is able to perform on this object
  can: Option[Map[String, Boolean]] = None
)

