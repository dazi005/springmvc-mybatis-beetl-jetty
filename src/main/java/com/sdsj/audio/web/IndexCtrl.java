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
public class IndexCtrl {

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String index(HttpServletRequest request) throws URISyntaxException {
//		if ("admin".equals(request.getSession().getAttribute("username"))) {
//			return "redirect:/index";
//		}
//		return "redirect:/index";
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String indexpage(HttpServletRequest request) throws URISyntaxException {
		return "/index.html";
	}

}
