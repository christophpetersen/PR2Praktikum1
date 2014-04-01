package Aufgabenblatt1;

import java.util.Comparator;

/**
 * Klasse vergleicht zwei Kunden nach ihrer ID miteinander.
 */
public class SortByIDComparator implements Comparator<Customer> {
	/**
	 * Methode subtrahiert die ID's der beiden Kunden voneinander und liefert
	 * das Ergebnis zurück.
	 */
	@Override
	public int compare(Customer kunde1, Customer kunde2) {
		if (kunde1.getKundenID() == kunde2.getKundenID()) {
			return 0;
		} else if (kunde1.getKundenID() < kunde2.getKundenID()) {
			return -1;
		} else {
			return 1;
		}
	}
}
