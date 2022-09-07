package hh.swd20.autoprojekti.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hh.swd20.autoprojekti.domain.Auto;

@Controller
public class AutoController {
	
	// moi
	// http://localhost:8080/autolista, jos /autolista on endpoint
    @RequestMapping(value="/autolista", method = RequestMethod.GET)
    //@GetMapping("/autolista")
	public String getAutot(Model model) {
    	
    	// ei käytetä vielä tietokantaa
    	// joten luodaan autolista lennosta
    	List<Auto> autot = new ArrayList<Auto>(); // tyhjä autolista
    	autot.add(new Auto("Tesla", 2022));
    	autot.add(new Auto("Saab", 1980));
    	model.addAttribute("autot", autot);
    	
    	return  "autolistaus"; // autolistaus.html -Thymeleaf templaten nimi
    }
	
}
