package com.example.demo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties
@Data
public class DocumentTypeConfiguration {

    private Map<String, Map<String, List<String>>> documentTypes;

}

