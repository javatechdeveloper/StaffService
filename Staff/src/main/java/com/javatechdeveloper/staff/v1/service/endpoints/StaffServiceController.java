package com.javatechdeveloper.staff.v1.service.endpoints;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechdeveloper.student.v1.service.cargo.Staff;
import com.javatechdeveloper.student.v1.service.cargo.StaffList;

@RestController
@RequestMapping(value="/staff", produces = MediaType.APPLICATION_JSON_VALUE)
public class StaffServiceController {
	
	@GetMapping
	public StaffList getStaffs(){
		return  new StaffList(Arrays.asList(new Staff(1,"sathish","kumar","biology"), new Staff(2,"jacob","raj","history")));
		
	}
	
	@GetMapping("/{staffId}")
	public Staff getStaff(@PathVariable("staffId") int id ){
		return  new Staff(1,"sathish","kumar","biology");

	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public int addStaff(@RequestBody Optional<Staff> staff) {
		return 1;
	}
}
