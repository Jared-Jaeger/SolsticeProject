package com.source.jaeger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.source.jaeger.entity.Contacts;

@Controller
@RequestMapping("/contact")
public class contactController {
	
	
	
	 @RequestMapping("/showForm")
	    public String showForm(Model theModel){

	        Contacts theContact = new Contacts();

	        theModel.addAttribute("contact", theContact);

	        return "contact/contactForm";
	    }
	    @RequestMapping("/processForm")
	    public String processForm(@ModelAttribute("contact") Contacts theContact){
	    	

	        return "contact/contactList";
	    }
	    
	    @RequestMapping("/getList")
	    public String processForm(){
	    	

	        return "contact/contactList";
	    }
}
