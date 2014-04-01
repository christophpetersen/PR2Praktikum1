package Aufgabenblatt1;

import java.util.Comparator;

/**
 * Klasse vergleicht zwei Kunden miteinander nach dem Alphabet.
 */
public class SortByNameComparator implements Comparator<Customer> {
	/**
	 * Methode vergleicht erst die Nachnamen miteinander, falls diese mit dem
	 * gleichen Buchstaben beginnen werden auch die Vornamen verglichen.
	 */
	@Override
	public int compare(Customer kunde1, Customer kunde2) {
		int ergebnis = 0;
		if (kunde1.getNachname().compareTo(kunde2.getNachname()) == 0) {
			if (kunde1.getVorname().compareTo(kunde2.getVorname()) == 0) {
				ergebnis = 0;
			} else if (kunde1.getVorname().compareTo(kunde2.getVorname()) < 0) {
				ergebnis = -1;
			} else {
				ergebnis = 1;
			}
		} else if (kunde1.getNachname().compareTo(kunde2.getNachname()) < 0) {
			ergebnis = -1;
		} else {
			ergebnis = 1;
		}
		return ergebnis;
	}

}
