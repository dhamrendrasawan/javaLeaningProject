package com.neha.model;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@Data
public class EmployeeDto {
	
	private String empName;
	private String empAddress;
	private String phone;
	private String email;
	private String company;
	
	

}


//@component
//@RestController