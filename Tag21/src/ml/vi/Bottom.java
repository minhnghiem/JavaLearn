package ml.vi;

public abstract class Bottom implements Pizza {

	private int hot_counter = 0;

	@Override
	public int getHot_counter() {
		return this.hot_counter;
	}

	@Override
	public abstract int getPrice();

	@Override
	public boolean isVegetable() {
		return true;
	}

	@Override
	public boolean isHot() {
		return false;
	}

	@Override
	public void printInfo() {
		System.out.println("Preis: " + this.getPrice());
		System.out.println("Vegi ? " + this.isVegetable());
		System.out.println("Scharf ? " + this.isHot());
		System.out.println();
	}

}
