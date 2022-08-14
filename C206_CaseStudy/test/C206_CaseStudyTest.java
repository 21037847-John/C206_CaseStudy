/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Vanessa_Quan, 10 August 2022 7:35:24
 */
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class C206_CaseStudyTest {
	
	private OrderBill OB1;
	private OrderBill OB2;
	
	
	private ArrayList<OrderBill> OrderBillList;
	
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUpBeforeClass() throws Exception {
		// prepare test data
		OB1 = new OrderBill(1,"Western","Coke","Apple",14.00,"19/03/2022");
		OB2 = new OrderBill(2,"Asian","Milo","Honeydew",16.00,"22/03/2022");

		OrderBillList = new ArrayList<OrderBill>();
		
	}
	
	@Test
	public void testAddOrderBill() {
		// OrderBill list is not null, so that can add a new item
		assertNotNull("Test if there is valid order bill arraylist to add to", OrderBillList);
		
		//Given an empty list, after adding 1 order Bill, the size of the list is 1
		C206_CaseStudy.addOrderBill(OrderBillList, OB1);		
		assertEquals("Test if that order bill arraylist size is 1?", 1, OrderBillList.size());
		
		//The order Bill just added is as same as the first order Bill of the list
		assertSame("Test that order bill is added same as 1st order bill of the list?",OB1, OrderBillList.get(0));
		
		//Add another order Bill, test The size of the list is 2?
		C206_CaseStudy.addOrderBill(OrderBillList, OB2);
		assertEquals("Test that order Bill arrayList size is 2?", 2, OrderBillList.size());
	}
	@Test
	public void delOrderBillTest() {
		//Test that there is something to delete in the OrderBillList
		C206_CaseStudy.addOrderBill(OrderBillList, OB1);
		C206_CaseStudy.deleteOrderBill(OrderBillList);
		assertNotNull ("Test if there is valid OrderBill arraylist to delete", OrderBillList);
		
		//Given an empty OrderBill List, after deleting 2 items, test if the size of the list is 0
		C206_CaseStudy.addOrderBill(OrderBillList,OB1);
		C206_CaseStudy.addOrderBill(OrderBillList,OB2);
		OrderBillList.clear();
		assertEquals("Test that OrderBillList  size is 0", 0, OrderBillList.size());
		
		//Test that OrderBill list can't be cleared if it's empty
		assertEquals("Test that OrderBillList is empty after delete", 0, OrderBillList.size());
		OrderBillList.clear();
	}

	@Test
	public void viewOrderBillTest() {
		//Test if the expected output string is the same as the list of OrderBill retrieved 
		String allOrderBill = C206_CaseStudy.retrieveAllOrderBill(OrderBillList);
		String output = "";
		assertEquals("Check that ViewAllOrderBillList", output, allOrderBill);
		
		//Given an empty list, after adding 2 items, test if the size of the list is 2 - Boundary
		C206_CaseStudy.addOrderBill(OrderBillList, OB1);
		C206_CaseStudy.addOrderBill(OrderBillList, OB2);
		assertEquals("Test if OrderBill arraylist size is 2", 2, OrderBillList.size());
		
		//Test if OrderBillList is not null but empty, so that can add a new item - Normal
		assertNotNull("Test if there is a valid OrderBill arrayList to add to", OrderBillList);
	}
	
/*	public void updateOrderBillTest() {
		
		//Normal
		C206_CaseStudy.addOrderBill(OrderBillList, OB1);
		C206_CaseStudy.updateOrderBill(OrderBillList); // Update test - Delete
		assertSame("Test that OrderBill added and updated is same as 1st item of the list?", OB1, OrderBillList.get(0));
		
		//Boundary (Don't think can be tested)
		
		//Error
		
		C206_CaseStudy.updateOrderBill(OrderBillList);
		assertNotSame("Test that OrderBill updated is not the same as 1st item of the list", OB2, OrderBillList.get(1)); //change to transactionList.get(0) for error
		
		
	} */

	

	
	
	
	
	@After
	public void tearDown() throws Exception {

	}
	


		
		
		
		
		
	
	
}
