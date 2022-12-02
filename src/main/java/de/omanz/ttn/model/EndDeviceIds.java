
package de.omanz.ttn.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;


@Getter
@Jacksonized
@Builder
@EqualsAndHashCode
public class EndDeviceIds {

    @JsonProperty("device_id")
    private final String deviceId;
    @JsonProperty("application_ids")
    private final ApplicationIds applicationIds;
    @JsonProperty("dev_eui")
    private final String devEui;
    @JsonProperty("join_eui")
    private final String joinEui;
    @JsonProperty("dev_addr")
    private final String devAddr;

}
