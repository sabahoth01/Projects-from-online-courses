package com.web.webh2.api.repository;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Configuration
@ConfigurationProperties(prefix = "com.web.webh2")
@Data
public class CustomProperties {

    private String apiUrl;

}