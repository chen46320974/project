package edu.hope.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hope.demo.model.Administrator;

@Mapper
public interface AdministratorMapper {
	public List<Administrator> selectAllAdministrators();
	 
}
