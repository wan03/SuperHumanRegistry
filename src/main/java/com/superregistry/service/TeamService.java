package com.superregistry.service;

import java.util.List;

import com.superregistry.pojos.SuperHuman;
import com.superregistry.pojos.Team;



public interface TeamService {
	
	public List<Team> getAllTeams();
	
	public Team  getTeamByTeamName(String name);
	
	public void addTeam(Team team);
	
	public void updateTeam(String name, SuperHuman superHumand);
	
	public void removeTeam(String name);	
	

}
