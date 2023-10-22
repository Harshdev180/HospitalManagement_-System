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

import com.jsp.springboot_hospitalmanagementsystem.dto.Medorder;
import com.jsp.springboot_hospitalmanagementsystem.service.Medorderservice;
import com.jsp.springboot_hospitalmanagementsystem.util.Responsestructure;

@RestController
@RequestMapping("/medorder")
public class Medordercontroller {
	@Autowired
	private Medorderservice medorderservice;

	@PostMapping
	public Medorder saveMedorder(@Valid Medorder medorder, @RequestParam int eid) {
		return medorderservice.saveMedorder(medorder, eid);
	}

	@PutMapping
	public Medorder updateMedorder(@Valid @RequestBody Medorder medorder, @RequestParam int mid) {
		return medorderservice.updateMedorder(mid, medorder);
	}

	@DeleteMapping
	public Medorder deleteMedorder(@Valid @RequestParam int mid) {
		return medorderservice.deleteMedorder(mid);
	}

	@GetMapping
	public Medorder getMedorderbyid(@Valid @RequestParam int mid) {
		return medorderservice.getMedorderbyid(mid);
	}
}
