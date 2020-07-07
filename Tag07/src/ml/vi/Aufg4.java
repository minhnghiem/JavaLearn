package ml.vi;

import java.util.Scanner;

//Aufgabe 4
//Schreiben Sie ein Programm, das den Benutzer nach einem Kennwort fragt. Dieses Kennwort soll sicher sein. Zun�chst bezeichnen wir ein Kennwort als sicher, wenn es mindestens 10 Zeichen beinhaltet. Schreiben Sie eine Funktion, die �berpr�ft, ob das Kennwort diese Anforderung erf�llt. Im Hauptprogramm soll dieses Ergebnis ausgewertet werden. Falls es nicht sicher ist, teilen Sie dem Benutzer mit, wie viele Zeichen fehlen.
//o Erweitern Sie das Kennwortprogramm. Dazu versch�rfen wir die Regeln f�r ein sicheres Kennwort. Als sicher gilt nun ein Kennwort, das aus mindestens einem Gro�buchstaben und einer Ziffer besteht. Die L�nge spielt nun keine Rolle mehr.
//o Erweitern Sie die Funktion, so dass diese nun pr�ft, ob im Kennwort sowohl ein Gro�buchstabe als auch eine Ziffer steht.
//o Erweitern Sie das Programm nun so, dass die Funktion pr�ft, ob das Kennwort 10 Zeichen lang ist und mindestens einen Gro�buchstaben und eine Ziffer enth�lt. Testen Sie die Funktion wieder.
//Zusatzaufgabe: Erweitern Sie die Funktion so, dass auch ein Kleinbuchstabe und ein Sonderzeichen enthalten sein muss.

public class Aufg4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String kennwort = scanner.next();

		System.out.println("Mindestens 10 Buchstaben? ");

		if (kennwort.length() < 10)
			System.out.println("Kennwort ist nicht sicher. Es fehlen " + (10 - kennwort.length()) + " Zeichen.");
		else
			System.out.println("Kennwort ist sicher.");

		System.out.println("Mindestens ein Gro�buchstabe oder eine Ziffer?");

		boolean check_cap = false;
		boolean check_num = false;

		for (int i = (int) 'A'; i <= (int) 'Z'; i++) {
			String temp = "" + (char) i;
			if (check_cap = kennwort.contains(temp))
				break;
		}

		for (int i = (int) '0'; i <= (int) '9'; i++) {
			String temp = "" + (char) i;
			if (check_num = kennwort.contains(temp))
				break;
		}

		if (check_cap || check_num)
			System.out.println("Kennwort ist sicher.");
		else
			System.out.println("Kennwort ist nicht sicher");

		System.out.println("Mindestens ein Gro�buchstabe und eine Ziffer?");

		if (check_cap && check_num)
			System.out.println("Kennwort ist sicher.");
		else
			System.out.println("Kennwort ist nicht sicher");

		System.out.println("Mindestens 10 Buchstaben, ein Gro�buchstabe und eine Ziffer?");

		if (check_cap && check_num && (kennwort.length() > 9))
			System.out.println("Kennwort ist sicher.");
		else
			System.out.println("Kennwort ist nicht sicher");

		scanner.close();

	}

}
