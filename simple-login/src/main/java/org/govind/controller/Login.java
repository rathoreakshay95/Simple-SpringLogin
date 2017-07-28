/**
 * 
 */
package org.govind.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.govind.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author golu
 *
 */

@Controller
@RequestMapping("/loginApp")
public class Login {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(HttpServletRequest req, HttpServletResponse res, ModelMap modelMap){
		String id = req.getParameter("id");
		String pass = req.getParameter("password");
		boolean flag = loginService.validateLogin(id,pass);
		if(flag){
			modelMap.addAttribute("user", id);
			return "loginSuccess";
		}
		return "loginFail";
	}

}
