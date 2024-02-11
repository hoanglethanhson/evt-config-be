package com.example.evtconfigdemo.service;

import com.example.evtconfigdemo.dto.request.ConfigRequestDTO;
import com.example.evtconfigdemo.entity.Config;
import com.example.evtconfigdemo.repository.ConfigRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class ConfigService {
    private final ConfigRepository configRepository;

    public ConfigService(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    public Config getConfig(String id) {
        return configRepository.findById(id).orElse(null);
    }

    public void createConfig(ConfigRequestDTO requestDTO) {
        log.info("Creating config: {}", requestDTO);
        Config config = ConfigRequestDTO.toEntity(requestDTO);
        log.info("Created config: {}", config);
        configRepository.save(config);
    }
}
