package com.sombit.app.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/main")
public class MainController {

	protected static Logger logger = Logger.getLogger("controller");
	
    @RequestMapping(value = "/common", method = RequestMethod.GET)
    public String getCommonPage() {
    	logger.debug("Received request to show common page");
    
    	
    	// This will resolve to /WEB-INF/jsp/commonpage.jsp
    	return "commonpage";
	}
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage() {
    	logger.debug("Received request to show admin page");
    	
    	// This will resolve to /WEB-INF/jsp/adminpage.jsp
    	return "adminpage";
	}
}
