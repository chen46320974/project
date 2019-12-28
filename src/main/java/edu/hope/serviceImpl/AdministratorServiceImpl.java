package edu.hope.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hope.demo.mapper.AdministratorMapper;
import edu.hope.demo.model.Administrator;
import edu.hope.demo.service.AdministratorService;

@Service
public class AdministratorServiceImpl implements AdministratorService{
	
	@Autowired
	AdministratorMapper AdministratorMapper;
	
	@Override
	public List<Administrator> getAdministratorList() {
		// TODO Auto-generated method stub
		return AdministratorMapper.selectAllAdministrators();
	}
	
	

}
