package com.superregistry.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "team")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "teamName")
public class Team {
	
	@Id
	@Column(name="teamname")
	private String teamName;
	
	@Column(name="teamlocation")
	private String teamLocation;
	
	@OneToMany(mappedBy = "team", fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = SuperHuman.class)
	private List<SuperHuman> teamMembers = new ArrayList<SuperHuman>();
	
	@Column(name="active")
	private boolean active;
	
	@Column(name="sanctioned")
	private boolean sanctioned;

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamLocation() {
		return teamLocation;
	}

	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isSanctioned() {
		return sanctioned;
	}

	public void setSanctioned(boolean sanctioned) {
		this.sanctioned = sanctioned;
	}
	
	

	public List<SuperHuman> getTeamMembers() {
		return teamMembers;
	}

	public void setTeamMembers(List<SuperHuman> teamMembers) {
		this.teamMembers = teamMembers;
	}

	

	public Team(String teamName, String teamLocation, List<SuperHuman> teamMembers, boolean active,
			boolean sanctioned) {
		super();
		this.teamName = teamName;
		this.teamLocation = teamLocation;
		this.teamMembers = teamMembers;
		this.active = active;
		this.sanctioned = sanctioned;
	}
	
	

	public Team(String teamName) {
		super();
		this.teamName = teamName;
	}
	
	

	public Team() {
		super();
	}

	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", teamLocation=" + teamLocation + ", teamMembers=" + teamMembers
				+ ", active=" + active + ", sanctioned=" + sanctioned + "]";
	}


	

}
