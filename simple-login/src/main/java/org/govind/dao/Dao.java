/**
 * 
 */
package org.govind.dao;

import java.util.List;

import org.govind.model.LoginBean;

/**
 * @author golu
 *
 */
public interface Dao {
	
	public List<LoginBean> validate(String id, String password);
}
