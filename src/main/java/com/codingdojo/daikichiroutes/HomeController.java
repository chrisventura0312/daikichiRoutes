package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class HomeController {
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String index() {
		return daikichi();
	}
	@RequestMapping(value = "/daikichi", method=RequestMethod.GET)
	public String daikichi() {
		return "Welcome!";
	}
	
	@RequestMapping(value = "/daikichi/today", method = RequestMethod.GET)
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	@RequestMapping(value = "/daikichi/tomorrow", method = RequestMethod.GET)
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/daikichi/travel/{location}")
	public String travelToLocation(@PathVariable("location") String location) {
		if (location == null) {
			return "You will soon take a trip and meet someone who will change your life!";
		}
		return "Congratulations! You will soon travel to " + location + "!";
	}
	
}
