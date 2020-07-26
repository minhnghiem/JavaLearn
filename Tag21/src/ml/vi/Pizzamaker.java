package ml.vi;

import ml.vi.bottoms.Crusty;
import ml.vi.toppings.Cheese;
import ml.vi.toppings.Chili;
import ml.vi.toppings.Salami;

public class Pizzamaker {

	public static void main(String[] args) {
		
		Pizza custom = new Crusty();		
		custom.printInfo();
		
		custom = new Cheese(custom);
		custom.printInfo();
		custom = new Chili(custom);
		custom.printInfo();
		custom = new Chili(custom);
		custom.printInfo();
		custom = new Cheese(custom);
		custom.printInfo();
		custom = new Cheese(custom);
		custom.printInfo();
		custom = new Cheese(custom);
		custom.printInfo();
		custom = new Cheese(custom);
		custom.printInfo();
		custom = new Cheese(custom);
		custom.printInfo();
		custom = new Salami(custom);
		custom.printInfo();
		
	}
	
}
