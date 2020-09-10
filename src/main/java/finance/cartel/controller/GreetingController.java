package finance.cartel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("/")
	public String greeting(ModelMap model) {
		return "index";
	}
	
}
