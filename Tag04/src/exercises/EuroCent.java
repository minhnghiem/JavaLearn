package exercises;

import java.util.Scanner;

public class EuroCent {

	 public static void main(String[] arg) {
		 
		Scanner scanner = new Scanner(System.in);
		int zahl = scanner.nextInt();
		System.out.println("Eingabe: " + zahl);
		System.out.print("Ausgabe: Das macht " + (zahl/100));
		System.out.println(" Euro und " + (zahl%100) + " Cent");
		
		scanner.close();
		
	 }
}
