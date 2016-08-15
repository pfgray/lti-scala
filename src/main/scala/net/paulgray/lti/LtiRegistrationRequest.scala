package net.paulgray.lti

/**
  * @author pfbgray
  */
case class LtiRegistrationRequest(
    launchPresentationUrl: String,
    ltiMessageType: String,
    ltiVersion: String,
    registrationKey: String,
    registrationPassword: String,
    toolConsumerProfileUrl: String
)
