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


case class HomepageItem (
  // Unique Id
  id: Option[String] = None,
  // Associated Homepage Section
  homepageSectionId: Option[String] = None,
  // An arbitrary integer representing the sort order within the section
  order: Option[Long] = None,
  // The actual title for display
  title: Option[String] = None,
  // Custom title entered by the user, if present
  customTitle: Option[String] = None,
  // Whether the custom title should be used instead of the content title, if the item is associated with content
  useCustomTitle: Option[Boolean] = None,
  // The actual description for display
  description: Option[String] = None,
  // Custom description entered by the user, if present
  customDescription: Option[String] = None,
  // Whether the custom description should be used instead of the content description, if the item is associated with content
  useCustomDescription: Option[Boolean] = None,
  // The actual url for display
  url: Option[String] = None,
  // Custom url entered by the user, if present
  customUrl: Option[String] = None,
  // Whether the custom url should be used instead of the content url, if the item is associated with content
  useCustomUrl: Option[Boolean] = None,
  // The actual image_url for display
  imageUrl: Option[String] = None,
  // Custom image_url entered by the user, if present
  customImageUrl: Option[String] = None,
  // (Write-Only) base64 encoded image data
  customImageDataBase64: Option[String] = None,
  // Whether the custom image should be used instead of the content image, if the item is associated with content
  useCustomImage: Option[Boolean] = None,
  // Look to base this item on
  lookId: Option[Long] = None,
  // Dashboard to base this item on
  dashboardId: Option[Long] = None,
  // LookML Dashboard to base this item on
  lookmlDashboardId: Option[String] = None,
  // Number of times content has been viewed, if present
  viewCount: Option[Long] = None,
  // Number of times content has been favorited, if present
  favoriteCount: Option[Long] = None,
  // Name of user who created the content this item is based on
  contentCreatedBy: Option[String] = None,
  // Last time the content that this item is based on was updated
  contentUpdatedAt: Option[String] = None,
  // Content favorite id associated with the item this content is based on
  contentFavoriteId: Option[Long] = None,
  // Content metadata id associated with the item this content is based on
  contentMetadataId: Option[Long] = None,
  // Number of seconds it took to fetch the section this item is in
  sectionFetchTime: Option[Float] = None,
  // Operations the current user is able to perform on this object
  can: Option[Map[String, Boolean]] = None
)

