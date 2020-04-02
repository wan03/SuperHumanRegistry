package com.superregistry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superregistry.pojos.SuperHuman;

@Repository
public interface SuperHumanRepository extends JpaRepository<SuperHuman, String> {

}
