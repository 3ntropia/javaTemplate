package com.example.javaTemplate.daos;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record ResourceDAO(Integer metal,
        Integer minerals,
        Integer fuel) {
}
