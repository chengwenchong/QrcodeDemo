package com.cheng.test.domain;

public class Test {
	private Long id;
	
	private String loginName;
	
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", loginName=" + loginName + ", password=" + password + "]";
	}
	
}
