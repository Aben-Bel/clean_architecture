package com.abeni.interactor;

import com.abeni.entity.gateway.HelloGateway;

public class HelloInteractor implements HelloBoundary {

	private HelloGateway gateway;
	public HelloInteractor(HelloGateway helloGateway) {
		this.gateway = helloGateway;
	}
    @Override
	public String getMessage(String name) {
        // fetch value from database
    	int count = this.gateway.getCount();
        // create hello message
        String helloMessage = count + ":: Hello " + name;
//        this.gateway.incrementCount();
        this.gateway.addName(name);
        return helloMessage;
    }
}
