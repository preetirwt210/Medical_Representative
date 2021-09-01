package com.colco.project.MedicalRepresentative.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colco.project.MedicalRepresentative.entity.Representative;


public interface RepresentativeRepository extends JpaRepository<Representative,Integer> {

}
