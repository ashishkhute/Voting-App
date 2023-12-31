package com.projects.votingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projects.votingapp.model.Candidate;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long>{

}
