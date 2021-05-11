package com.abeni.controller;

import com.abeni.interactor.HelloBoundary;
import com.abeni.interactor.UserBoundary;

public class HelloControllerImpl implements HelloController{

	private HelloBoundary helloBoundary;
	private UserBoundary userBoundary;
	
	public HelloControllerImpl(HelloBoundary helloBoundary, UserBoundary userBoundary) {
		this.helloBoundary = helloBoundary;
		this.userBoundary = userBoundary;
	}
	
    @Override
	public String getMessage(String name) {
    	return this.helloBoundary.getMessage(name);
    }

	@Override
	public String getUsers() {
		return this.userBoundary.getUsers().toString();
	}
}
