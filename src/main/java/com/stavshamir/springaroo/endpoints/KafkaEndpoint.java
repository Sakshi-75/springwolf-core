package com.stavshamir.springaroo.endpoints;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class KafkaEndpoint {

    private String methodName;
    private String[] topics;
    private Class<?> payloadType;

}
