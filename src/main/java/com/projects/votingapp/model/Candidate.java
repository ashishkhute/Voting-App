package com.projects.votingapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="candidates")
public class Candidate {
	
	@Id
	private Long candidateId;
	
	@Column(nullable=false, unique=true)
	private String candidateName;

	public Long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@Override
	public String toString() {
		return "Candidate [candidateId=" + candidateId + ", candidateName=" + candidateName + "]";
	}

	public Candidate(Long candidateId, String candidateName) {
		super();
		this.candidateId = candidateId;
		this.candidateName = candidateName;
	}

	public Candidate() {
		super();
		
	}
	
	
	

}
