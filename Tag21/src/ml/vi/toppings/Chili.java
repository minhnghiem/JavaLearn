package ml.vi.toppings;

import ml.vi.Pizza;
import ml.vi.Topping;

public class Chili extends Topping {

	final private int preis = 95;
	final private boolean vegi = true;
	private boolean hot = true;
	private int hot_counter = 0;

	public Chili(Pizza base) {
		this.setBelow(base);
		if (base.isHot()) {
			this.hot_counter = this.hotcounter_limit;
		} else {
			this.hot_counter = hot ? base.getHot_counter() + 1 : base.getHot_counter();
		}
	}

	@Override
	public int getHot_counter() {
		return hot_counter;
	}

	@Override
	public int getPrice() {
		return this.getBelow().getPrice() + preis;
	}

	@Override
	public boolean isVegetable() {
		return this.getBelow().isVegetable() && vegi;
	}

	@Override
	public boolean isHot() {

		if (hot_counter == this.hotcounter_limit) {
			return true;
		} else {
			return false;
		}
	}

}
