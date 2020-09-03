package finance.cartel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {


	@GetMapping("/")
	@ResponseBody
	public String greeting(ModelMap model) {
		return "Future home of cartel.finance $CFI";
	}
	
}
