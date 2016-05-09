package com.khan.pincode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	private static long homeHitCount=0;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	   public String  printHello() {
		homeHitCount++;
		return "index";
	   }
	
	@RequestMapping(value = "/getHomeHitCount",method = RequestMethod.GET)
	   public long  getHomeHitCount() {
		return homeHitCount;
	   }

}
