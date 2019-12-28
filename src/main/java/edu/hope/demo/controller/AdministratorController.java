package edu.hope.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.hope.demo.model.Administrator;
import edu.hope.demo.service.AdministratorService;

@RestController
@RequestMapping("/Administrators")
public class AdministratorController {
	
	@Autowired
	AdministratorService AdministratorService; 
	
	@RequestMapping("/getList")
	public List<Administrator> getList(){
		return AdministratorService.getAdministratorList();
	}
}
