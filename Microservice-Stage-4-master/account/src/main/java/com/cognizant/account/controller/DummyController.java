package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.DummyModel;

@RestController
public class DummyController {

	@GetMapping("/accounts/{number}")
	public DummyModel dummy(@PathVariable String number)
	{
		return new DummyModel("00987987973432", "savings" , 234343 );
	}
}
