package com.example.FacilityBooking.service;
import java.util.*;
import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FacilityBooking.entity.Slot;
import com.example.FacilityBooking.repository.SlotRepository;

@Service
public class SlotService {
	@Autowired
	private SlotRepository sr;
	List<Slot> findAllBookedSlots(Long id)
	{
		return sr.findByFacId(id);
	}
	List<Slot> findAllSlotsByUserByDate(Long id,Time s,Time e)
	{
		List<Slot> userSlot=sr.findByUserId(id);
		List<Slot> byDate=new ArrayList<Slot>();
		for(int i=0;i<userSlot.size();i++)
		{
			if(userSlot.get(i).getStart().compareTo(s)>=0 && userSlot.get(i).getStart().compareTo(e)<=0)
			{
				byDate.add(userSlot.get(i));
			}
		}
		return byDate;
	}
	void bookSlot(Slot s)
	{
		sr.save(s);
	}
	
}
