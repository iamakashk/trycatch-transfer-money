package com.trycatch.transfer_money.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferMoneyController {
	
	@RequestMapping(path = "health",method = RequestMethod.GET)
	public String checkHealth() {
		return "Transfer Money Service working properly";
	}

}
