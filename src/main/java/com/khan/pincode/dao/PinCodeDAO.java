package com.khan.pincode.dao;

import java.util.List;


public interface PinCodeDAO {

	 public <T> List<T> getPinCode(Class<T> type, String searchKey);
}