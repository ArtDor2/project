package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SpringTestController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String viewPriceDetails(ModelMap model) {
	    model.addAttribute("test intro", "test :) !!!!");
	    return "hello";
	}
	
	@RequestMapping(value = "/fine", method = RequestMethod.GET)
	public String viewPriceDetails2(ModelMap model) {
	    model.addAttribute("test ok", "test is good !!!!");
	    return "fine";
	}
	
	
	@RequestMapping(value = "/Priceslist", method = RequestMethod.GET)
	public ModelAndView viewPriceList() {
	    ArrayList<Price> PricesList = PricesList.getPricesList();
	    
	    return new ModelAndView("Priceslist","PricesList", PricesList);
	}
	
	@RequestMapping(value = "/getPricedetails", method = RequestMethod.GET)
	public ModelAndView getPriceDetail(@RequestParam(name = "id") String PriceId) {
	    ArrayList<Price> PricesList = PricesList.getPricesList();
	    Price thisPrice = null;
	    for (Price Price:PricesList) {
	    	if (Price.getId() == Integer.parseInt(PriceId)) {
	    		thisPrice = Price;
	    	}
	    }
	    return new ModelAndView("getPricedetails","PriceDetails",thisPrice);
	    
	}
	
	@RequestMapping(value = "/addnewPrice", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addNewPrice(@RequestParam(name = "id") String PriceId,
			@RequestParam(name = "first_name") String first_name,
			@RequestParam(name = "last_name") String last_name
			) {
		System.out.println("---------Here is all the info for adding this Price -------"+
			PriceId + "," + first_name + "," + last_name );
		// Create a new Price and add the new Price to the list
		Price Price = new Price(Integer.parseInt(PriceId), first_name, last_name);

		// get the latest Price list and set the model with the list
		ArrayList<Price> PricesList = PricesList.addPrice(Price);
		
	    return new ModelAndView("Priceslist","PricesList",PricesList);
	}
	
}
