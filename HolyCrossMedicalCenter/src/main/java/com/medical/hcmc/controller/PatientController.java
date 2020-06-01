package com.medical.hcmc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medical.hcmc.model.Patient;
import com.medical.hcmc.service.PatientService;

@RestController
@RequestMapping
public class PatientController {
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patients")
	public List<Patient> getPatients() {
		
		
		return patientService.getPatients();
	}
	
	@GetMapping("/")
	public String get() {
		return "hello";
	}

}
