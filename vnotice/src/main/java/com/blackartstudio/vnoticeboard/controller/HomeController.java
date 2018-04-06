package com.blackartstudio.vnoticeboard.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.blackartstudio.vnoticeboard.entity.Board;
import com.blackartstudio.vnoticeboard.repository.BoardRepository;

@Controller
public class HomeController {
	
	public static final Logger LOGGER=LoggerFactory.getLogger(HomeController.class);
	
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String showHome() {
		LOGGER.debug("Rendering home page");
		
		return "home";
	}
}
