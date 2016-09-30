package com.example.testcase;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.example.service.CostCalculationImpl;

public class CostCalculationTestCase {
	
	public Map<String, Integer> basket = new HashMap<String, Integer>();
	
	@Test
	public void testTotalCost(){
		basket.put("Bananas", 1);
		basket.put("Oranges", 1);
		basket.put("Apples", 1);
		basket.put("Lemons", 1);
		basket.put("Peaches", 1);
		
		//1. null value testing
		assertEquals(0,(new CostCalculationImpl()).totalCost(null));
		
		//2. Empty value testing
		assertEquals(0,(new CostCalculationImpl()).totalCost(new HashMap<String, Integer>())); 
		
		//3. valid values testing
		assertEquals(150,(new CostCalculationImpl()).totalCost(basket));
		
		//4. Negative value testing
		basket.put("Bananas", -1);
		assertEquals(140,(new CostCalculationImpl()).totalCost(basket));
		
		//5. Zero value testing
		basket.put("Bananas", 0);
		assertEquals(140,(new CostCalculationImpl()).totalCost(basket));
		
	}
	
}
