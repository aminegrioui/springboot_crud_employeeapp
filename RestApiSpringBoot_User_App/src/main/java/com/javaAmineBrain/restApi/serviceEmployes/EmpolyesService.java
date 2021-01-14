package com.javaAmineBrain.restApi.serviceEmployes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaAmineBrain.restApi.model.Employes;
import com.javaAmineBrain.restApi.repository.RepositoryEmployes;

@Service
public class EmpolyesService {
   
	@Autowired
	private RepositoryEmployes repo;
	
	public List<Employes> getAllEmployes(){
		return repo.findAll();
	}
	
	public void addEmpoyee(Employes employee) {
		repo.save(employee);
	}
	public Employes getEmployee(long id) {
		return repo.findById(id).get();
	}
	public void deleteEmployee(long id) {
		repo.deleteById(id);
	}
}
