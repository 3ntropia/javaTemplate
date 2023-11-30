package com.example.javaTemplate.controller;

import com.example.javaTemplate.domain.Fleet;
import com.example.javaTemplate.domain.Report;
import com.example.javaTemplate.service.BattleServ;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Set;

@Controller("battle")
public class BattleController {

    private final BattleServ battleServ;

    public BattleController(BattleServ battleServ) {
        this.battleServ = battleServ;
    }

    @PostMapping("/")
    public Report battle(@RequestBody Set<Fleet> attacker,@RequestBody Set<Fleet> defender){
        return battleServ.battle(attacker, defender);
    }

}
