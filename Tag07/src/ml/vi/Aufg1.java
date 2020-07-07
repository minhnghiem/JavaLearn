package ml.vi;

//Aufgabe 1
//Schreiben Sie ein Programm mit den Variablen �vorname� und �nachname� jeweils vom Typ �string�. Initialisieren Sie diese beiden Variablen mit Ihrem Vor- und Nachnamen. Erzeugen Sie eine weitere Variable �name�. Der Inhalt dieser Variablen soll die Kombination aus der Variablen vorname und der Variablen nachname sein. Geben Sie den Inhalt dieser Variablen aus.
//Erweitern Sie das Programm anschlie�end so, dass es die L�nge des Vornamens, des Nachnamens und des kompletten Namens ausgibt.
//Erweitern Sie das obige Programm um eine Variable �kuerzel�. Diese Variable soll Ihre Initialen enthalten. Ermitteln Sie diese Initialen aus den Variablen �vorname� und Nachname.

public class Aufg1 {

	public static void main(String[] args) {

		String vorname = "Minh";
		String nachname = "Vi";
		String name = vorname + " " + nachname;

		System.out.println(name);
		System.out.println("L�nge des Vornamens: " + vorname.length());
		System.out.println("L�nge des Nachnamens: " + nachname.length());
		System.out.println("L�nge des kompletten Namens: " + name.replace(" ", "").length());

		String kuerzel = vorname.charAt(0) + "" + nachname.charAt(0);
		System.out.println(kuerzel);
	}

}
