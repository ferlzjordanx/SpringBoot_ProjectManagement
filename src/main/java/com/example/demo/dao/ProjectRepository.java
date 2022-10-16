package com.example.demo.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Project;


public interface ProjectRepository extends CrudRepository<Project, Long>{

	@Override
	public List<Project> findAll();
	
}