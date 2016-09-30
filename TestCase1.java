package com.example.testcase;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.example.rbc.RBCImpl;

public class TestCase1 {
	
	public Map<String, Integer> basket = new HashMap<String, Integer>();
	
	@Test
	public void testTotalCostNull(){
		assertEquals(0,(new RBCImpl()).totalCost(null));
		assertEquals(0,(new RBCImpl()).totalCost(new HashMap())); 
		
		basket.put("Bananas", 1);
		basket.put("Oranges", 1);
		basket.put("Apples", 1);
		basket.put("Lemons", 1);
		basket.put("Peaches", 1);
		
		assertEquals(150,(new RBCImpl()).totalCost(basket));
		
	}
	
}
