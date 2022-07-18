package com.groupware.helloworks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@GetMapping("/main")
	public String main() {
		return "home";
	}

}
