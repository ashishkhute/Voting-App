package com.projects.votingapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.votingapp.model.Voter;
import com.projects.votingapp.repository.VoterRepository;

@Service
public class VoterServiceImpl implements VoterService{
	
	@Autowired
	private VoterRepository voterRepository;

	@Override
	public Voter addVoter(Voter voter) {
		return voterRepository.save(voter);
		
	}

	@Override
	public Voter findVoterByVoterId(Long voterId) {
		
		return voterRepository.getByVoterId(voterId);
	}



}
