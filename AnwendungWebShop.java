package Aufgabenblatt1;

import Aufgabenblatt1.WebShop.SortingCriterion;

public class AnwendungWebShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebShop amazone = new WebShop();
		amazone.addCustomer("Jogi", "Lšw");
		amazone.addCustomer("Uli", "Hoene§");
		amazone.addCustomer("Hansi", "Flick");
		amazone.addCustomer("Dieter", "Hoene§");
		amazone.addCustomer("Hansi", "Flick");
		amazone.addCustomer("Mehmet", "Scholl");
		amazone.addCustomer("Marco", "Reus");
		
		amazone.printListOfCustomers(SortingCriterion.SORT_BY_LASTNAME_FIRSTNAME);
		amazone.printListOfCustomers(SortingCriterion.SORT_BY_ID);
		amazone.removeCustomer("Mehmet", "Scholl");
		amazone.removeCustomer("Hansi", "Flick");
		amazone.printListOfCustomers(SortingCriterion.SORT_BY_ID);

	}

}
