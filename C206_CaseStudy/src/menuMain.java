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
		ArrayList <Asian> asianList = new ArrayList<Asian>();
		ArrayList <Vegetarian> vegetarianList = new ArrayList<Vegetarian>();
		ArrayList <Fruit> fruitList = new ArrayList<Fruit>();
		ArrayList <Drink> drinkList = new ArrayList<Drink>();
		
		//pre-adding items inside the respective array lists
		asianList.add(new Asian(1001, "ABC", "Asian", 5.00));
		asianList.add(new Asian(1002, "DEF", "Asian", 5.00));
		asianList.add(new Asian(1003, "GHI", "Asian", 5.00));
		
		westernList.add(new Western(1001, "ABC", "Western", 5.00));
		westernList.add(new Western(1002, "DEF", "Western", 5.00));
		westernList.add(new Western(1003, "GHI", "Western", 5.00));
		
		vegetarianList.add(new Vegetarian(1001, "ABC", "Vegetarian", 5.00));
		vegetarianList.add(new Vegetarian(1002, "DEF", "Vegetarian", 5.00));
		vegetarianList.add(new Vegetarian(1003, "GHI", "Vegetarian", 5.00));
		
		fruitList.add(new Fruit(1001, "ABC", "Fruit", 2.50));
		fruitList.add(new Fruit(1002, "DEF", "Fruit", 2.50));
		fruitList.add(new Fruit(1003, "GHI", "Fruit", 2.50));
		
		drinkList.add(new Drink(1001, "ABC", "Drink", 2.50));
		drinkList.add(new Drink(1002, "DEF", "Drink", 2.50));
		drinkList.add(new Drink(1003, "GHI", "Drink", 2.50));
		
		
		int option = 0;
		
		while(option != OPTION_QUIT) {
			menuMain.menu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == OPTION_VIEW) {
				menuMain.viewAllWestern(westernList);
				menuMain.viewAllAsian(asianList);
				menuMain.viewAllVegetarian(vegetarianList);
				menuMain.viewAllFruits(fruitList);
				menuMain.viewAllDrinks(drinkList);
			}
			
			else if(option == OPTION_ADD) {
				menuMain.setHeader("ADD MENU");
				TypeMenu();
				int mainMenuOption = Helper.readInt("What do you want to add? (1 - Set Meals OR 2 - Fruits/Drinks) > ");
				
				if(mainMenuOption == 1) {
					menuMain.setHeader("ADDING SET MEAL INTO MENU");
					setMealsTypeMenu();
					int setMealsOption = Helper.readInt("Pick an option (1 OR 2 OR 3) > ");
					
					//adding the respective set meals by category
					if(setMealsOption == 1) {
						Asian addAsianFood = inputAsian();
						menuMain.addAsian(asianList, addAsianFood);
						System.out.println("Asian set meal has been added!");
					}
					
					else if(setMealsOption == 2) {
						Western addWesternFood = inputWestern();
						menuMain.addWestern(westernList, addWesternFood);
						System.out.println("Western set meal has been added!");
					}
					
					else if(setMealsOption == 3) {
						Vegetarian addVegetarianFood = inputVegetarian();
						menuMain.addVegetarian(vegetarianList, addVegetarianFood);
						System.out.println("Vegetarian set meal has been added!");
					}
					
					else {
						System.out.println("You have entered an invalid Set Meal Option! You can only enter '1' OR '2' OR '3' as the options");
					}
					
				}
				
				else if(mainMenuOption == 2) {
					menuMain.setHeader("ADDING SIDES INTO MENU");
					sidesTypeMenu();
					int sidesOption = Helper.readInt("Pick an option (1 OR 2) > ");
					
					if(sidesOption == 1) {
						Fruit addFruit = inputFruit();
						menuMain.addFruit(fruitList, addFruit);
						System.out.println("Fruit has been added!");
					}
					
					else if (sidesOption == 2) {
						Drink addDrink = inputDrink();
						menuMain.addDrink(drinkList, addDrink);
						System.out.println("Drink has been added!");
					}
					
					else {
						System.out.println("You have entered an invalid Sides Option! You can only enter '1' OR '2' as the options");
					}
				}
				

				else {
					System.out.println("You have entered an invalid option! Please try again!");
				}
				
			}
			
			else if (option == OPTION_DELETE) {
				TypeMenu();
				int mainMenuOption = Helper.readInt("What do you want to add? (1 - Set Meals OR 2 - Fruits/Drinks) > ");
				if(mainMenuOption == 1) {
					setMealsTypeMenu();
					int setMealsOption = Helper.readInt("Pick an option (1 OR 2 OR 3) > ");
					
					if(setMealsOption == 1) {
						deleteAsian(asianList);
					}
					
					else if(setMealsOption == 2) {
						deleteWestern(westernList);
					}
					
					else if(setMealsOption == 3) {
						deleteVegetarian(vegetarianList);
					}
					
					else {
						System.out.println("Removing failed! You can ONLY enter '1' OR '2' OR '3' as the option");
					}
					
				}
				
				else if(mainMenuOption == 2) {
					sidesTypeMenu();
					int sidesOption = Helper.readInt("Pick an option (1 OR 2) > ");
					
					if(sidesOption == 1) {
						deleteFruit(fruitList);
					}
					
					else if(sidesOption == 2) {
						deleteDrink(drinkList);
					}
					
					else {
						System.out.println("Removing failed! You can ONLY enter '1' OR '2' as the option");
					}
				}
				
				else {
					System.out.println("Invalid option entered");
				}
				
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
		menuMain.setHeader("MENU CATEGORIES");
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
	
	public static String retrieveAllFruits(ArrayList<Fruit> fruitList) {
		String output = "";

		for (int i = 0; i < fruitList.size(); i++) {

			output += String.format("%-84s \n", fruitList.get(i).toString());
		}
		return output;
	}

	public static void viewAllFruits(ArrayList<Fruit> fruitList) {
		menuMain.setHeader("FRUITS LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ID", "NAME", "PRICE",
				"AVAILABILITY", "CATEGORY");
		output += retrieveAllFruits(fruitList);
		System.out.println(output);
	}
	
	public static String retrieveAllDrinks(ArrayList<Drink> drinkList) {
		String output = "";

		for (int i = 0; i < drinkList.size(); i++) {

			output += String.format("%-84s \n", drinkList.get(i).toString());
		}
		return output;
	}

	public static void viewAllDrinks(ArrayList<Drink> drinkList) {
		menuMain.setHeader("DRINKS LIST");
		String output = String.format("%-10s %-30s %-10s %-10s %-20s\n", "ID", "NAME", "PRICE",
				"AVAILABILITY", "CATEGORY");
		output += retrieveAllDrinks(drinkList);
		System.out.println(output);
	}
	
	// ================================= Option 2 Add (CRUD -
		// Create)=================================
		public static Western inputWestern() {
			int ID = Helper.readInt("Enter ID > ");
			String name = Helper.readString("Enter name > ");
			String category = Helper.readString("Enter category > ");
			double price = Helper.readDouble("Enter price > ");

			Western westernFood = new Western(ID, name, category, price);
			return westernFood;

		}

		public static void addWestern(ArrayList<Western> westernList, Western westernFood) {

			westernList.add(westernFood);

		}

		public static Asian inputAsian() {
			int ID = Helper.readInt("Enter ID > ");
			String name = Helper.readString("Enter name > ");
			String category = Helper.readString("Enter category > ");
			double price = Helper.readDouble("Enter price > ");

			Asian asianFood = new Asian(ID, name, category, price);
			return asianFood;

		}

		public static void addAsian(ArrayList<Asian> asianList, Asian asianFood) {

			asianList.add(asianFood);

		}
		
		public static Vegetarian inputVegetarian() {
			int ID = Helper.readInt("Enter ID > ");
			String name = Helper.readString("Enter name > ");
			String category = Helper.readString("Enter category > ");
			double price = Helper.readDouble("Enter price > ");

			Vegetarian vegetarianFood = new Vegetarian(ID, name, category, price);
			return vegetarianFood;

		}

		public static void addVegetarian(ArrayList<Vegetarian> vegetarianList, Vegetarian vegetarianFood) {

			vegetarianList.add(vegetarianFood);

		}
		
		public static Fruit inputFruit() {
			int ID = Helper.readInt("Enter ID > ");
			String name = Helper.readString("Enter name > ");
			String category = Helper.readString("Enter category > ");
			double price = Helper.readDouble("Enter price > ");

			Fruit fruit = new Fruit(ID, name, category, price);
			return fruit;

		}

		public static void addFruit(ArrayList<Fruit> fruitList, Fruit fruit) {

			fruitList.add(fruit);

		}
		
		public static Drink inputDrink() {
			int ID = Helper.readInt("Enter ID > ");
			String name = Helper.readString("Enter name > ");
			String category = Helper.readString("Enter category > ");
			double price = Helper.readDouble("Enter price > ");

			Drink drink = new Drink(ID, name, category, price);
			return drink;

		}

		public static void addDrink(ArrayList<Drink> drinkList, Drink drink) {

			drinkList.add(drink);

		}
		
		// ================================= Option 3 Remove (CRUD -
				// Delete)=================================
		public static void deleteWestern(ArrayList<Western> westernList) {
			boolean isDeleted = false;
			int ID = Helper.readInt("Enter ID to remove > ");
			for(int i = 0; i < westernList.size(); i++) {
				int foodID = westernList.get(i).getID();
				if(ID == foodID) {
					westernList.remove(i);
					isDeleted = true;
				}
			}
			if(isDeleted == true) {
				System.out.println("Western food ID : " + ID + " removed!");
			}
			
			else {
				System.out.println("Removing of food item failed!");
			}	
		}
		
		public static void deleteAsian(ArrayList<Asian> asianList) {
			boolean isDeleted = false;
			int ID = Helper.readInt("Enter ID to remove > ");
			for(int i = 0; i < asianList.size(); i++) {
				int foodID = asianList.get(i).getID();
				if(ID == foodID) {
					asianList.remove(i);
					isDeleted = true;
				}
			}
			if(isDeleted == true) {
				System.out.println("Asian food ID : " + ID + " removed!");
			}
			
			else {
				System.out.println("Removing of food item failed!");
			}	
		}
		
		public static void deleteVegetarian(ArrayList<Vegetarian> vegetarianList) {
			boolean isDeleted = false;
			int ID = Helper.readInt("Enter ID to remove > ");
			for(int i = 0; i < vegetarianList.size(); i++) {
				int foodID = vegetarianList.get(i).getID();
				if(ID == foodID) {
					vegetarianList.remove(i);
					isDeleted = true;
				}
			}
			if(isDeleted == true) {
				System.out.println("Vegetarian food ID : " + ID + " removed!");
			}
			
			else {
				System.out.println("Removing of food item failed!");
			}	
		}
		
		public static void deleteFruit(ArrayList<Fruit> fruitList) {
			boolean isDeleted = false;
			int ID = Helper.readInt("Enter ID to remove > ");
			for(int i = 0; i < fruitList.size(); i++) {
				int foodID = fruitList.get(i).getID();
				if(ID == foodID) {
					fruitList.remove(i);
					isDeleted = true;
				}
			}
			if(isDeleted == true) {
				System.out.println("Fruit ID : " + ID + " removed!");
			}
			
			else {
				System.out.println("Removing of food item failed!");
			}	
		}
		
		public static void deleteDrink(ArrayList<Drink> drinkList) {
			boolean isDeleted = false;
			int ID = Helper.readInt("Enter ID to remove > ");
			for(int i = 0; i < drinkList.size(); i++) {
				int foodID = drinkList.get(i).getID();
				if(ID == foodID) {
					drinkList.remove(i);
					isDeleted = true;
				}
			}
			if(isDeleted == true) {
				System.out.println("Drink ID : " + ID + " removed!");
			}
			
			else {
				System.out.println("Removing of food item failed!");
			}	
		}
		
		


}
