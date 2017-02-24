package com.hk.springapp;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController
@Api
@RequestMapping("/")
public class MainService {
	 @RequestMapping("/greeting")
	    public String greeting(@RequestParam(value="name") String name) {
	        return "Hello :"+ name;
}
	 
	 @RequestMapping("/greeting/{name}/")
	    public String greetingPath(@PathVariable("name") String name) {
	        return "Hello again :"+ name;
}


}