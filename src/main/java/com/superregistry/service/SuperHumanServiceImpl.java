package com.superregistry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superregistry.pojos.SuperHuman;
import com.superregistry.repository.SuperHumanRepository;

@Service
public class SuperHumanServiceImpl implements SuperHumanService {
	
	private SuperHumanRepository superHumanRepository;
	
	@Autowired 
	private void setSuperHumanRepository(SuperHumanRepository superHumanRepository) {
		this.superHumanRepository = superHumanRepository;
	}

	@Override
	public List<SuperHuman> getAllSuperHumans() {
		
		return superHumanRepository.findAll();
	}

	@Override
	public SuperHuman getSuperHumanBySuperName(String name) {
		
		return superHumanRepository.getOne(name);
	}

	@Override
	public void addSuperHuman(SuperHuman superHuman) {
		
		if (superHumanRepository.existsById(superHuman.getSuperName())) {
			//TODO Maybe send back something?
		} else {
			
			superHumanRepository.save(superHuman);
		}
		
		
	}

	@Override
	public void updateSuperHuman(SuperHuman superHuman) {
		
		superHumanRepository.save(superHuman);
	}

	@Override
	public void removeSuperHuman(String name) {
		
		superHumanRepository.deleteById(name);

	}

}
