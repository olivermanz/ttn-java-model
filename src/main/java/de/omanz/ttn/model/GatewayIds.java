
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
public class GatewayIds {

    @JsonProperty("gateway_id")
    private final String gatewayId;
    @JsonProperty("eui")
    private final String eui;

}
