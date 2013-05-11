package com.sombit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/feed")

public class FeedController
{
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String feed(ModelMap model)
	{
		model.addAttribute("message","This is custom feed");
		
		//Spring uses InternalResourceViewResolver and return back index.jsp
		return "feed";
	}	
}