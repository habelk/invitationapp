package com.hk.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/names")
public class SubContoller {	

	@RequestMapping(method = RequestMethod.GET)
	public String sayHello(ModelMap model) {
		return "hello from sub contoller";
	}

}
