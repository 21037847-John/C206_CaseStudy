import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class casestudyTest {
		public static void ViewAllLunchBoxOrder(ArrayList<lunchbox>LunchBoxOrderList) {
			Lunchboxmain.setHeader("LUNCHBOX ORDER LIST");
			String output = String.format("%-15s %-15s %-15s %-30s %-45s %-10s\n", "ORDER ID", "DATE", "SET MEAL",
			        "DRINK SET", "FRUIT SET", "PRICE");
			ViewAllLunchBoxOrder(LunchBoxOrderList);
			System.out.println(output);
		}
		
	
	@Test
	public void testAddviewlunchboxorder() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if valid orderlist add into arraylist",);
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		ResourceCentre.addCamcorder(camcorderList, cc1);
		assertEquals("Check that Camcorder arraylist size is 1", 1, camcorderList.size());
		assertSame("Check that Camcorder is added", cc1, camcorderList.get(0));
		
		//Add another item. test The size of the list is 2? -normal
		//The item just added is as same as the second item of the list
		ResourceCentre.addCamcorder(camcorderList, cc2);
		assertEquals("Check that Camcorder arraylist size is 2", 2, camcorderList.size());
		assertSame("Check that Camcorder is added", cc2, camcorderList.get(1));
	}
	@Test
	public void testAddChromebook() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Test if there is valid Chromebook arraylist to add to", chromebookList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1 - normal
		//The item just added is as same as the first item of the list
		ResourceCentre.addChromebook(chromebookList, cb1);		
		assertEquals("Test that Chromebook arraylist size is 1", 1, chromebookList.size());
		assertSame("Test that Chromebook is added", cb1, chromebookList.get(0));
		
		//Add another item. test The size of the list is 2? - normal
		//The item just added is as same as the second item of the list
		ResourceCentre.addChromebook(chromebookList, cb2);
		assertEquals("Test that Chromebook arraylist size is 2", 2, chromebookList.size());
		assertSame("Test that Chromebook is added", cb2, chromebookList.get(1));
	}
	
	@Test
	public void testRetrieveAllCamcorder() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Camcorder arraylist to retrieve item", camcorderList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty - boundary
		String allCamcorder= ResourceCentre.retrieveAllCamcorder(camcorderList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allCamcorder);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
		ResourceCentre.addCamcorder(camcorderList, cc1);
		ResourceCentre.addCamcorder(camcorderList, cc2);
		assertEquals("Test that Camcorder arraylist size is 2", 2, camcorderList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre	
		allCamcorder= ResourceCentre.retrieveAllCamcorder(camcorderList);
		testOutput = String.format("%-10s %-30s %-10s %-10s %-20s\n","CC0011", "Nikon HDSLR", "Yes", "", "40");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n","CC0012", "Sony DSC-RX100M7", "Yes", "", "20" );
	
		assertEquals("Test that ViewAllCamcorderlist", testOutput, allCamcorder);
		
	}
 