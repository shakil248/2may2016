package com.khan.pincode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.khan.pincode.service.PinCodeService;


@RestController
public class PinCodeController {

	@Autowired
	PinCodeService pinCodeService;

	private static long pinCodeHitCount=0;
	
	 	@RequestMapping(value = "/getpin", method = RequestMethod.GET)
	    public ResponseEntity<List<?>>  getPin(@RequestParam String searchKey) {
	 		pinCodeHitCount++;
		 List<?> pinCodeList = pinCodeService.getPinCode(searchKey);
		 return new ResponseEntity<List<?>>(pinCodeList, HttpStatus.OK);
		   
	    }
	 	
	 	@RequestMapping(value = "/getPinCodeHitCount", method = RequestMethod.GET)
	    public long  getPinCodeHitCount() {
		 return pinCodeHitCount;
		   
	    }

}
