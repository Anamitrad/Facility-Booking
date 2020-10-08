package com.example.FacilityBooking.repository;
import com.example.FacilityBooking.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface SlotRepository extends JpaRepository<Slot,Long>{
	
	public List<Slot> findByFacId(Long id);
	public List<Slot> findByUserId(Long id);
	
}
