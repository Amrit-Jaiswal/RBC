import java.util.HashMap;
import java.util.Map;

import com.example.rbc.RBCImpl;


public class MainClass {
	public static Map<String, Integer> basket = new HashMap<String, Integer>();
	
	public static void main(String args[]){
		MainClass obj = new MainClass();
		obj.add();
		RBCImpl rbcImpl = new RBCImpl();
		System.out.println("Total cost: "+rbcImpl.totalCost(basket));
	}
	
	/**
	 * Adding some values in basket
	 */
	public void add(){
		basket.put("Bananas", 1);
		basket.put("Oranges", 1);
		basket.put("Apples", 1);
		basket.put("Lemons", 1);
		basket.put("Peaches", 1);
	}

}
