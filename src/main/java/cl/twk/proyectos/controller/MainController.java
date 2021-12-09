package cl.twk.proyectos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping(value = "/home")
	public String home() {
		return "home";
	}
	
	@GetMapping(value = "/galeria")
	public String galeria() {
		return "galeria";
	}
}