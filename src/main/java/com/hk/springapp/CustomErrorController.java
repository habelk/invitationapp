package com.hk.springapp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomErrorController implements ErrorController {

	    private static final String PATH = "/error";

	   
	    @RequestMapping(value = PATH)
	    String error(HttpServletRequest request, HttpServletResponse response) {
	        return "Sorry, Visit again";
	    }

	    @Override
	    public String getErrorPath() {
	        return PATH;
	    }

	  

	}