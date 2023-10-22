package com.jsp.springboot_hospitalmanagementsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springboot_hospitalmanagementsystem.dto.Meditems;
import com.jsp.springboot_hospitalmanagementsystem.service.Meditemservice;

@RestController
@RequestMapping("/meditems")
public class Meditemscontroller {
	@Autowired
	private Meditemservice meditemservice;

	@PostMapping
	public Meditems saveMeditems(@Valid @RequestBody Meditems meditems, @RequestParam int mid) {
		return meditemservice.saveMeditems(meditems, mid);
	}

	@PutMapping
	public Meditems updateMeditems(@Valid @RequestParam int id, @RequestBody Meditems meditems) {
		return meditemservice.updteMeditems(id, meditems);
	}

	@DeleteMapping
	public Meditems deleteMeditems(@Valid @RequestParam int id) {
		return meditemservice.deleteMeditems(id);
	}

	@GetMapping
	public Meditems getmeditemsbyid(@Valid @RequestParam int id) {
		return meditemservice.getMeditemsbyid(id);
	}
}
