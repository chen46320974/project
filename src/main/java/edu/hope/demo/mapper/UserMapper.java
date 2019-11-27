package edu.hope.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.hope.demo.model.SysUser;

@Mapper
public interface UserMapper {
	public List<SysUser> selectAllUsers();
}
