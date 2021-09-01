package com.colco.project.MedicalRepresentative.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.colco.project.MedicalRepresentative.dao.RepresentativeRepository;
import com.colco.project.MedicalRepresentative.entity.Representative;

@Service
public class RepresentativeServiceImp implements RepresentativeService {

	
	private RepresentativeRepository repository;
	
	public RepresentativeServiceImp(RepresentativeRepository theRepository) {
		this.repository=theRepository;
	}
	
	@Override
	public List<Representative> findAll(){
		return repository.findAll();
	}
	
	@Override
	public Representative findById(int theId){
		Optional<Representative> result=repository.findById(theId);
		Representative theRepresentative = null;
		
				if(result.isPresent()){
					theRepresentative=result.get();
				}else {
					throw new RuntimeException("Did not find representative id: " + theId);
				}
				return theRepresentative;
	}
	
	@Override
	public void save(Representative representative) {
		 repository.save(representative);
	}
	
	@Override
	public void delete(int theId) {
		repository.deleteById(theId);
	}
}
