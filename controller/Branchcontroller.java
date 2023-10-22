package com.jsp.springboot_hospitalmanagementsystem.controller;

import java.util.List;

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

import com.jsp.springboot_hospitalmanagementsystem.dto.Branch;
import com.jsp.springboot_hospitalmanagementsystem.service.Branchservice;
import com.jsp.springboot_hospitalmanagementsystem.util.Responsestructure;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/branch")
public class Branchcontroller {
	@Autowired
	private Branchservice branchservice;

	@ApiOperation(value = "Save Branch", notes = "Api is used to save branch")
	@ApiResponses(value = {@ApiResponse(code = 201, message = "successfully saved")})
	@PostMapping
	public Branch saveBranch(@Valid @RequestBody Branch branch, @RequestParam int hid, @RequestParam int aid) {
		return branchservice.saveBranch(branch, hid, aid);
	}

	@PutMapping
	public Branch updateBranch(@Valid @RequestBody Branch branch, @RequestParam int bid) {
		return branchservice.updateBranch(bid, branch);
	}

	@DeleteMapping
	public Branch deleteBranch(@RequestParam int bid) {
		return branchservice.deleteBranch(bid);
	}

	@GetMapping
	public Branch getBranchbyid(@RequestParam int bid) {
		return branchservice.getBranchbyid(bid);
	}
	
	@GetMapping("/getbranchbyhospitalid")
	public List<Branch> getbranchbyhospitalid(@RequestParam int hid) {
		return branchservice.getbranchbyhospitalid(hid);
	}

}
