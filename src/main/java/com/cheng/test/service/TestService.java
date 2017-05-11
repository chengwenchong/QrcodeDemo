package com.cheng.test.service;

import java.util.List;

import com.cheng.test.domain.Test;

import retrofit.http.POST;

public interface TestService {
	
	@POST("/v1/test")
	public List<Test> getUsers();
}
