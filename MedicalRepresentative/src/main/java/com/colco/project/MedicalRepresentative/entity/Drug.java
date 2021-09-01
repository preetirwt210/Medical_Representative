package com.colco.project.MedicalRepresentative.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="drugs")
public class Drug {

	public Drug() {
		
	}
	
	@Id
	@Column(name="drug_id")
	private int id;
	
	@Column(name="drug_name")
	private String drugName;

	
	public Drug(String drugName) {
		super();
		this.drugName = drugName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	@Override
	public String toString() {
		return "Drug [id=" + id + ", drugName=" + drugName + "]";
	}
	
	
}
