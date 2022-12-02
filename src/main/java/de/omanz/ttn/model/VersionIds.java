
package de.omanz.ttn.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.jackson.Jacksonized;

@Builder
@Jacksonized
@Getter
@ToString
@EqualsAndHashCode
public class VersionIds {

    @JsonProperty("brand_id")
    private final String brandId;
    @JsonProperty("model_id")
    private final String modelId;
    @JsonProperty("hardware_version")
    private final String hardwareVersion;
    @JsonProperty("firmware_version")
    private final String firmwareVersion;
    @JsonProperty("band_id")
    private final String bandId;

}
