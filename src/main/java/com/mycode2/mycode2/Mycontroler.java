package com.mycode2.mycode2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroler {
	@RequestMapping("/message")
	private String display() {
		return "This is security";
	}

}
