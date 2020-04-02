package com.superregistry.service;

import java.util.List;

import com.superregistry.pojos.SuperHuman;

public interface SuperHumanService {
	
	public List<SuperHuman> getAllSuperHumans();
	
	public SuperHuman  getSuperHumanBySuperName(String name);
	
	public void addSuperHuman(SuperHuman superHuman);
	
	public void updateSuperHuman(SuperHuman superHuman);
	
	public void removeSuperHuman(String name);	
	

}
