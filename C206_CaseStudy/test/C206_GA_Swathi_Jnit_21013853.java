import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_GA_Swathi_Jnit_21013853 {

	private lunchbox b1;
	private lunchbox b2;
	private lunchbox b3;

	private Bill A1;
	private Bill A2;
	private Bill A3;

	private DailyMenu D1;
	private DailyMenu D2;
	private DailyMenu D3;

	private Item c1;
	private Item c2;
	private Item c3;

//Bill(int bill_id, String meal, String drink, String fruit, double amount )	
	ArrayList<lunchbox> LunchBoxOrderList = new ArrayList<lunchbox>();
	ArrayList<Bill> billList = new ArrayList<Bill>();
    ArrayList<DailyMenu> weeklyMenuList = new ArrayList<DailyMenu>();
    ArrayList<Item> item_bank = new ArrayList<Item>(); // will contain 35 items (7 of each type)

	public C206_GA_Swathi_Jnit_21013853() {
		super();
	}
//Bill(int bill_id, String meal, String drink, String fruit, double amount )
	@Before
	public void setUp() throws Exception {
		b1=new lunchbox (1, "7/8/22", "Western cusine", "Orange Juice", "Watermelon", 4.00);
	    b2=new lunchbox(2, "8/8/22", "Japanese cusine", "apple Juice", "Apple", 3.60);
	    b3=new lunchbox(3, "9/8/22", "Vegeterian cusine", "Grapes Juice", "Orange", 4.10);
	    
	    A1 = new Bill(1,"Western cusine","Orange Juice", "Watermelon", 4.00);
	    A2=  new Bill(2,"Japanese cusine", "apple Juice", "Apple", 3.60);
	    A3=new Bill(3,"Vegeterian cusine", "Grapes Juice", "Orange", 4.10);
	    

		 D1= new DailyMenu(1, "Monday", "Spaghetti", "Chicken Rice", "Dumpling Noodle Soup",
        "Low-fat Milk", "Apple Juice", "Milo", "Watermelon", "Honeydew", "Apple");
         D2= new DailyMenu(2, "Tuesday", "Burger with fries", "Fried Rice", "Fried Bee Hoon", "Ribena",
        	        "Chocolate Milk", "Wintermelon Tea", "Banana", "Grapes", "Green apple");
		 D3= new DailyMenu(3, "Wednesday", "Chicken Chop", "Wanton Mee", "Egg Fried Rice", "Green Tea",
        "Soya Milk", "Carrot Juice", "Melon", "Kiwi", "Mango");

		c1=new Item(6, "Asian", "Nasi Lemak", "Fragrant rice, Sambal, Eggs", 3.50);
		c2=new Item(11, "Vegeterian", "Mixed Vegie Rice", "Rice, Mixed Vegetables", 3.50);
		c3=new Item(16, "Cold beverage", "Strawberry tea", "Strawberry tea ", 3.50);

		LunchBoxOrderList = new ArrayList<lunchbox>();
		billList = new ArrayList<Bill>();
		weeklyMenuList = new ArrayList<DailyMenu>();
		item_bank = new ArrayList<Item>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddlunchbox() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Western LunchBoxOrderList to add to", LunchBoxOrderList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		LunchBoxOrderList.add(b1);
		assertEquals("Check that LunchBoxOrderList arraylist size is 1", 1, LunchBoxOrderList.size());
		assertSame("Check that lunchbox is added", b1, LunchBoxOrderList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		LunchBoxOrderList.add(b2);
		assertEquals("Check that lunchbox arraylist size is 2", 2, LunchBoxOrderList.size());
		assertSame("Check that LunchBoxOrderList is added", b2, LunchBoxOrderList.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		LunchBoxOrderList.add(b3);
		assertEquals("Check that LunchBoxOrderList arraylist size is 3", 3, LunchBoxOrderList.size());
		assertSame("Check that lunchbox is added", b3, LunchBoxOrderList.get(2));
	}
	
	@Test
	public void testBill() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Bill arraylist to add to",billList );
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		billList.add(A1);
		assertEquals("Check that Bill arraylist size is 1", 1, billList.size());
		assertSame("Check that bill is added", A1, billList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		billList.add(A2);
		assertEquals("Check that Bill arraylist size is 2", 2, billList.size());
		assertSame("Check that Bill is added", A2, billList.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		billList.add(A3);
		assertEquals("Check that Bill arraylist size is 3", 3, billList.size());
		assertSame("Check that Bill is added", A3, billList.get(2));
	}
	
	@Test
	public void testweeklyMenu() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid weeklyMenu arraylist to add to", weeklyMenuList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		weeklyMenuList.add(D1);
		assertEquals("Check that weeklyMenu arraylist size is 1", 1, weeklyMenuList.size());
		assertSame("Check that weeklyMenu is added", D1, weeklyMenuList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		weeklyMenuList.add(D2);
		assertEquals("Check that weeklyMenu arraylist size is 2", 2, weeklyMenuList.size());
		assertSame("Check that weeklyMenu is added", D2, weeklyMenuList.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		weeklyMenuList.add(D3);
		assertEquals("Check that weeklyMenu arraylist size is 3", 3, weeklyMenuList.size());
		assertSame("Check that weeklyMenu is added", D3, weeklyMenuList.get(2));
	}
	
	@Test
	public void testitem_bank() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Item arraylist to add to", item_bank);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		item_bank.add(c1);
		assertEquals("Check that Item arraylist size is 1", 1, item_bank.size());
		assertSame("Check that Item is added", c1, item_bank.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		item_bank.add(c2);
		assertEquals("Check that Item arraylist size is 2", 2, item_bank.size());
		assertSame("Check that Item is added", c2, item_bank.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		item_bank.add(c3);
		assertEquals("Check that Item arraylist size is 3", 3,item_bank.size());
		assertSame("Check that Item is added", c3, item_bank.get(2));
	}
	
	@Test
	public void testRetrieveAlllunchbox() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid LunchBox arraylist to retrieve item",LunchBoxOrderList);
		
		//test if the list of Western retrieved from the SourceCentre is empty - boundary
		String alllunchbox= Lunchboxmain.retrieveAllLunchBoxOrder(LunchBoxOrderList);
		String testOutput = "";
		assertEquals("Check that viewAllWestern", testOutput, alllunchbox);
		
		//Given an empty list, after adding 3 items, test if the size of the list is 3 - normal
		LunchBoxOrderList.add(b1);
		LunchBoxOrderList.add(b2);
		LunchBoxOrderList.add(b3);
		assertEquals("Test that LunchBoxOrderList size is 3", 3, LunchBoxOrderList.size());
		
		//test if the expected output string same as the list of lunchbox retrieved from the SourceCentre	
		alllunchbox= Lunchboxmain.retrieveAllLunchBoxOrder(LunchBoxOrderList);
	
		testOutput += String.format("%-20s %-20s %-20s %-20s %-20s %-20s", 1, "7/8/22", "Western cusine", "Orange Juice", "Watermelon", 4.00);


	
		assertEquals("Test that viewAllWestern", testOutput, alllunchbox);
		
	}

}


