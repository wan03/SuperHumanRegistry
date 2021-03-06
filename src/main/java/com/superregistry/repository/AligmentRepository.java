package com.superregistry.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superregistry.pojos.Alignment;

@Repository
public interface AligmentRepository extends JpaRepository<Alignment, String> {

}
