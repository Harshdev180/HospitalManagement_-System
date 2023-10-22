package com.jsp.springboot_hospitalmanagementsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot_hospitalmanagementsystem.dto.Person;
import com.jsp.springboot_hospitalmanagementsystem.service.Personservice;
import com.jsp.springboot_hospitalmanagementsystem.util.Responsestructure;

@RestController
public class Personcontroller {
	@Autowired
	private Personservice personservice;

	@PostMapping("/saveperson")
	public Person savePerson(@Valid @RequestBody Person person) {
		return personservice.savePerson(person);
	}

	@PutMapping("/updateperson")
	public Person updatePerson(@Valid @RequestParam int id, @RequestBody Person person) {
		return personservice.updatePerson(id, person);
	}

	@DeleteMapping("/deleteperson")
	public Person deletePerson(@Valid @RequestParam int id) {
		return personservice.deletePerson(id);
	}

	@GetMapping("/getpersonbyid")
	public Person getPersonbyid(@Valid @RequestParam int id) {
		return personservice.getPersonbyid(id);
	}
}
