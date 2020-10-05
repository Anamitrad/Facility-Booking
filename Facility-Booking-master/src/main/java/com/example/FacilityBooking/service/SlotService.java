package com.example.FacilityBooking.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FacilityBooking.entity.Slot;
import com.example.FacilityBooking.repository.SlotRepository;

@Service
public class SlotService {
	@Autowired
	private SlotRepository sr;
	List<Slot> findAllSlots(Long id)
	{
		return sr.findByFacId(id);
	}
	void addSlot(Slot s)
	{
		sr.save(s);
	}
	
}
