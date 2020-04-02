package com.superregistry.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;



@Entity
@Table(name = "superhuman")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "superName")
public class SuperHuman {
	
	@Id
	@Column(name="supername")
	private String superName;
	
	@Column(name="humanname")
	private String humanName;
	
	@Column(name="superlocation")
	private String superLocation;
	
	@Column(name="powerlevel")
	private int powerLevel;
	
	
	@JoinColumn(name="alignment")
	@ManyToOne
	@JsonIdentityReference(alwaysAsId = true)
	private Alignment alignment;
	
	@JoinColumn(name="team")
	@ManyToOne
	@JsonIdentityReference(alwaysAsId = true)
	private Team team;

	public String getSuperName() {
		return superName;
	}

	public void setSuperName(String superName) {
		this.superName = superName;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public String getSuperLocation() {
		return superLocation;
	}

	public void setSuperLocation(String superLocation) {
		this.superLocation = superLocation;
	}

	public int getPowerLevel() {
		return powerLevel;
	}

	public void setPowerLevel(int powerLevel) {
		this.powerLevel = powerLevel;
	}




	public Alignment getAlignment() {
		return alignment;
	}

	public void setAlignment(Alignment alignment) {
		this.alignment = alignment;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}


	public SuperHuman(String superName, String humanName, String superLocation, int powerLevel, Alignment alignment,
			Team team) {
		super();
		this.superName = superName;
		this.humanName = humanName;
		this.superLocation = superLocation;
		this.powerLevel = powerLevel;
		this.alignment = alignment;
		this.team = team;
	}

	public SuperHuman() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SuperHuman [superName=" + superName + ", humanName=" + humanName + ", superLocation=" + superLocation
				+ ", powerLevel=" + powerLevel + ", alignnment=" + alignment + ", teamName=" + team + "]";
	}



	
	
	

}
