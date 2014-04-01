package Aufgabenblatt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Klasse repr�sentiert einen Web-Shop
 */
public class WebShop {
	/**
	 * Aufz�hlungstyp f�r die Sortierkriterien
	 */
	enum SortingCriterion {
		SORT_BY_LASTNAME_FIRSTNAME, SORT_BY_ID
	}

	/**
	 * Objektvariable f�r die Kundenliste des Shops
	 */
	private ArrayList<Customer> datenbank = new ArrayList<Customer>();;

	/**
	 * Methode zum Hinzuf�gen eines Kunden, bekommt Vor- und Nachname �bergeben.
	 * Daraus wird ein neues Kunden-Objekt erzeugt und der Kundenliste
	 * angeh�ngt.
	 */
	public void addCustomer(String inVorname, String inNachname) {
		datenbank.add(new Customer(inVorname, inNachname));
	}

	/**
	 * Methode zum L�schen eines Kunden. Sie bekommt Vor- und Nachname �bergeben.
	 * Dann wird die Hilfsmethode zum Suchen des Kunden aufgerufen und dieser
	 * wird dann entfernt.
	 */
	public void removeCustomer(String vorname, String nachname) {
		datenbank.remove(getCustomerAusDatenbank(vorname, nachname));
	}

	/**
	 * als Sortierkriterium wird ein Enum als Parameter �bergeben dann wird die
	 * Liste sortiert und mit Hilfe von toString ausgegeben
	 */
	public void printListOfCustomers(SortingCriterion sortBy) {
		if (sortBy == SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME) {
			Comparator<Customer> comp = new SortByNameComparator();
			Collections.sort(datenbank, comp);
		} else {
			Comparator<Customer> comp = new SortByIDComparator();
			Collections.sort(datenbank, comp);
		}
		System.out.println(this.toString());
	}

	public int compare(Customer kunde1, Customer kunde2) {
		int vergleichswert;
		if (kunde1.getNachname().equals(kunde2.getNachname())) {
			vergleichswert = kunde1.getVorname().compareTo(kunde2.getVorname());
		} else {
			vergleichswert = kunde1.getNachname().compareTo(
					kunde2.getNachname());
		}
		return vergleichswert;
	}

	/**
	 * Die Methode wandelt das Array in einen String um, der in Tabellenform zur�ckgeliefert
	 * wird
	 */
	@Override
	public String toString() {
		String ergebnis = "";
		for (int i = 0; i < datenbank.size(); i++) {
			ergebnis = ergebnis + datenbank.get(i).getNachname() + ","
					+ datenbank.get(i).getVorname() + "(ID: "
					+ datenbank.get(i).getKundenID() + ")" + "\n";
		}
		return ergebnis;

	}

	/**
	 * Hilfsmethode um einen Kunden in der Liste zu finden
	 */
	private Customer getCustomerAusDatenbank(String vorname, String nachname) {
		Customer aktuellerCustomer = null;
		for (Customer element : datenbank) {
			if (element.getVorname().equals(vorname)
					&& element.getNachname().equals(nachname)) {
				aktuellerCustomer = element;
				break;
			}
		}
		return aktuellerCustomer;
	}

}
