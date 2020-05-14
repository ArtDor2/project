package com.hcc.advweb;

import java.util.ArrayList;

public class PricesList {
	private static ArrayList<Prices> pricesList=null;
	
	public static ArrayList<Price> getPricesList() {
		if ((pricesList == null) || (pricesList.size() == 0)) {
			
			pricesList = new ArrayList<Price>();
			pricesList.add(new Price(1,"One Day for a person"));
			pricesList.add(new Price(2,"One Week for a person"));
			pricesList.add(new Price(3,"One Month for a person"));
			pricesList.add(new Price(4,"One Week for a couple"));
			pricesList.add(new Price(5,"One Month for a couple"));
		}
		System.out.println("Price List ---->"+pricesList);
		for (Price st:pricesList) {
			System.out.println(st.getId() + st.getFname() + st.getLname());
		}
		return pricesList;
	}
	public static void setpricesList(ArrayList<Price> pricesList) {
		pricesList = pricesList;
	}

	public static ArrayList<Price> addPrice(Price Price) {
		getpricesList().add(Price);
		return pricesList;
	}

	public pricesList() {
		// TODO Auto-generated constructor stub
	}

}
