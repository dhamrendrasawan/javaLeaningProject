package com.neha.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.neha.model.EmployeeDto;

@RestController         //@ResponseBody+@Controller
public class EmployeeController {
	
	//post,get,patch,put,delete
	@PostMapping("/empoyee/saveData")
	public ResponseEntity<String> saveEmp(@RequestBody EmployeeDto empdto) 
	{
	
		System.out.println(empdto);
		ObjectMapper mapper=new ObjectMapper();
		String response=null;
		try {
			response=mapper.writeValueAsString(empdto);
		
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>(response,HttpStatus.OK);
		
	}

	/*@GetMapping("/empoyee/saveData")
	public ResponseEntity<String> getEmp() 
	{
		
		System.out.println("getting emp data "+ "Neha");
		
		
		return new Respomns;
		
	}*/

}
