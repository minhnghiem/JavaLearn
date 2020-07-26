package ml.vi;

public interface Pizza {

	int getPrice(); // Preis in Cent

	boolean isVegetable(); // Pizza ist vegetarisch?

	boolean isHot(); // Pizza ist scharf?

	public int getHot_counter();

	void printInfo();

}