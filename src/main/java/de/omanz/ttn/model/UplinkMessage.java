
package de.omanz.ttn.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.std.ByteArraySerializer;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

import java.util.List;

@Builder
@Jacksonized
@Getter
@EqualsAndHashCode
public class UplinkMessage {

    @JsonProperty("session_key_id")
    private final String sessionKeyId;
    @JsonProperty("f_port")
    private final Long fPort;
    @JsonProperty("f_cnt")
    private final Long fCnt;
    @JsonProperty("frm_payload")
    @JsonSerialize(using= ByteArraySerializer.class)
    private final byte[] frmPayload;
    @JsonProperty("decoded_payload")
    private final ObjectNode decodedPayload;
    @JsonProperty("rx_metadata")
    private final List<RxMetadatum> rxMetadata = null;
    @JsonProperty("settings")
    private final Settings settings;
    @JsonProperty("received_at")
    private final String receivedAt;
    @JsonProperty("consumed_airtime")
    private final String consumedAirtime;
    @JsonProperty("version_ids")
    private final VersionIds versionIds;
    @JsonProperty("network_ids")
    private final NetworkIds networkIds;

}
