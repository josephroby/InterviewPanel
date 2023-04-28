package com.Spring.Interview_Panel.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.Interview_Panel.Model.Members;
import com.Spring.Interview_Panel.Repository.MemberRepository;

@Service
public class MemberServiceIMPL implements MemberServiceInterface {

	@Autowired
	private MemberRepository repository;
	
	 public List<Members> getMember() { 
		 List<Members> memeList=new ArrayList<Members>(); 
		 memeList = repository.findAll(); 
		 return memeList;
	  }
	 	
}
