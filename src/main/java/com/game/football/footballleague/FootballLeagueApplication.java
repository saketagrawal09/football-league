package com.game.football.footballleague;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class FootballLeagueApplication {

	public static void main(String[] args) {
		SpringApplication.run(FootballLeagueApplication.class, args);
	}

	// Hit the URL to access it http://localhost:8085/api/service/v1/team/standing?teamName=Leeds&countryName=England&leagueName=Championship

}
