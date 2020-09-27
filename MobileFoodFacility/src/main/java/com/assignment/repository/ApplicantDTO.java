package com.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assignment.model.Applicant;

@Repository
public interface ApplicantDTO extends JpaRepository<Applicant, Long> {

  public List<Applicant> findByapplicant(String applicant);

  public List<Applicant> findByfacilityType(String facilityType);

  public List<Applicant> findBystatus(String status);
  
  
 // @Query("SELECT a FROM Applicants a WHERE a.status = EXPIRED")
  @Query( value = "SELECT * FROM APPLICANTS  WHERE status = 'EXPIRED'",  nativeQuery = true)
  public  List<Applicant> findAllExpired();

}
