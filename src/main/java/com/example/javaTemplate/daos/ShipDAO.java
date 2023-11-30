package com.example.javaTemplate.daos;

import com.example.javaTemplate.domain.Resource;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public record ShipDAO(@Id Integer id,
        String name,
        Integer health,
        Integer lightArmor,
        Integer heavyArmor,
        Integer armorPen,
        Integer shield,
        Integer speed,
        Integer construction,
        Integer units,
        Resource costs) {
}
