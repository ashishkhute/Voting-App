package com.projects.votingapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.projects.votingapp.service.CandidateService;

@Controller
public class CandidateController {
	
	
	private CandidateService candidateService; 
	
	@GetMapping("/dashboard")
	public String listCandidates(Model model) {
		model.addAttribute("item", candidateService.getAllCandidates());
		return "dashboard";
	}

}
