package com.example.evtconfigdemo.dto.request;

import com.example.evtconfigdemo.entity.Config;
import com.github.f4b6a3.ulid.UlidCreator;
import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConfigRequestDTO {
    private String value;

    public static Config toEntity(ConfigRequestDTO configRequestDTO) {
        long currentTimeMillis = System.currentTimeMillis();
        return Config.builder()
                .version(UlidCreator.getUlid().toString())
                .value(configRequestDTO.getValue())
                .build();
    }
}
