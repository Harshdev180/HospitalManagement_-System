package com.jsp.springboot_hospitalmanagementsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springboot_hospitalmanagementsystem.dao.Addressdao;
import com.jsp.springboot_hospitalmanagementsystem.dto.Address;


@Service
public class Addressservice {

	@Autowired
	private Addressdao addressdao;

	public Address saveAddress(Address address) {
		return addressdao.saveAddress(address);

	}

	public Address updateAddress(int id, Address address) {
		Address dbAddress = addressdao.updateAddress(id, address);
		if (dbAddress != null) {
			return dbAddress;
		} else {
			return null;

		}

	}

	public Address deleteAddress(int id) {
		Address address = addressdao.deleteAddress(id);
		if (address != null) {
			return address;
		} else {
			return null;
		}

	}

	public Address getAddressbyid(int id) {
		Address address = addressdao.getaddressbyid(id);
		if (address != null) {
			return address;
		} else {
			return null;
		}

	}
}