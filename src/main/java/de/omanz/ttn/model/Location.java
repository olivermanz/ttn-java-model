
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
public class Location {

    @JsonProperty("latitude")
    private final Double latitude;
    @JsonProperty("longitude")
    private final Double longitude;
    @JsonProperty("source")
    private final String source;

}
