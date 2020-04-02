package com.superregistry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.superregistry.pojos.SuperHuman;
import com.superregistry.pojos.Team;
import com.superregistry.service.TeamService;

@RestController
public class TeamController {
	
	private TeamService teamService;
	
	@Autowired
	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}
	
	@GetMapping(path= "/super-team")
	public List<Team> getAllTeams(){
		return teamService.getAllTeams();
	}
	
	@GetMapping(path= "/super-team/{team-name}")
	public Team getTeamByTeamName (@PathVariable String teamName) {
		return teamService.getTeamByTeamName(teamName);
	}
	
	@PostMapping(path = "/super-team")
	public ResponseEntity<HttpStatus> addTeam (@RequestBody Team team) {
		teamService.addTeam(team);;
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	@PutMapping(path = "/super-team/{super-team}/super-human")
	public ResponseEntity<HttpStatus> updateTeam (@RequestBody SuperHuman superHuman, @PathVariable String name) {
		teamService.updateTeam(name, superHuman);
		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(path = "/super-team")
	public ResponseEntity<HttpStatus> removeTeam (@RequestBody Team team) {
		teamService.removeTeam(team.getTeamName());;;
		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}

}
