package Aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSortByIDComparator {

	@Test
	public void testCompare() {

		Customer kunde1 = new Customer("Jogi", "Lšw");
		Customer kunde2 = new Customer("Bernd", "Lšw");

		SortByIDComparator comp = new SortByIDComparator();

		assertEquals(comp.compare(kunde1, kunde2), -1);
		assertEquals(comp.compare(kunde2, kunde1), 1);
		assertEquals(comp.compare(kunde1, kunde1), 0);

	}
}
