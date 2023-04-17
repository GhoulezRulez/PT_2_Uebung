package U3;

import java.util.*; //hier wird package und die "Tools" für das Java Programm reinladen

public class Account {

	int accountNumber, customerNumber, postzahl; // hier werden die Attribute deklariert
	String firstName, lastName;

	public void showme() { // hier wird die Methode erstellt

		Scanner input = new Scanner(System.in); // hier wird der Scanner "Input" erstellt der den InputStream abliest.

		int eingabe = input.nextInt(); // hier wird der nächste int-wert des Nutzers abgefangen und in Variabel
										// "eingabe" gespeichert.

		System.out.println("Das ist die Eingabe: " + eingabe); // hier wird eine Ausgabe getätigt.

	}

}
