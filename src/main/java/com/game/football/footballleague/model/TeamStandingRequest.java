package com.game.football.footballleague.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TeamStandingRequest {

    @NotBlank
    private String teamName;
    @NotBlank
    private String countryName;
    @NotBlank
    private String leagueName;
}