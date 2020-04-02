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
import com.superregistry.service.SuperHumanService;

@RestController
public class SuperHumanController {
	
	private SuperHumanService superHumanService;
	
	@Autowired
	public void setSuperHumanService(SuperHumanService superHumanService) {
		this.superHumanService = superHumanService;
	}
	
	@GetMapping(path= "/super-human")
	public List<SuperHuman> getAllSuperhuman(){
		return superHumanService.getAllSuperHumans();
	}
	
	@GetMapping(path= "/super-human/{super-name}")
	public SuperHuman getSuperHumanByName (@PathVariable String superName) {
		return superHumanService.getSuperHumanBySuperName(superName);
	}
	
	@PostMapping(path = "/super-human")
	public ResponseEntity<HttpStatus> addSuperHuman (@RequestBody SuperHuman superHuman) {
		superHumanService.addSuperHuman(superHuman);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	@PutMapping(path = "/super-human")
	public ResponseEntity<HttpStatus> updateSuperHuman (@RequestBody SuperHuman superHuman) {
		superHumanService.updateSuperHuman(superHuman);
		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping(path = "/super-human")
	public ResponseEntity<HttpStatus> deleteSuperHuman (@RequestBody SuperHuman superHuman) {
		superHumanService.removeSuperHuman(superHuman.getSuperName());
		return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
	}
	

}
