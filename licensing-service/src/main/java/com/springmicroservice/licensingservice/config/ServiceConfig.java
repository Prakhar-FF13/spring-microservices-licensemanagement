package com.springmicroservice.licensingservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "example")
public class ServiceConfig{
    private String property;
}
