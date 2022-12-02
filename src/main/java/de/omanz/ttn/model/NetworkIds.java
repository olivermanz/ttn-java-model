
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
public class NetworkIds {

    @JsonProperty("net_id")
    private final String netId;
    @JsonProperty("tenant_id")
    private final String tenantId;
    @JsonProperty("cluster_id")
    private final String clusterId;
    @JsonProperty("cluster_address")
    private final String clusterAddress;


}
