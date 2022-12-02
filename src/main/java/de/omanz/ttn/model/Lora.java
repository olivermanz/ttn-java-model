
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
public class Lora {

    @JsonProperty("bandwidth")
    private final Long bandwidth;
    @JsonProperty("spreading_factor")
    private final Long spreadingFactor;

}
