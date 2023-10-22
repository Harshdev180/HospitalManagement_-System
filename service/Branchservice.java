package com.jsp.springboot_hospitalmanagementsystem.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot_hospitalmanagementsystem.dao.Branchdao;
import com.jsp.springboot_hospitalmanagementsystem.dto.Branch;

@Service
public class Branchservice {

	@Autowired
	private Branchdao branchdao;

	public Branch saveBranch(Branch branch, int aid, int hid) {
		return branchdao.saveBranch(branch, hid, aid);

	}

	public Branch updateBranch(int id, Branch branch) {
		Branch dbBranch = branchdao.updateBranch(id, branch);
		if (dbBranch != null) {
			return dbBranch;
		} else {
			return null;
		}

	}

	public Branch deleteBranch(int id) {
		Branch branch = branchdao.deleteBranch(id);
		if (branch != null) {
			return branch;
		} else {
			return null;
		}

	}

	public Branch getBranchbyid(int id) {
		Branch branch = branchdao.getBranchbyid(id);
		if (branch != null) {
			return branch;
		} else {
			return null;
		}

	}

	public List<Branch> getbranchbyhospitalid(int hid) {
		List<Branch> branchs = branchdao.getbranchbyhospitalid(hid);
		if (branchs != null) {
			return branchs;
		} else {
			return null;
		}
	}
}