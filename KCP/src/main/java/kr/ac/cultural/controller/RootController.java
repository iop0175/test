package kr.ac.cultural.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.ac.cultural.model.Korea;
import kr.ac.cultural.service.KoreaeService;

@Controller
public class RootController {
	@Autowired
	KoreaeService Service;

	@GetMapping("/")
	String index(Model model) {
		List<Korea> main = Service.Main();
		model.addAttribute("main", main);
		return "index";
	}

	@GetMapping("/test")
	String test() {
		return "test";
	}
}
