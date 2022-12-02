
package de.omanz.ttn.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Jacksonized
@Getter
@EqualsAndHashCode
public class TTNMessage {

    @JsonProperty("end_device_ids")
    private final EndDeviceIds endDeviceIds;

    @JsonProperty("correlation_ids")
    private final List<String> correlationIds;

    @JsonProperty("received_at")
    private final LocalDateTime receivedAt;

    @JsonProperty("uplink_message")
    private final UplinkMessage uplinkMessage;

}
