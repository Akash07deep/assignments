package com.assignment.service;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.model.Applicant;
import com.assignment.repository.ApplicantDTO;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

@Service
public class MobileFoodFacilityService {

	@Autowired
	private ApplicantDTO dto;

	public List<Applicant> parseCSV() throws IOException {
		String filePath = "src/main/resources/datasets_mobile-food-facility-permit.csv";

		Reader reader = Files.newBufferedReader(Paths.get(filePath));

		CsvToBean<Applicant> csvToBean = new CsvToBeanBuilder<Applicant>(reader).withType(Applicant.class)
				.withIgnoreLeadingWhiteSpace(true).build();

		List<Applicant> appl = csvToBean.parse();
		this.dto.saveAll(appl);
		return appl;

	}

}
