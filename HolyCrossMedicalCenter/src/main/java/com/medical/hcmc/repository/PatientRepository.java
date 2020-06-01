package com.medical.hcmc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.medical.hcmc.model.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {

}
