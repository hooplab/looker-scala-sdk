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


case class LookmlModelExploreFieldMapLayer (
  // URL to the map layer resource.
  url: Option[String] = None,
  // Specifies the name of the TopoJSON object that the map layer references. If not specified, use the first object..
  featureKey: Option[String] = None,
  // Selects which property from the TopoJSON data to plot against. TopoJSON supports arbitrary metadata for each region. When null, the first matching property should be used.
  propertyKey: Option[String] = None,
  // Which property from the TopoJSON data to use to label the region. When null, property_key should be used.
  propertyLabelKey: Option[String] = None,
  // The preferred geographic projection of the map layer when displayed in a visualization that supports multiple geographic projections.
  projection: Option[String] = None,
  // Specifies the data format of the region information. Valid values are: \"topojson\", \"vector_tile_region\".
  format: Option[String] = None,
  // Specifies the URL to a JSON file that defines the geographic extents of each region available in the map layer. This data is used to automatically center the map on the available data for visualization purposes. The JSON file must be a JSON object where the keys are the mapping value of the feature (as specified by property_key) and the values are arrays of four numbers representing the west longitude, south latitude, east longitude, and north latitude extents of the region. The object must include a key for every possible value of property_key.
  extentsJsonUrl: Option[String] = None,
  // The minimum zoom level that the map layer may be displayed at, for visualizations that support zooming.
  maxZoomLevel: Option[Long] = None,
  // The maximum zoom level that the map layer may be displayed at, for visualizations that support zooming.
  minZoomLevel: Option[Long] = None
)

