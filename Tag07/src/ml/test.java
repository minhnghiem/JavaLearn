package ml;

public class test {

	public static void main(String[] args) {

		int a = 10;
		int b = 25;

		a += (a = 4);
		b = (b = 5 +1) + b;

		System.out.println(a + "  " + b);

	}

}
