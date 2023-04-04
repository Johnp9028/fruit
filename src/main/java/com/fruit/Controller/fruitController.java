package com.fruit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class fruitController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
}

