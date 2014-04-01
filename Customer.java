package Aufgabenblatt1;

/**
 * Klasse repr�sentiert einen Kunden
 */
public class Customer {
	/**
	 * Klassenvariable f�r einen statischen Z�hler
	 */
	public static int objektZaehler = 0;
	/**
	 * Objektvariablen: Ein Kunde hat einen Vor- und Nachnamen und eine
	 * eindeutige ID.
	 */
	private String vorname;
	private String nachname;
	private final int kundenID;

	/**
	 * Konstruktor bekommt den Vor- und Nachname ��bergeben und speichert diese
	 * in den zugeh�rigen Variablen. Au�erdem wird der Z�hler erh�ht und der ID
	 * wird der Wert des Z�hlers zugewiesen. Damit ist die ID eindeutig.
	 */
	public Customer(String inVorname, String inNachname) {
		vorname = inVorname;
		nachname = inNachname;
		kundenID = objektZaehler;
		objektZaehler++;
	}

	/**
	 * @return the firstName
	 */
	public String getVorname() {
		return vorname;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	/**
	 * @return the lastName
	 */
	public String getNachname() {
		return nachname;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	/**
	 * @return the ID
	 */
	public int getKundenID() {
		return kundenID;
	}

	@Override
	public String toString() {
		String customer = "Vorname: " + this.getVorname() + "\n" + "Nachname: "
				+ this.getNachname() + "\n" + "KundenID: " + this.getKundenID();
		return customer;
	}

}
