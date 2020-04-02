package com.superregistry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superregistry.pojos.SuperHuman;
import com.superregistry.pojos.Team;
import com.superregistry.repository.TeamRepository;

@Service
public class TeamServiceImpl implements TeamService {
	
	private TeamRepository teamRepository;
	
	@Autowired 
	private void setTeamRepository(TeamRepository teamRepository) {
		this.teamRepository = teamRepository;
	}

	@Override
	public List<Team> getAllTeams() {
	
		return teamRepository.findAll();
	}

	@Override
	public Team getTeamByTeamName(String name) {
		
		return teamRepository.getOne(name);
	}

	@Override
	public void addTeam(Team team) {
		if (teamRepository.existsById(team.getTeamName())) {
			//TODO Maybe send back something?
		} else {
			
			teamRepository.save(team);
		}

	}

	@Override
	public void updateTeam(String name, SuperHuman superHuman) {
		// TODO Implement this
		//teamRepository.save();

	}

	@Override
	public void removeTeam(String name) {
		
		teamRepository.deleteById(name);

	}

}
