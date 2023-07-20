package com.codingdojo.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String index() {
		return "redirect:/omikuji";
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

	//START OF DAIKICHI PATH VARIABLES
	@RequestMapping(value = "/daikichi/travel", method = RequestMethod.GET)
	public String travel() {
		return "You will soon take a trip and meet someone who will change your life!";
	}

	@RequestMapping(value = "/daikichi/travel/{location}", method = RequestMethod.GET)
	public String travelToLocation(@PathVariable("location") String location) {
		return "Congratulations! You will soon travel to " + location + "!";
	}
	
	@RequestMapping(value = "/daikichi/lotto/{num}", method = RequestMethod.GET)
	public String lotto(@PathVariable("num") int num) {
		if (num % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
	}

	@RequestMapping("/omikuji")
	public String omikuji() {
		return "index.jsp";
	}

	@PostMapping("/postOmikuji")
	public String postOmikuji(@RequestParam(value="number") String number, 
							@RequestParam(value="city") String city,
							@RequestParam(value="person") String person,
							@RequestParam(value="hobby") String hobby,
							@RequestParam(value="thing") String thing,
							@RequestParam(value="nice") String nice, 
							HttpSession session) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		return "redirect:/result";
	}
	
	@GetMapping("/result")
	public String result(HttpSession session) {
		return "results.jsp";
	}

}

