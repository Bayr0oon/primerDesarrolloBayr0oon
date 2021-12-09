package cl.twk.proyectos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {

	@GetMapping(value = "/fotografosfamosos")
	public String fotografosFamosos() {
		return "fotografosfamosos";
	}
}
