package com.its;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class itsolutionApplication {

	public static void main(String[] args) {
		SpringApplication.run(itsolutionApplication.class, args);
	}
	
	@Controller
	public class ControlleurCouleur {
		
		@RequestMapping(value="/accueil")
		public String accueil() {
			return "accueil";
		}
		@RequestMapping(value="/service")
		public String service() {
			return "service";
		}
		@RequestMapping(value="/outils")
		public String outil() {
			return "outils";
		}
		@RequestMapping(value="/contact")
		public String contact() {
			return "contact";
		}
		
 }

}
