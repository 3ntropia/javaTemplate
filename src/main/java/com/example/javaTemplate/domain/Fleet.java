package com.example.javaTemplate.domain;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Fleet {

    private Set<Fleet> shipSet = new HashSet<>();

}
