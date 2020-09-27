package com.assignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.opencsv.bean.CsvBindByName;


@Entity
@Table(name = "applicants")
public class Applicant {

	@Id
	@CsvBindByName
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long locationId;
     
	@CsvBindByName
	private String applicant;
	
	@CsvBindByName
	private String facilityType;
	
	@CsvBindByName
	private long cnn;
	
	@CsvBindByName
	private String locationDescription;
	
	@CsvBindByName
	private String address;
	
	@CsvBindByName
	private String blocklot;
	
	@CsvBindByName
	private String block;
	
	@CsvBindByName
	private String lot;
	
	@CsvBindByName
	private String permit;
	
	@CsvBindByName
	private String status;
	
	@CsvBindByName
	@Column(length=1000)
	private String foodItems;
	
	@CsvBindByName
	private double x;
	
	@CsvBindByName
	private double y;
	
	@CsvBindByName
	private double latitude;
	
	@CsvBindByName
	private double longitude;
	
	@CsvBindByName
	@Column(length=1000)
	private String schedule;
	
	@CsvBindByName
	private String noiSent;
	
	@CsvBindByName
	private String approved;
	
	@CsvBindByName
	private String received;
	
	@CsvBindByName
	private Boolean priorPermit;
	
	@CsvBindByName
	private String expirationDate;
	

	public Applicant() {
		super();
	}

	
	 public long getLocationId() {
		return locationId;
	}


	public void setLocationId(long locationId) {
		this.locationId = locationId;
	}


	public String getApplicant() {
		return applicant;
	}


	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}


	public String getFacilityType() {
		return facilityType;
	}


	public void setFacilityType(String facilityType) {
		this.facilityType = facilityType;
	}


	public long getCnn() {
		return cnn;
	}


	public void setCnn(long cnn) {
		this.cnn = cnn;
	}


	public String getLocationDescription() {
		return locationDescription;
	}


	public void setLocationDescription(String locationDescription) {
		this.locationDescription = locationDescription;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getBlocklot() {
		return blocklot;
	}


	public void setBlocklot(String blocklot) {
		this.blocklot = blocklot;
	}


	public String getBlock() {
		return block;
	}


	public void setBlock(String block) {
		this.block = block;
	}


	public String getLot() {
		return lot;
	}


	public void setLot(String lot) {
		this.lot = lot;
	}


	public String getPermit() {
		return permit;
	}


	public void setPermit(String permit) {
		this.permit = permit;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getFoodItems() {
		return foodItems;
	}


	public void setFoodItems(String foodItems) {
		this.foodItems = foodItems;
	}


	public double getX() {
		return x;
	}


	public void setX(long x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(long y) {
		this.y = y;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public String getSchedule() {
		return schedule;
	}


	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}


	public String getNoiSent() {
		return noiSent;
	}


	public void setNoiSent(String noiSent) {
		this.noiSent = noiSent;
	}


	public String getApproved() {
		return approved;
	}


	public void setApproved(String approved) {
		this.approved = approved;
	}


	public String getReceived() {
		return received;
	}


	public void setReceived(String received) {
		this.received = received;
	}


	public Boolean getPriorPermit() {
		return priorPermit;
	}


	public void setPriorPermit(Boolean priorPermit) {
		this.priorPermit = priorPermit;
	}


	public String getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}


	@Override
	 public String toString() {
	 	return "Applicant [locationId=" + locationId + ", applicant=" + applicant + ", facilityType=" + facilityType
	 			+ ", cnn=" + cnn + ", locationDescription=" + locationDescription + ", address=" + address + ", blocklot="
	 			+ blocklot + ", block=" + block + ", lot=" + lot + ", permit=" + permit + ", status=" + status
	 			+ ", foodItems=" + foodItems + ", x=" + x + ", y=" + y + ", latitude=" + latitude + ", longitude="
	 			+ longitude + ", schedule=" + schedule + ", noiSent=" + noiSent + ", approved=" + approved + ", received="
	 			+ received + ", priorPermit=" + priorPermit + ", expirationData=" + expirationDate + "]";
	 }

}
