package com.example.javaTemplate.service;

import com.example.javaTemplate.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class BattleServ implements IBattleServ{

    @Override
    public Report battle(Set<Fleet> attacker, Set<Fleet> defender) {
        return null;
    }

    @Override
    public Fleet buildFleet(Resource resource, List<Ship> shipToBuild) {
        return null;
    }

    @Override
    public Report moveFleet() {
        return null;
    }

    @Override
    public Resource gather() {
        return null;
    }

    @Override
    public Planet build() {
        return null;
    }


}
