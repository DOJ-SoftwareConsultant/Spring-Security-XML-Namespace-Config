/**
 * 
 */
package com.doj.app.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dinesh.Rajput
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping(value="/login")
	public String login() {
		return "login" ;
	}
}
