
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
public class Settings {

    @JsonProperty("data_rate")
    private final DataRate dataRate;
    @JsonProperty("coding_rate")
    private final String codingRate;
    @JsonProperty("frequency")
    private final String frequency;
    @JsonProperty("timestamp")
    private final Long timestamp;

}
