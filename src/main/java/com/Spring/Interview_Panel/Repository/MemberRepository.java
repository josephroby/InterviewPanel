package com.Spring.Interview_Panel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Interview_Panel.Model.Members;

public interface MemberRepository extends JpaRepository<Members, Integer>{}

