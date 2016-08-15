package net.paulgray.lti

import com.github.jsonldjava.core.{JsonLdProcessor, JsonLdOptions}
import com.github.jsonldjava.utils.JsonUtils
import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by pfbgray on 8/11/16.
 */
class ToolConsumerProfileTest extends FlatSpec with Matchers {

  "ToolConsumerProfile" should "parse a profile correctly" in {
    //
    val tcp = getClass.getResourceAsStream("/tcps/tcp.jsonld")

    val options = new JsonLdOptions()

    val compacted = JsonLdProcessor.compact(JsonUtils.fromInputStream(tcp), null, options)
    //IOUtils.copy(tcp, System.out)
    System.out.println(JsonUtils.toPrettyString(compacted))
  }

  val compact = 

  def compact(a: Any)(implicit opts: JsonLdOptions) = JsonLdProcessor.compact(a, null, opts)
  def expand(a: Any)(implicit opts: JsonLdOptions) = JsonLdProcessor.expand(a, null, opts)
  def flatten(a: Any)(implicit opts: JsonLdOptions) = JsonLdProcessor.flatten(a, null, opts)
  def normalize(a: Any)(implicit opts: JsonLdOptions) = JsonLdProcessor.normalize(a, null, opts)
}
