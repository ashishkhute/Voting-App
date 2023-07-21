package com.projects.votingapp.service;

import com.projects.votingapp.model.Voter;

public interface VoterService {

	Voter addVoter(Voter voter);
	
	Voter findVoterByVoterId(Long voterId);

}
