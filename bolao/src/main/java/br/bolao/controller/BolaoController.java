package br.bolao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BolaoController {
	
	@RequestMapping("/bolao/novo")
	public String novo(){
		return "index.html";
	}

}
