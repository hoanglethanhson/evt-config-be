package com.example.evtconfigdemo.dto.request;

import com.example.evtconfigdemo.entity.Config;
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
        return Config.builder()
                .id(UUID.randomUUID().toString())
                .value(configRequestDTO.getValue())
                .build();
    }
}
