package com.example.service;

import java.util.Map;
import java.util.Set;

import com.example.bean.Price;

public class CostCalculationImpl implements CostCalculation{
	
	private long totalCost =0;
	private long itemPrice = 0;
	
	Price price = new Price(10,20,30,40,50);

	/**
	 * Calculate the total price of items in basket
	 */
	@Override
	public long totalCost(Map<String, Integer> basket){
		
		if(basket != null){
			Set<String> set = basket.keySet();
			
			for(String key: set){
				if(null != key){
					switch (key){
						case "Bananas":
							itemPrice = price.getBananaPrice();
							break;
						case "Oranges":
							itemPrice = price.getOrangePrice();
							break;
						case "Apples":
							itemPrice = price.getApplePrice();
							break;
						case "Lemons":
							itemPrice = price.getLemonPrice();
							break;
						case "Peaches":
							itemPrice = price.getPeachePrice();
							break;
						default:
							itemPrice = 0;
					}
					if(basket.get(key) <= 0){
						itemPrice=0;
					}
					totalCost = totalCost + basket.get(key)*itemPrice;
				}
			}
		}
		else{
			System.out.println("Basket is null");
		}
		return totalCost;
	}

}
