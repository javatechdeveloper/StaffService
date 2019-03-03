package com.javatechdeveloper.staff.v1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatechdeveloper.student.v1.service.cargo.Staff;

@RestController
@RequestMapping(value="/staff",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public class StaffServiceController {
	@GetMapping
	public List<Staff> getStaffs(){
		return null;	
	}
	
	@GetMapping("/{staffId}")
	public List<Staff> getStaff(@PathVariable("staffId") int id ){
		return null;	
	}
	
	@PostMapping
	public int addStaff(@RequestBody Optional<Staff> staff) {
		return 1;
	}
}
