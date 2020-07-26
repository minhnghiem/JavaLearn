package ml.vi;

public abstract class Topping implements Pizza {

	private Pizza below;
	protected final int hotcounter_limit = 2;

	public Pizza getBelow() {
		return below;
	}

	public void setBelow(Pizza below) {
		this.below = below;
	}

	@Override
	public abstract int getPrice();

	@Override
	public abstract boolean isVegetable();

	@Override
	public abstract boolean isHot();

	@Override
	public void printInfo() {
		System.out.println("Preis: " + this.getPrice());
		System.out.println("Vegi ? " + this.isVegetable());
		System.out.println("Scharf ? " + this.isHot());
		System.out.println();
	}

	public abstract int getHot_counter();

}
