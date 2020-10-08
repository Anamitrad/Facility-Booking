package com.example.FacilityBooking.entity;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Slot")
public class Slot {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	Long venueId;
	Long facId;
	Long userId;
	Time start;
	Time end;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVenueId() {
		return venueId;
	}
	public void setVenueId(Long venueId) {
		this.venueId = venueId;
	}
	public Long getFacId() {
		return facId;
	}
	public void setFacId(Long facId) {
		this.facId = facId;
	}
	public Time getStart() {
		return start;
	}
	public void setStart(Time start) {
		this.start = start;
	}
	public Time getEnd() {
		return end;
	}
	public void setEnd(Time end) {
		this.end = end;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

}
