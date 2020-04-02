package com.superregistry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superregistry.pojos.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {

}
