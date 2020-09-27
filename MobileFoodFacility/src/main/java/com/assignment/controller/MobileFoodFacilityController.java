package com.assignment.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.model.Applicant;
import com.assignment.repository.ApplicantDTO;
import com.assignment.service.MobileFoodFacilityService;

@RestController
@RequestMapping("/api")
public class MobileFoodFacilityController  {

	@Autowired
	MobileFoodFacilityService service;

	@Autowired
	ApplicantDTO dto;

	@GetMapping("/csvload")
	public String csvLoad() throws IOException {
		this.service.parseCSV();
		return "data-loaded";
	}

	@GetMapping("/fetchdata")
	public List<Applicant> readAllData() {
		return (List<Applicant>) dto.findAll();
	}

	@PostMapping("/addData")
	public String addData(@RequestBody List<Applicant> applicant) {
		dto.saveAll(applicant);
		return "data saved sucessfully";
	}

	@DeleteMapping("/deletedata")
	public String deleteData(@RequestBody List<Applicant> applicant) {

		dto.deleteAll(applicant);
		return "data deleted sucessfully";
	}

	@GetMapping("/fetchdata/{applicant}")
	public List<Applicant> findByApplicant(@RequestParam("applicant") String applicant) {
		return dto.findByapplicant(applicant);
	}

	@GetMapping("/fetchdata/{facilityType}")
	public List<Applicant> findByfacilityType(@RequestParam("facilityType") String facilityType) {
		return dto.findByfacilityType(facilityType);
	}

	@GetMapping("/fetchdata/{status}")
	public List<Applicant> findByStatus(@RequestParam("status") String status) {
		return dto.findBystatus(status.toUpperCase());
	}

	@GetMapping("/expired-foodtrucks")
	public List<Applicant> fetchExpiredFoodTrucks() {
		return dto.findAllExpired();
	}
	

}


