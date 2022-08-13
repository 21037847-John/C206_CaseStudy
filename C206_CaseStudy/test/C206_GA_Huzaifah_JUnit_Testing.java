import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_GA_Huzaifah_JUnit_Testing {

	private Western w1;
	private Western w2;
	private Western w3;

	private Vegetarian v1;
	private Vegetarian v2;
	private Vegetarian v3;

	private Fruit f1;
	private Fruit f2;
	private Fruit f3;

	private Drink d1;
	private Drink d2;
	private Drink d3;

	private Asian a1;
	private Asian a2;
	private Asian a3;

	private ArrayList<Western> westernList;
	private ArrayList<Asian> asianList;
	private ArrayList<Vegetarian> vegetarianList;
	private ArrayList<Fruit> fruitList;
	private ArrayList<Drink> drinkList;

	public C206_GA_Huzaifah_JUnit_Testing() {
		super();
	}

	@Before
	public void setUp() throws Exception {
		w1 = new Western(1011, "test1", "Western", 3.00);
		w2 = new Western(1012, "test2", "Western", 4.00);
		w3 = new Western(1013, "test3", "Western", 5.00);

		v1 = new Vegetarian(1001, "ABC", "Vegetarian", 5.00);
		v2 = new Vegetarian(1002, "DEF", "Vegetarian", 5.00);
		v3 = new Vegetarian(1003, "GHI", "Vegetarian", 5.00);

		f1 = new Fruit(1001, "ABC", "Fruit", 2.50);
		f2 = new Fruit(1002, "DEF", "Fruit", 2.50);
		f3 = new Fruit(1003, "GHI", "Fruit", 2.50);

		d1 = new Drink(1001, "ABC", "Drink", 2.50);
		d2 = new Drink(1002, "DEF", "Drink", 2.50);
		d3 = new Drink(1003, "GHI", "Drink", 2.50);

		a1 = new Asian(1001, "ABC", "Asian", 5.00);
		a2 = new Asian(1002, "DEF", "Asian", 5.00);
		a3 = new Asian(1003, "GHI", "Asian", 5.00);

		westernList = new ArrayList<Western>();
		asianList = new ArrayList<Asian>();
		vegetarianList = new ArrayList<Vegetarian>();
		fruitList = new ArrayList<Fruit>();
		drinkList = new ArrayList<Drink>();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddWestern() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Western arraylist to add to", westernList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		westernList.add(w1);
		assertEquals("Check that Western arraylist size is 1", 1, westernList.size());
		assertSame("Check that Western is added", w1, westernList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		westernList.add(w2);
		assertEquals("Check that Western arraylist size is 2", 2, westernList.size());
		assertSame("Check that Western is added", w2, westernList.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		westernList.add(w3);
		assertEquals("Check that Western arraylist size is 3", 3, westernList.size());
		assertSame("Check that Western is added", w3, westernList.get(2));
	}
	
	@Test
	public void testAddAsian() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Asian arraylist to add to", asianList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		asianList.add(a1);
		assertEquals("Check that Asian arraylist size is 1", 1, asianList.size());
		assertSame("Check that Asian is added", a1, asianList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		asianList.add(a2);
		assertEquals("Check that Asian arraylist size is 2", 2, asianList.size());
		assertSame("Check that Asian is added", a2, asianList.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		asianList.add(a3);
		assertEquals("Check that Asian arraylist size is 3", 3, asianList.size());
		assertSame("Check that Asian is added", a3, asianList.get(2));
	}
	
	@Test
	public void testAddVegetarian() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Vegetarian arraylist to add to", vegetarianList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		vegetarianList.add(v1);
		assertEquals("Check that Vegetarian arraylist size is 1", 1, vegetarianList.size());
		assertSame("Check that Vegetarian is added", v1, vegetarianList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		vegetarianList.add(v2);
		assertEquals("Check that Vegetarian arraylist size is 2", 2, vegetarianList.size());
		assertSame("Check that Vegetarian is added", v2, vegetarianList.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		vegetarianList.add(v3);
		assertEquals("Check that Vegetarian arraylist size is 3", 3, vegetarianList.size());
		assertSame("Check that Vegetarian is added", v3, vegetarianList.get(2));
	}
	
	@Test
	public void testAddFruit() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Fruit arraylist to add to", fruitList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		fruitList.add(f1);
		assertEquals("Check that Fruit arraylist size is 1", 1, fruitList.size());
		assertSame("Check that Fruit is added", f1, fruitList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		fruitList.add(f2);
		assertEquals("Check that Fruit arraylist size is 2", 2, fruitList.size());
		assertSame("Check that Fruit is added", f2, fruitList.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		fruitList.add(f3);
		assertEquals("Check that Fruit arraylist size is 3", 3, fruitList.size());
		assertSame("Check that Fruit is added", f3, fruitList.get(2));
	}
	
	@Test
	public void testAddDrink() {
		// Item list is not null, so that can add a new item - boundary
		assertNotNull("Check if there is valid Drink arraylist to add to", drinkList);
		// Given an empty list, after adding 1 item, the size of the list is 1 - normal
		// The item just added is as same as the first item of the list
		drinkList.add(d1);
		assertEquals("Check that Drink arraylist size is 1", 1, drinkList.size());
		assertSame("Check that Drink is added", d1, drinkList.get(0));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		drinkList.add(d2);
		assertEquals("Check that Drink arraylist size is 2", 2, drinkList.size());
		assertSame("Check that Drink is added", d2, drinkList.get(1));

		// Add another item. test The size of the list is 2? -normal
		// The item just added is as same as the second item of the list
		drinkList.add(d3);
		assertEquals("Check that Drink arraylist size is 3", 3, drinkList.size());
		assertSame("Check that Drink is added", d3, drinkList.get(2));
	}
	
	@Test
	public void testRetrieveAllWestern() {
		// Test if Item list is not null but empty -boundary
		assertNotNull("Test if there is valid Western arraylist to retrieve item", westernList);
		
		//test if the list of Western retrieved from the SourceCentre is empty - boundary
		String allWestern= menuMain.retrieveAllWestern(westernList);
		String testOutput = "";
		assertEquals("Check that viewAllWestern", testOutput, allWestern);
		
		//Given an empty list, after adding 3 items, test if the size of the list is 3 - normal
		
		westernList.add(w1);
		assertEquals("Test that Western arraylist size is 1", 1, westernList.size());
		
//		westernList.add(w2);
//		assertEquals("Test that Western arraylist size is 2", 2, westernList.size());
//		
//		westernList.add(w3);
//		assertEquals("Test that Western arraylist size is 3", 3, westernList.size());
		
		//test if the expected output string same as the list of Western retrieved from the SourceCentre	
		allWestern = menuMain.retrieveAllWestern(westernList);
		testOutput = String.format("%-10d %-30s %-10.2f %-10s %-20s\n",1011, "test", 3.00, "Yes", "Western");
//		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n","1002", "DEF", "5.00", "Yes", "Western");
//		testOutput += String.format("%-10s %-30s %-10s %-10s %-20s\n","1003", "GHI", "5.00", "Yes", "Western");
	
		assertEquals("Test that viewAllWestern", allWestern, testOutput);
		
	}

}
