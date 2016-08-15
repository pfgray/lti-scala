package net.paulgray.lti

import com.fasterxml.jackson.annotation.JsonProperty
import ToolConsumerProfile._

/**
  * Created by pfbgray on 8/11/16.
  */
case class ToolConsumerProfile(
    @JsonProperty("@id") _id: String,
    @JsonProperty("@type") _type: String = TcpType,
    //@JsonProperty(Lti + "capability_offered") capabilityOffered: String
    @JsonProperty(Lti + "GUID.Type") guid: Guid
)

case class Guid(
    @JsonProperty("@type") _type: String =
      "http://purl.imsglobal.org/xsd/lti/v2/ltid#GUID.Type",
    @JsonProperty("@value") _value: String
)

case class NormalizedString(
    @JsonProperty("@value") _value: String,
    @JsonProperty("@type") _type: String =
      "http://www.w3.org/2001/XMLSchema#normalizedString"
)

object ToolConsumerProfile {
  private val TcpType = "ToolConsumerProfile"
  private val Lti = "http://purl.imsglobal.org/vocab/lti/v2/lti#"
}
