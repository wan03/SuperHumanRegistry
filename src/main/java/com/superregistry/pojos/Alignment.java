package com.superregistry.pojos;

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
@Table(name = "alignment")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "designation")
public class Alignment {
	
	@Id
	@Column(name="designation")
	private String designation;
	
	@Column(name="currentlawstatus")
	private String currentLawStatus;
	
	@OneToMany(mappedBy = "alignment", fetch = FetchType.EAGER, cascade = CascadeType.ALL, targetEntity = SuperHuman.class)
	private List<SuperHuman> superHuman;
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getCurrentLawStatus() {
		return currentLawStatus;
	}

	public void setCurrentLawStatus(String currentLawStatus) {
		this.currentLawStatus = currentLawStatus;
	}

	@Override
	public String toString() {
		return "Alignment [designation=" + designation + ", currentLawStatus=" + currentLawStatus + "]";
	}



	public Alignment(String designation, String currentLawStatus, List<SuperHuman> superHuman) {
		super();
		this.designation = designation;
		this.currentLawStatus = currentLawStatus;
		this.superHuman = superHuman;
	}

	public Alignment(String designation) {
		super();
		this.designation = designation;
	}

	public Alignment() {
		super();
	}
	
	
	
	
	
	

}
