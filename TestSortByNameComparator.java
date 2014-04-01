package Aufgabenblatt1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestSortByNameComparator {

	@Test
	public void testCompare() {

		Customer kunde1 = new Customer("Jogi", "L�w");
		Customer kunde2 = new Customer("Bernd", "L�w");
		Customer kunde3 = new Customer("Bernd", "Hoene�");
		Customer kunde4 = new Customer("Bernd", "Hoene�");
		Customer kunde5 = new Customer("J�rgen", "Klopp");

		SortByNameComparator comp = new SortByNameComparator();

		assertEquals(comp.compare(kunde1, kunde2), 1);
		assertEquals(comp.compare(kunde2, kunde3), 1);
		assertEquals(comp.compare(kunde3, kunde4), 0);
		assertEquals(comp.compare(kunde4, kunde5), -1);
	}
}
