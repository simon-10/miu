package com.medical.hcmc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medical.hcmc.model.Patient;
import com.medical.hcmc.repository.PatientRepository;

@Service
@Transactional
public class PatientService {
	@Autowired
	private PatientRepository patientRepository;
	
	public List<Patient> getPatients() {
		
		return (List<Patient>) patientRepository.findAll();
	}

}
