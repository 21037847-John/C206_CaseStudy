/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Vanessa_Quan, 10 August 2022 7:35:24
 */
import java.util.ArrayList;

public class C206_CaseStudy {

		private static final int OPTION_VIEW = 1;
		private static final int OPTION_ADD = 2; 
		private static final int OPTION_DELETE = 3;
		private static final int OPTION_UPDATE = 4;
		private static final int OPTION_QUIT = 5;
		
		public static void main(String[] args) {

			ArrayList<OrderBill> OrderBillList = new ArrayList<OrderBill>();
			OrderBillList.add(new OrderBill(1,"Western","Coke","Apple",14.00,"19/03/2022"));
			OrderBillList.add(new OrderBill(2,"Asian","Milo","Honeydew",16.00,"22/03/2022"));
			OrderBillList.add(new OrderBill(3,"Vegetarian","Milk","Apple",12.00,"24/03/2022"));


			int option = 0;

			while (option != OPTION_QUIT) {

				C206_CaseStudy.menu();
				option = Helper.readInt("Enter an option > ");

				if (option == OPTION_VIEW) {
					// View all OrderBill
					C206_CaseStudy.viewAllOrderBill(OrderBillList);

				} else if (option == OPTION_ADD ) {
					// Add a new item
					C206_CaseStudy.setHeader("Add Order Bill");	
					OrderBill ob = inputOrderBill();
					C206_CaseStudy.addOrderBill(OrderBillList, ob);

				} else if (option == OPTION_DELETE) {
					C206_CaseStudy.setHeader("Delete Order Bill");			
					C206_CaseStudy.deleteOrderBill(OrderBillList);
				
				} else if (option == OPTION_UPDATE) {
					C206_CaseStudy.setHeader("Update Order Bill");
					C206_CaseStudy.updateOrderBill(OrderBillList); 

				} else if (option == OPTION_QUIT) {
					System.out.println("Bye!");
				} else {
					System.out.println("Invalid option");
				}

			}

		}

		public static void menu() {
			C206_CaseStudy.setHeader("Order Bill for School Lunch Box Online Ordering");
			System.out.println("1. Display Order Bill");
			System.out.println("2. Add Order Bill");
			System.out.println("3. Delete Order Bill");
			System.out.println("4. Update Order Bill");
			System.out.println("5. Quit");
			Helper.line(80, "-");

		}
		
		public static void setHeader(String header) {
			Helper.line(80, "-");
			System.out.println(header);
			Helper.line(80, "-");
		}


		//================================= View (CRUD - View) =================================
		public static String retrieveAllOrderBill(ArrayList<OrderBill> OrderBillList) {
			String output = ""; 
			// write your code here
			for (int i = 0; i < OrderBillList.size(); i++) {

				output += String.format("%-10d %-25s %-20s %-20s %-15.2f %-20s\n",OrderBillList.get(i).getID(),
						OrderBillList.get(i).getFood(),OrderBillList.get(i).getDrink(),OrderBillList.get(i).getFruit(),
						OrderBillList.get(i).getTotalAmount(),OrderBillList.get(i).getdueDate());
			}
			return output;
		}
		public static void viewAllOrderBill(ArrayList<OrderBill> OrderBillList) {
			C206_CaseStudy.setHeader("ORDERBILL LIST");
			String output = String.format("%-10s %-25s %-20s %-20s %-15s %-20s\n", "ID","Food","Drink","Fruit","Total Amount","Due Date");
			 output += retrieveAllOrderBill(OrderBillList);
			System.out.println(output); 
		}

		//=================================Add (CRUD - Add)================================= 
		public static OrderBill inputOrderBill() {
			int ID = Helper.readInt("Enter your Bill ID > ");
			String food = Helper.readString("Enter food > ");
			String drink = Helper.readString("Enter drink > ");
			String fruit = Helper.readString("Enter fruit > ");
			double amount = Helper.readDouble("Enter amount > ");
			String dueDate = Helper.readString("Enter due date > ");
			
			OrderBill ob = new OrderBill(ID, food, drink, fruit, amount, dueDate);
			return ob;
		}
		
		public static void addOrderBill (ArrayList<OrderBill> OrderBillList, OrderBill ob) {
			OrderBillList.add(ob);
			System.out.println("OrderBill added"); 
		} 
		
		//================================= Delete (CURD- Delete) =================================
		public static void deleteOrderBill(ArrayList<OrderBill> OrderBillList) {
			int ID = Helper.readInt("Enter ID to remove > ");
			int pos = -1;
			for (int i = 0; i < OrderBillList.size(); i++) {
				if (ID == OrderBillList.get(i).getID()) {
					pos = i;
				}
			}
			
			String confirmation = Helper.readString("Confirm Delete (Yes/No) >");
			if (confirmation.equalsIgnoreCase("Yes")) {
				OrderBillList.remove(pos);
				System.out.println("Order Bill " + ID + " is deleted.");
			}
			
		}
		
		//================================= Update (CURD- Update) =================================
		public static void updateOrderBill(ArrayList<OrderBill> OrderBillList) {
			int ID = Helper.readInt("Enter Order Bill ID to update > ");
			
			for (int i = 0; i < OrderBillList.size(); i++) {
				if (ID == OrderBillList.get(i).getID()) {
					int update = Helper.readInt("What would you like to update? \n 1. food \n 2. drink \n 3. fruit \n 4. amount \n 5. Due Date \n Please enter number > "); 
					if (update == 1) {
						String uFood = Helper.readString("What food would you like to update to ? > ");
						OrderBillList.get(i).setFood(uFood);
						System.out.println("Bill Order " + ID + " food has been updated to " + uFood);
						break;
					}
					else if (update == 2) {
						String uDrink = Helper.readString("What drink would you like to update to ? > ");
						OrderBillList.get(i).setDrink(uDrink);
						System.out.println("Bill Order " + ID + " drink has been updated to " + uDrink);
						break;
					}
					else if (update == 3) {
						String uFruit = Helper.readString("What fruit would you like to update to ? > ");
						OrderBillList.get(i).setFruit(uFruit);
						System.out.println("Bill Order " + ID + " fruit has been updated to " + uFruit);
						break;
					}
					else if (update == 4) {
						double uAmount = Helper.readDouble("What amount would you like to update to ? > ");
						if (uAmount <= 0) {
							System.out.println("Please enter an amount >= 0");
						} else {
						OrderBillList.get(i).setTotalAmount(uAmount);
						System.out.println("Bill Order " + ID + " amount has been updated to " + uAmount);
						break;
					}
					}
					else if (update == 5) {
						String datePattern = "(0?[1-9]|[12][0-9]|3[01])\\/(0?[1-9]|1[0-2])\\/([0-9]{4})";
						String uDate = Helper.readString("What date would you like to update to (dd/MM/yyyy) ? > ");
						if (uDate.matches(datePattern)) {
							OrderBillList.get(i).setdueDate(uDate);
							System.out.println("Bill Order " + ID + " Due Date has been updated to " + uDate);
						} else {
						System.out.println("Please enter a valid date in this format (dd/MM/yyyy)");
						break;
						}
					} else {
					System.out.println("No Order Bill ID entered is found.");
				}
			}
		}
	}
}


