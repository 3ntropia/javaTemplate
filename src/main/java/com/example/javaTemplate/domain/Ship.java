package com.example.javaTemplate.domain;

import lombok.Data;
import org.apache.tomcat.util.file.ConfigurationSource;

@Data
public class Ship {
    private String name;
    private Integer health;
    private Integer lightArmor;
    private Integer heavyArmor;
    private Integer armorPen;
    private Integer shield;
    private Integer speed;
    private Integer construction;
    private Integer units;
    private Resource costs;
}
