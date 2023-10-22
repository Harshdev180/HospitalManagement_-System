package com.jsp.springboot_hospitalmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot_hospitalmanagementsystem.dao.Meditemsdao;
import com.jsp.springboot_hospitalmanagementsystem.dto.Meditems;

@Service
public class Meditemservice {

	@Autowired
	private Meditemsdao meditemsdao;

	public Meditems saveMeditems(Meditems meditems, int mid) {
		return meditemsdao.saveMeditems(meditems, mid);

	}

	public Meditems updteMeditems(int id, Meditems meditems) {
		Meditems dbMeditems = meditemsdao.getMeditemsbyid(id);
		meditems.setMedorder(dbMeditems.getMedorder());
		Meditems meditems2 = meditemsdao.updateMeditems(id, meditems);
		if (meditems2 != null) {
			return meditems2;
		} else {
			return null;
		}

	}

	public Meditems deleteMeditems(int id) {
		Meditems meditems = meditemsdao.deleteMeditems(id);
		if (meditems != null) {
			return meditems;
		} else {
			return null;
		}

	}

	public Meditems getMeditemsbyid(int id) {
		Meditems meditems = meditemsdao.getMeditemsbyid(id);
		if (meditems != null) {
			return meditems;
		} else {
			return null;
		}

	}
}