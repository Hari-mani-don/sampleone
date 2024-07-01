package com.google;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@GetMapping("/home")
	public String home() {
		
//		String product = new RestTemplate().getForObject("http://PRODUCT-MICRO-SERVICE/products", String.class);
		return "HariMani don";
	}
}
