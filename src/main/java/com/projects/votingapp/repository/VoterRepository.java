package com.projects.votingapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projects.votingapp.model.Voter;

@Repository
public interface VoterRepository extends JpaRepository< Voter, Long > {
	Voter getByVoterId(Long voterId);

}
