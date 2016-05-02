package com.khan.pincode.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.khan.pincode.dao.PinCodeDAO;

@Service
@Transactional
public class PinCodeServiceImpl implements PinCodeService {

	@Autowired
	private PinCodeDAO pinCodeDAO;
	
	
	
	private Map<Character, String> tableMap = new HashMap<Character, String>();
	
	public PinCodeServiceImpl(){
		initializeTablelMap();
	}
	
	
	private void initializeTablelMap(){
		tableMap.put('a',"com.sogeti.petstore.model.A" );
		tableMap.put('b',"com.sogeti.petstore.model.B" );
		tableMap.put('c',"com.sogeti.petstore.model.C" );
		tableMap.put('d',"com.sogeti.petstore.model.D" );
		tableMap.put('e',"com.sogeti.petstore.model.E" );
		tableMap.put('f',"com.sogeti.petstore.model.F" );
		tableMap.put('g',"com.sogeti.petstore.model.G" );
		tableMap.put('h',"com.sogeti.petstore.model.H" );
		tableMap.put('i',"com.sogeti.petstore.model.I" );
		tableMap.put('j',"com.sogeti.petstore.model.J" );
		tableMap.put('k',"com.sogeti.petstore.model.K" );
		tableMap.put('l',"com.sogeti.petstore.model.L" );
		tableMap.put('m',"com.sogeti.petstore.model.M" );
		tableMap.put('n',"com.sogeti.petstore.model.N" );
		tableMap.put('o',"com.sogeti.petstore.model.O" );
		tableMap.put('p',"com.sogeti.petstore.model.P" );
		tableMap.put('q',"com.sogeti.petstore.model.Q" );
		tableMap.put('r',"com.sogeti.petstore.model.R" );
		tableMap.put('s',"com.sogeti.petstore.model.S" );
		tableMap.put('t',"com.sogeti.petstore.model.T" );
		tableMap.put('u',"com.sogeti.petstore.model.U" );
		tableMap.put('v',"com.sogeti.petstore.model.V" );
		tableMap.put('w',"com.sogeti.petstore.model.W" );
		tableMap.put('x',"com.sogeti.petstore.model.X" );
		tableMap.put('y',"com.sogeti.petstore.model.Y" );
		tableMap.put('z',"com.sogeti.petstore.model.Z" );
	}
	public List<?> getPinCode(String searchKey) {
		if(null!=searchKey && searchKey!=""){
			Character c = searchKey.charAt(0);
			String className =  tableMap.get(c);
			try {
				return pinCodeDAO.getPinCode(Class.forName(className), searchKey);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
