package com.medical.hcmc.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long patientId;
	private String patientNumber;
	private String isAnOutPatient;
	private String fullName;
	private String emailAddress;
	private String contactPhoneNumber;
	private LocalDate dateOfBirth;
	
	public Patient() {
		super();
	}

	public Patient(String patientNumber, String isAnOutPatient, String fullName, String emailAddress,
			String contactPhoneNumber, LocalDate dateOfBirth) {
		super();
		this.patientNumber = patientNumber;
		this.isAnOutPatient = isAnOutPatient;
		this.fullName = fullName;
		this.emailAddress = emailAddress;
		this.contactPhoneNumber = contactPhoneNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(String patientNumber) {
		this.patientNumber = patientNumber;
	}

	public String getIsAnOutPatient() {
		return isAnOutPatient;
	}

	public void setIsAnOutPatient(String isAnOutPatient) {
		this.isAnOutPatient = isAnOutPatient;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}

	public void setContactPhoneNumber(String contactPhoneNumber) {
		this.contactPhoneNumber = contactPhoneNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return String.format(
				"Patient [patientId=%s, patientNumber=%s, isAnOutPatient=%s, fullName=%s, emailAddress=%s, contactPhoneNumber=%s, dateOfBirth=%s]",
				patientId, patientNumber, isAnOutPatient, fullName, emailAddress, contactPhoneNumber, dateOfBirth);
	}
	
	
	
	
	
	

}
