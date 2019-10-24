package com.dela.microservicelimitsservice.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LimitConfiguration {

    @Getter private int maximum;
    @Getter private int minimum;

}
