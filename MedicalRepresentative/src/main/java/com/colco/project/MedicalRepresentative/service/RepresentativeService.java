package com.colco.project.MedicalRepresentative.service;

import java.util.List;

import com.colco.project.MedicalRepresentative.entity.Representative;

public interface RepresentativeService {

	public List<Representative> findAll();
	public Representative findById(int theId);
	public void save(Representative representative);
	public void delete(int theId);
	
}
