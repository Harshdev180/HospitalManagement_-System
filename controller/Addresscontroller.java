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

import com.jsp.springboot_hospitalmanagementsystem.dto.Address;
import com.jsp.springboot_hospitalmanagementsystem.service.Addressservice;
import com.jsp.springboot_hospitalmanagementsystem.util.Responsestructure;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.val;

@RestController
@RequestMapping("/address")
public class Addresscontroller {

	@Autowired
	private Addressservice addressservice;

	@PostMapping
	public Address saveAddress(@Valid @RequestBody Address address) {
		return addressservice.saveAddress(address);
	}

	@PutMapping
	public Address updateAddress(@Valid @RequestParam int aid, @RequestBody Address address) {
		return addressservice.updateAddress(aid, address);
	}

	@DeleteMapping
	public Address deleteAddress(@Valid @RequestParam int aid) {
		return addressservice.getAddressbyid(aid);
	}

	@GetMapping
	public Address getAddressbyid(@Valid @RequestParam int aid) {
		return addressservice.getAddressbyid(aid);
	}

}
