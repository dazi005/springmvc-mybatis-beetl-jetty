package com.sdsj.audio.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.net.URISyntaxException;

/**
 * @author wtang 2015-10-15
 */
@Controller
public class LoginCtrl {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String indexpage(HttpServletRequest request) throws URISyntaxException {
		return "/login.html";
	}

}
