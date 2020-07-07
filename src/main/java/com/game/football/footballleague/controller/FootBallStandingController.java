package com.game.football.footballleague.controller;

import com.game.football.footballleague.dto.TeamStandingDto;
import com.game.football.footballleague.model.TeamStandingRequest;
import com.game.football.footballleague.services.TeamStandingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api/service/v1/team/standing")
public class FootBallStandingController {

    private final TeamStandingService teamStandingService;

    @Autowired
    public FootBallStandingController(
            TeamStandingService teamStandingService) {
        this.teamStandingService = teamStandingService;
    }

    @GetMapping
    public ResponseEntity<TeamStandingDto> getStandings(@Valid TeamStandingRequest teamStandingRequest) {
        return ResponseEntity.ok(teamStandingService.getTeamStanding(teamStandingRequest));
    }


}