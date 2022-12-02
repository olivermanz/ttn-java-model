package de.omanz.ttn.factory;


import com.fasterxml.jackson.databind.ObjectMapper;
import de.omanz.ttn.model.EndDeviceIds;
import de.omanz.ttn.model.TTNMessage;
import de.omanz.ttn.model.UplinkMessage;
import de.omanz.ttn.model.VersionIds;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class TTNObjectMapperFactoryTest {

    @Test
    @SneakyThrows
    void roundtripTest() {
        TTNMessage testData = constructTestData();
        ObjectMapper mapper = TTNObjectMapperFactory.getInstance().constructObjectMapper();

        String serialized = mapper.writeValueAsString(testData);
        TTNMessage deserialized = mapper.readerFor(TTNMessage.class).readValue(serialized);

        assertThat(deserialized).isEqualTo(testData);
    }

    private TTNMessage constructTestData() {
        return TTNMessage.builder()
                .receivedAt(LocalDateTime.now())
                .endDeviceIds(constructEndDeviceIds())
                .uplinkMessage(constructUplinkMessage())
                .build();
    }

    private static EndDeviceIds constructEndDeviceIds() {
        return EndDeviceIds.builder().deviceId("sensor1").devEui("EU123").build();
    }

    private static UplinkMessage constructUplinkMessage() {
        return UplinkMessage.builder()
                .frmPayload(new byte[]{0x01,0x02,0x03})
                .versionIds(VersionIds.builder()
                        .firmwareVersion("v1.0.0")
                        .brandId("Honolulu")
                        .modelId("CoolDevice")
                        .bandId("EU868")
                        .build())
                .build();
    }
}