package com.Spring.Interview_Panel.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Interview_Panel.Model.Members;
import com.Spring.Interview_Panel.Service.MemberServiceIMPL;
							
@RestController
@RequestMapping("/api/v2")
public class Controller {
	
	public MemberServiceIMPL impl;
	
	public Controller(MemberServiceIMPL implmentation) {
		this.impl=implmentation;
	}
	
	@GetMapping("/getMemberDetails") 
	@CrossOrigin

	public List<Members> getMembers() {
		return impl.getMember();
	}
}
