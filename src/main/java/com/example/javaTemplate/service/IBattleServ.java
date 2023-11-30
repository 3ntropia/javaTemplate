package com.example.javaTemplate.service;

import com.example.javaTemplate.domain.*;

import java.util.List;
import java.util.Set;

public interface IBattleServ {

    Report battle(Set<Fleet> attacker, Set<Fleet> defender);

    Fleet buildFleet(Resource resource, List<Ship> shipToBuild);

    Report moveFleet();

    Resource gather();

    Planet build();

}
