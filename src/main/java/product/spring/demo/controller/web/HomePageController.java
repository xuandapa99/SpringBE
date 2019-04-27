package product.spring.demo.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

	@RequestMapping(value = { "", "/" })
	public String index() {
		return "homePage";
	}

}
