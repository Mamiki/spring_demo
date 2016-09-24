package com.jambo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SalutationController {
	
	/**
	 * controlleur de salutation.
	 * 
	 * Le parametre uiModel est injecte par Spring
	 * @param uiModel
	 * @return
	 */

    @RequestMapping(value="/salutationView", method=RequestMethod.GET)
    public String salutation(Model uiModel) {
    	// Ajouer le texte a retourner dans la vue
    	uiModel.addAttribute("messageSalutation", "Salut je" + "m'appelle Hermann");
    	
    	//retourner vers la vue qui va afficher le message
		return "salutationView";
	}

}