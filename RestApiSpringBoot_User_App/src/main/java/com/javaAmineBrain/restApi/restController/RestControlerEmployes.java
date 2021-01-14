package com.javaAmineBrain.restApi.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaAmineBrain.restApi.model.Employes;
import com.javaAmineBrain.restApi.serviceEmployes.EmpolyesService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/")
public class RestControlerEmployes {
    
	@Autowired
	private EmpolyesService service;
	
	@GetMapping("/test")
	public String getTest() {
		return "test";
	}
	@GetMapping("/")
	public List<Employes> getAllEmployes(){
		return service.getAllEmployes();
	}
	
	@PostMapping("/")
	public void saveEmployee(@RequestBody Employes employee) {
		service.addEmpoyee(employee);
	}
	@GetMapping("/getEmployeeById/{id}")
	public Employes getEmployeById(@PathVariable long id) {
		return service.getEmployee(id);
	}
	@DeleteMapping("/deletEmployeeById/{id}")
	public void deletEmployeeById(@PathVariable long id) {
		 service.deleteEmployee(id);
	}
}
