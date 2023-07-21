package com.projects.votingapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.projects.votingapp.model.Candidate;
import com.projects.votingapp.repository.CandidateRepository;

public class CandidateServiceImpl implements CandidateService {
	
	@Autowired
	private CandidateRepository candidateRepository;

	@Override
	public List<Candidate> getAllCandidates() {
		return candidateRepository.findAll();
		
	}

}
