package com.co.crivera.service;

import java.util.List;
import java.util.Optional;

import com.co.crivera.entity.Person;

public interface PersonService {

	
	public  List<Person> findPerson();
	
	public Optional<Person> findPersonByid(String id);
	
}
