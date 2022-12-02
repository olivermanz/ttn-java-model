
package de.omanz.ttn.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
@Getter
@EqualsAndHashCode
public class RxMetadatum {

    @JsonProperty("gateway_ids")
    private final GatewayIds gatewayIds;
    @JsonProperty("timestamp")
    private final Long timestamp;
    @JsonProperty("rssi")
    private final Long rssi;
    @JsonProperty("channel_rssi")
    private final Long channelRssi;
    @JsonProperty("snr")
    private final Double snr;
    @JsonProperty("frequency_offset")
    private final String frequencyOffset;
    @JsonProperty("location")
    private final Location location;
    @JsonProperty("uplink_token")
    private final String uplinkToken;
    @JsonProperty("channel_index")
    private final Long channelIndex;
    @JsonProperty("received_at")
    private final String receivedAt;

}
