package com.co.crivera.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.co.crivera.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	private List<Person> personas = new ArrayList<>();
	
	@Override
	public List<Person> findPerson() {
    
        crearListaPersonasDefault();
		return personas;
	}

	@Override
	public Optional<Person> findPersonByid(String id) {
		return personas.stream().filter(persona-> persona.getId().equals(id)).findFirst();
	}

	private void crearListaPersonasDefault() {
		if(personas.isEmpty()) {
		Person persona=  new Person();
        persona.setApellidos("rivera martinez");
        persona.setNombres("camilo");
        persona.setTipoId("CC");
        persona.setId("1030642742");
        personas.add(persona);
        Person persona2=  new Person();
        persona2.setApellidos("Medina Ortiz");
        persona2.setNombres("Juan Jose");
        persona2.setTipoId("CC");
        persona2.setId("21014576");
        personas.add(persona2);
		}
	}
}
