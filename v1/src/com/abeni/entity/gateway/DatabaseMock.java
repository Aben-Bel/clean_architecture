package com.abeni.entity.gateway;

import java.util.ArrayList;
import java.util.List;

public class DatabaseMock implements HelloGateway, UserGateway {
    private int counter;
    private List<String> usernames;
    
    public DatabaseMock(){
        this.counter = 0;
        this.usernames = new ArrayList<>();
    }

	@Override
	public int getCount() {
		return this.usernames.size();
	}

	@Override
	public void incrementCount() {
		this.counter++;		
	}

	
	@Override
	public void addName(String name) {
		usernames.add(name);
	}

	
	@Override
	public List<String> getUsers() {
		return usernames;
	}
	
	
}
