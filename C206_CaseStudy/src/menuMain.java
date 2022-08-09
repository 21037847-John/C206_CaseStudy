import java.util.ArrayList;

/**
 * @author 21041214
 *
 */
public class menuMain {
	
	private static final int OPTION_VIEW = 1;
	private static final int OPTION_ADD = 2;
	private static final int OPTION_DELETE = 3;
	private static final int OPTION_QUIT = 4;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating arraylist to hold menu list
		ArrayList <Western> westernList = new ArrayList<Western>();
		ArrayList<Asian> asianList = new ArrayList<Asian>();
		ArrayList<Vegetarian> vegetarianList = new ArrayList<Vegetarian>();
		
		//pre-adding items inside the respective array lists
		asianList.add(new Asian("1001", "ABC", "Asian", 5.00));
		asianList.add(new Asian("1002", "DEF", "Asian", 5.00));
		asianList.add(new Asian("1003", "GHI", "Asian", 5.00));
		
		westernList.add(new Western("1001", "ABC", "Western", 5.00));
		westernList.add(new Western("1002", "DEF", "Western", 5.00));
		westernList.add(new Western("1003", "GHI", "Western", 5.00));
		
		vegetarianList.add(new Vegetarian("1001", "ABC", "Vegetarian", 5.00));
		vegetarianList.add(new Vegetarian("1002", "DEF", "Vegetarian", 5.00));
		vegetarianList.add(new Vegetarian("1003", "GHI", "Vegetarian", 5.00));
		
		int option = 0;
		
		while(option != OPTION_QUIT) {
			menuMain.menu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == OPTION_VIEW) {
				menuMain.viewAllWestern(westernList);
				menuMain.viewAllAsian(asianList);
				menuMain.viewAllVegetarian(vegetarianList);
			}
			
			else if(option == OPTION_ADD) {
				menuMain.setHeader("ADD MENU");
				TypeMenu();
				int mainMenuOption = Helper.readInt("What do you want to add? (1 - Set Meals OR 2 - Sides (Fruits/Drinks) > ");
				
				if(mainMenuOption == 1) {
					setMealsTypeMenu();
					
				}
				
				if(mainMenuOption == 2) {
					sidesTypeMenu();
					
				}
				
			}
			
			else if (option == OPTION_DELETE) {
				
			}
			
			else if (option == OPTION_QUIT) {
				System.out.println("Bye!");
			}
			
			else {
				System.out.println("Invalid option");
			}
		}
	}
	
	private static void setMealsTypeMenu() {
		menuMain.setHeader("SET MEALS CATEGORIES");
		System.out.println("1. Asian");
		System.out.println("2. Western");
		System.out.println("3. Vegetarian");
	}
	
	private static void sidesTypeMenu() {
		menuMain.setHeader("SIDES CATEGORIES");
		System.out.println("1. Fruits");
		System.out.println("2. Drinks");
	}
	
	private static void TypeMenu() {
		menuMain.setHeader("SIDES CATEGORIES");
		System.out.println("1. Set Meals");
		System.out.println("2. Sides (Fruits/Drinks)");
	}

	public static void menu() {
		menuMain.setHeader("menuMain APP");
		System.out.println("1. View All Record");
		System.out.println("2. Add Record");
		System.out.println("3. Delete Record");
		System.out.println("4. Quit");
		Helper.line(80, "-");

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	// ================================= Option 1 View (CRUD - Read)
	// =================================
	public static String retrieveAllWestern(ArrayList<Western> westernList) {
		String output = "";

		for (int i = 0; i < westernList.size(); i++) {

			output += String.format("%-84s \n", westernList.get(i).toString());
		}
		return output;
	}

	public static void viewAllWestern(ArrayList<Western> westernList) {
		menuMain.setHeader("WESTERN SET MEALS LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ID", "NAME", "PRICE",
				"AVAILABILITY", "CATEGORY");
		output += retrieveAllWestern(westernList);
		System.out.println(output);
	}

	public static String retrieveAllAsian(ArrayList<Asian> asianList) {
		String output = "";
		// write your code here
		for (int i = 0; i < asianList.size(); i++) {
			output += String.format("%-84s \n", asianList.get(i).toString());
		}
		return output;
	}

	public static void viewAllAsian(ArrayList<Asian> asianList) {

		menuMain.setHeader("ASIAN SET MEALS LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ID", "NAME", "PRICE",
				"AVAILABILITY", "CATEGORY");
		output += retrieveAllAsian(asianList);
		System.out.println(output);
	}
	
	public static String retrieveAllVegetarian(ArrayList<Vegetarian> vegetarianList) {
		String output = "";
		// write your code here
		for (int i = 0; i < vegetarianList.size(); i++) {

			output += String.format("%-84s \n", vegetarianList.get(i).toString());
		}
		return output;
	}

	public static void viewAllVegetarian(ArrayList<Vegetarian> vegetarianList) {

		menuMain.setHeader("VEGETARIAN SET MEALS LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ID", "NAME", "PRICE",
				"AVAILABILITY", "CATEGORY");
		output += retrieveAllVegetarian(vegetarianList);
		System.out.println(output);
	}

}
