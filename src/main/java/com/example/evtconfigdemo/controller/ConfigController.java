package com.example.evtconfigdemo.controller;

import com.example.evtconfigdemo.dto.request.ConfigRequestDTO;
import com.example.evtconfigdemo.entity.Config;
import com.example.evtconfigdemo.service.ConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@Slf4j
public class ConfigController {
    private final ConfigService configService;

    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @GetMapping("/config/{id}")
    public Config getConfig(@PathVariable String id) {
        return configService.getConfig(id);
    }

    @PostMapping("/config-create")
    public void createConfig(@RequestBody ConfigRequestDTO requestDTO) {
        configService.createConfig(requestDTO);
    }

    @PostMapping("/config-create-gzip")
    public void createConfigGzip(@RequestBody String gzipData) {
        log.info("Gzip data: {}", gzipData);
    }
}
