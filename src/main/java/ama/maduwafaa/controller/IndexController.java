package ama.maduwafaa.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Wafaa Che Rose, Madushani Dilanka
 *
 */
@Controller
public class IndexController {

	/**
	 * Redirect to the index page
	 * @param locale
	 * @return redirect:/index.html
	 */
	@RequestMapping ("/")	
	public String root(Locale locale){
		return "redirect:/index.html";
	}
	
	/**
	 * Direct to index page (Home Page)
	 * @return index
	 */
	@RequestMapping ("/index")	
	public String index(){
		return "index";
	}
}
