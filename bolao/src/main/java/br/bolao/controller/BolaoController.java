package br.bolao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BolaoController {
	
	@RequestMapping(value="/index")
	public String fazeraposta(){
		return "/fazeraposta";
	}

}
