package com.studentregistration.demo.entity;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "parkinglist")
public class Parking {
//	 "license_plate": "",
//	    "mobileNo": "",
//	    "vehicle_type": "",
//	    "entry_date": "2023-05-20T12:12:47.483Z",
//	    "ticket_amount": ""
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	long id;
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	String license_plate;
	Long mobileNo;
	String vehicle_type;
	String entry_date;
	int ticket_amount;
	
	@Value("${parkinglist.status:yes}")
	String Status;
	
	
	public String getStatus() {
		return Status;
	}
	
	

	public void setStatus(String status) {
		Status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLicense_plate() {
		return license_plate;
	}
	public void setLicense_plate(String license_plate) {
		this.license_plate = license_plate;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	public String getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(String entry_date) {
		this.entry_date = entry_date;
	}
	public int getTicket_amount() {
		return ticket_amount;
	}
	public void setTicket_amount(int ticket_amount) {
		this.ticket_amount = ticket_amount;
	}
	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Parking [id=" + id + ", name=" + name + ", license_plate=" + license_plate + ", mobileNo=" + mobileNo
				+ ", vehicle_type=" + vehicle_type + ", entry_date=" + entry_date + ", ticket_amount=" + ticket_amount
				+ ", Status=" + "]";
	}
	
	

}
