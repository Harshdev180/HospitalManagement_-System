package com.jsp.springboot_hospitalmanagementsystem.controller;

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

import com.jsp.springboot_hospitalmanagementsystem.dto.Encounter;
import com.jsp.springboot_hospitalmanagementsystem.service.Encounterservice;
import com.jsp.springboot_hospitalmanagementsystem.util.Responsestructure;

@RestController
@RequestMapping("/encounter")
public class Encountercontroller {
	@Autowired
	private Encounterservice encounterservice;

	@PostMapping
	public ResponseEntity<Responsestructure<Encounter>> saveEncounter(@RequestBody Encounter encounter,
			@RequestParam int pid, @RequestParam int bid) {
		return encounterservice.saveEncounter(encounter, pid, bid);
	}

	@PutMapping
	public ResponseEntity<Responsestructure<Encounter>> updateEncounter(@RequestBody Encounter encounter,
			@RequestParam int id, @RequestParam int bid) {
		return encounterservice.updateEncounter(id, encounter, bid);
	}

	@DeleteMapping
	public ResponseEntity<Responsestructure<Encounter>> deleteEncounter(@RequestParam int eid) {
		return encounterservice.deleteEncounter(eid);
	}

	@GetMapping
	public ResponseEntity<Responsestructure<Encounter>> getEncounterbyid(@RequestParam int eid) {
		return encounterservice.getEncounteryid(eid);
	}
}
