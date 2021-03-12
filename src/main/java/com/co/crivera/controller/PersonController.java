package com.co.crivera.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.co.crivera.dto.rest.ListaPersonConsulta;
import com.co.crivera.entity.Person;
import com.co.crivera.service.PersonService;

import io.swagger.annotations.Api;

@Controller
@RequestMapping("/person")
@Api(value = "Clase con los servicios rest relacionados con banner")
public class PersonController {

	@Autowired 
	private PersonService personService;
	    /**
	     * Consulta lista de banners
	     * @author Camilo Rivera
	     * @version 0.0.1 2020/03/30
	     * @since 0.0.1 2020/03/30
	     * @return lista de noticas
	     * @throws ServiceException si se presenta un error en el proceso 
	     */
	    @GetMapping(value="",produces =  MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<ListaPersonConsulta> findAll(){
	       

	        ListaPersonConsulta listaPersonasRespuesta= new ListaPersonConsulta();
	        listaPersonasRespuesta.setPersonas(personService.findPerson());
	        return new ResponseEntity<>(listaPersonasRespuesta, HttpStatus.OK);
	    }
	    
	    @GetMapping(value="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Person> findById( @PathVariable("id") String id ) {
	       
	    	 Optional<Person> persona=  personService.findPersonByid(id);
	    	 if(persona.isPresent()) {
	    	     return new ResponseEntity<>(persona.get(), HttpStatus.OK);
	    	 }else {
	    		 
	    	 }
	        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
	    }
	}    



