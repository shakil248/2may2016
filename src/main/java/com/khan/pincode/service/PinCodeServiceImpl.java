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
		tableMap.put('a',"com.khan.pincode.model.A" );
		tableMap.put('b',"com.khan.pincode.model.B" );
		tableMap.put('c',"com.khan.pincode.model.C" );
		tableMap.put('d',"com.khan.pincode.model.D" );
		tableMap.put('e',"com.khan.pincode.model.E" );
		tableMap.put('f',"com.khan.pincode.model.F" );
		tableMap.put('g',"com.khan.pincode.model.G" );
		tableMap.put('h',"com.khan.pincode.model.H" );
		tableMap.put('i',"com.khan.pincode.model.I" );
		tableMap.put('j',"com.khan.pincode.model.J" );
		tableMap.put('k',"com.khan.pincode.model.K" );
		tableMap.put('l',"com.khan.pincode.model.L" );
		tableMap.put('m',"com.khan.pincode.model.M" );
		tableMap.put('n',"com.khan.pincode.model.N" );
		tableMap.put('o',"com.khan.pincode.model.O" );
		tableMap.put('p',"com.khan.pincode.model.P" );
		tableMap.put('q',"com.khan.pincode.model.Q" );
		tableMap.put('r',"com.khan.pincode.model.R" );
		tableMap.put('s',"com.khan.pincode.model.S" );
		tableMap.put('t',"com.khan.pincode.model.T" );
		tableMap.put('u',"com.khan.pincode.model.U" );
		tableMap.put('v',"com.khan.pincode.model.V" );
		tableMap.put('w',"com.khan.pincode.model.W" );
		tableMap.put('x',"com.khan.pincode.model.X" );
		tableMap.put('y',"com.khan.pincode.model.Y" );
		tableMap.put('z',"com.khan.pincode.model.Z" );
	}
	public List<?> getPinCode(String searchKey) {
		if(null!=searchKey && searchKey!=""){
			Character c = searchKey.trim().charAt(0);
			String className =  tableMap.get(Character.toLowerCase(c));
			try {
				return pinCodeDAO.getPinCode(Class.forName(className), searchKey);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

}
