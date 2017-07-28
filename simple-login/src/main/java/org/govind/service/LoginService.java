/**
 * 
 */
package org.govind.service;

import java.util.List;

import org.govind.dao.DaoImpl;
import org.govind.model.LoginBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author golu
 *
 */

@Service
public class LoginService {

	@Autowired
	DaoImpl daoImpl;
	
	public LoginService() {
	}
	
	public boolean validateLogin(String id, String password){
		List<LoginBean> list = daoImpl.validate(id, password);
		if(!list.isEmpty()){
			LoginBean bean = list.get(0);		
			if(id.equals(bean.getId()) && password.equals(bean.getPassword())){
				return true;
			}
		}
		return false;
	}
}
