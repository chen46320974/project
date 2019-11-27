package edu.hope.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.hope.demo.mapper.UserMapper;
import edu.hope.demo.model.SysUser;
import edu.hope.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	@Override
	public List<SysUser> getAllUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectAllUsers();
	}
	
}
