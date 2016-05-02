package com.khan.pincode.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class PinCodeDAOImpl extends BaseDAO implements PinCodeDAO{

	public <T> List<T> getPinCode(Class<T> type, String searchKey) {
		Criteria cr = getSession().createCriteria(type);
		cr.add(Restrictions.like("city", searchKey));
		if(cr.list().size()>0){
			return  cr.list();
		}
		return null;
	}

}
