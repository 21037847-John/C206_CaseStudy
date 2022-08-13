import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * {21037847 Sansalian John}, {7/7/2022} {09.15}
 */

/**
 * @author 21037847
 *
 */
public class C206_GA_John_JUnit_Testing {

	private userAccount uc1;
	private userAccount uc2;
	private userAccount uc3;
	private ArrayList<userAccount> userList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {

		uc1 = new userAccount(21234567, "John");
		uc2 = new userAccount(21345678, "Swathi");
		uc3 = new userAccount(21456789, "Vessa");
	}

	@Test
	public void testAddAcc() {
		// List is not null, so can add new item
		assertNotNull("Test if there is a valid account ArrayList to add into", userList);

		// Given an empty list, after adding 1 account, the size of the arrayList is 1
		userList.add(uc1);
		assertEquals("Test if the account arrayList size is 1?", 1, userList.size());

		// The account added is same as the item on the first item in the arrayList
		assertSame("Test that account is added same as 1st item of the list?", uc1, userList.get(0));
		// Add 2 more items, test if the size of the arraylist is 3
		userList.add(uc2);
		userList.add(uc3);

		assertEquals("Test that the user acc arrayList size is 3?", 3, userList.size());
		assertSame("Test if the 2nd item added is same as the 2nd item in arrayList?", uc2, userList.get(1));
		assertSame("Test if the 3rd item added is same as the 3rd item in arrayList?", uc3, userList.get(2));

		// fail("Not yet implemented");
	}

	@Test
	public void testDelAcc() {
		// List is not null, so can del an item
		assertNotNull("Test if there is a valid account ArrayList to delete item", userList);

		// Del 1 item, see if the list size is reduce by 1
		userList.add(uc1);
		userList.add(uc2);
		userList.remove(0);
		assertEquals("Test that the user acc arraylist size is 1?", 1, userList.size());

		// del all item, see if list size is 0
		userList.remove(1);
		assertEquals("Test that the user acc arraylist size is 0?", 0, userList.size());

	}

	@Test
	public void testRetrieveAllAcc() {
		// test if the list of useraccount retrieved from the case_study is empty
		ArrayList<userAccount> allUserAcc = userList;
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", userList, testOutput);

		// Given an empty list, after adding 2 items, test if the size of the list is 2
		userList.add(uc1);
		userList.add(uc2);
		assertEquals("Test if that userAccount arraylist size is 2?", 2, userList.size());

		// test if the expected output string same as the list of user Account retrieved
		// from the CaseStudy

		testOutput = String.format("%-10s %-30s \n", 21234567, "John");
		testOutput += String.format("%-10s %-30s \n", 21345678, "Swathi");

		assertEquals("Check that ViewAllCamcorderlist", testOutput, userList);

	}

	@After
	public void tearDown() throws Exception {
	}

}
