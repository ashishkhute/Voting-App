package com.projects.votingapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.projects.votingapp.model.Voter;
import com.projects.votingapp.service.VoterService;


@Controller
public class VoterController {
	
	@Autowired
	private VoterService voterService;
	
	@GetMapping("/register")
    public String RegistrationForm(Model model){
        
        Voter voter = new Voter();
        model.addAttribute("voter", voter);
        return "register";
    }
	

	@PostMapping("/register")
	public String addVoter(@Valid@ModelAttribute("voter") Voter voter, BindingResult result, Model model)
	{
		Voter existingVoter = voterService.findVoterByVoterId(voter.getVoterId());

        if(existingVoter != null ){
            result.rejectValue("voter", null,
                    "There is already an voter registered with the same Voter Id");
        }

        if(result.hasErrors()){
            model.addAttribute("voter", voter);
            return "/register";
        }
		 voterService.addVoter(voter);
		 return "redirect:/index?success";
	}
}


