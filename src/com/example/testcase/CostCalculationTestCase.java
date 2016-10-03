package com.example.testcase;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Test;

import com.example.service.CostCalculationImpl;

public class CostCalculationTestCase extends TestCase {
	
	private Map<String, Integer> basket = null;
	
	protected void setUp(){
		basket = new HashMap<String, Integer>();
		
		//Filling of basket
		basket.put("Bananas", 1);
		basket.put("Oranges", 1);
		basket.put("Apples", 1);
		basket.put("Lemons", 1);
		basket.put("Peaches", 1);
		
		System.out.println("Initialization done");
	}
	
	
	@Test
	public void testTotalCost(){
		
		//1. Null value testing
		assertEquals(0,(new CostCalculationImpl()).totalCost(null));
		System.out.println("Testing of null values done");
		System.out.println("--------");
		
		//2. Empty value testing
		assertEquals(0,(new CostCalculationImpl()).totalCost(new HashMap<String, Integer>()));
		System.out.println("Testing of empty values done");
		System.out.println("Total Price: "+(new CostCalculationImpl()).totalCost(new HashMap<String, Integer>()));
		System.out.println("--------");
		
		//3. valid values testing
		assertEquals(150,(new CostCalculationImpl()).totalCost(basket));
		System.out.println("Testing of valid values done");
		System.out.println("Total Price: "+(new CostCalculationImpl()).totalCost(basket));
		System.out.println("--------");
		
		//4. Negative value testing
		basket.put("Bananas", -1);
		assertEquals(140,(new CostCalculationImpl()).totalCost(basket));
		System.out.println("Testing of negative values done");
		System.out.println("Total Price: "+(new CostCalculationImpl()).totalCost(basket));
		System.out.println("--------");
		
		//5. Zero value testing
		basket.put("Bananas", 0);
		assertEquals(140,(new CostCalculationImpl()).totalCost(basket));
		System.out.println("Testing of zero values done");
		System.out.println("Total Price: "+(new CostCalculationImpl()).totalCost(basket));
		
	}
	
}
