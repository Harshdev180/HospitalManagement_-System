package com.jsp.springboot_hospitalmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.springboot_hospitalmanagementsystem.dao.Medorderdao;
import com.jsp.springboot_hospitalmanagementsystem.dto.Medorder;
import com.jsp.springboot_hospitalmanagementsystem.exception.Idnotfound;
import com.jsp.springboot_hospitalmanagementsystem.util.Responsestructure;

@Service
public class Medorderservice {

	@Autowired
	private Medorderdao medorderdao;

	public Medorder saveMedorder(Medorder medorder, int eid) {
		return medorderdao.saveMedorder(medorder, eid);

	}

	public Medorder updateMedorder(int id, Medorder medorder) {
		Medorder dbMedorder = medorderdao.getMedorderbyid(id);
		medorder.setEncounter(dbMedorder.getEncounter());
		Medorder medorder2 = medorderdao.updateMedorder(id, medorder);
		if (medorder2 != null) {
			return medorder2;
		} else {
			return null;
		}

	}

	public Medorder deleteMedorder(int id) {
		Medorder medorder = medorderdao.deleteMedorder(id);
		if (medorder != null) {
			return medorder;
		} else {
			return null;
		}

	}

	public Medorder getMedorderbyid(int id) {
		Medorder medorder = medorderdao.getMedorderbyid(id);
		if (medorder != null) {
			return medorder;
		} else {
			return null;
		}

	}
}