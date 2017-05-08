package com.cheng.test.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cheng.test.domain.Test;

@Mapper
public interface TestService {

	public List<Test> getUsers();
}
