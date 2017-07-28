/**
 * 
 */
package org.govind.model;

/**
 * @author golu
 *
 */
public class LoginBean {

	private String id;
	private String password;
	
	public LoginBean() {
		// TODO Auto-generated constructor stub
	}

	public LoginBean(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginBean [id=" + id + ", password=" + password + "]";
	}
	
}
