import java.util.ArrayList;

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
public class userAccMain {
	private static final int OPTION_VIEW_ACC = 2;
	private static final int OPTION_ADD_ACC = 2;
	private static final int OPTION_DEL_ACC = 3;
	private static final int OPTION_QUIT = 5;
	private static final int OPTION_UPDATE_ACC = 4;

	public static void main(String[] args) {
		ArrayList<userAccount> userList = new ArrayList<userAccount>();
		userList.add(new userAccount(21234567, "John"));
		userList.add(new userAccount(21345678, "Swathi"));
		userList.add(new userAccount(21456789, "Vessa"));

		int option = 0;
		while (option != OPTION_QUIT) {
			userAccMain.menu();
			option = Helper.readInt("Enter an option > ");
			if (option == OPTION_VIEW_ACC) {
				userAccMain.viewUserAcc(userList);
			} else if (option == OPTION_ADD_ACC) {
				userAccMain.setHeader("Add User Account");
				addUserAcc(userList);
			} else if (option == OPTION_DEL_ACC) {
				userAccMain.setHeader("Delete User Account");
				delUserAcc(userList);
			} else if (option == OPTION_UPDATE_ACC) {
				userAccMain.setHeader("Update User Account");
				updateUserAcc(userList);
			}
		}
	}

	public static void menu() {
		menuMain.setHeader("userAccMain APP");
		System.out.println("1. View User Account");
		System.out.println("2. Add User Account");
		System.out.println("3. Delete User Account");
		System.out.println("4. Update User Account");
		System.out.println("5. Quit");
		Helper.line(80, "-");

	}

	public static void addUserAcc(ArrayList<userAccount> userList) {
		int ID = Helper.readInt("Enter student ID > ");
		String username = Helper.readString("Enter username > ");

		userList.add(new userAccount(ID, username));

		System.out.println("Added Successfully");

	}

	public static void delUserAcc(ArrayList<userAccount> userList) {
		int ID = Helper.readInt("Enter student ID > ");
		for (int i = 0; i < userList.size(); i++) {
			if (userList.get(i).getStudentId() == ID) {
				String ans = Helper.readString("Are you sure you want to delete " + ID + "'s account?(Yes or No) : ");
				if (ans.equalsIgnoreCase("Yes")) {
					userList.remove(i);
					System.out.println("User account Deleted Successfully");
				} else {
					System.out.println("Think again before deleting.");
				}

			} else {
				System.out.println("Invalid student ID entered.");
			}
		}

	}

	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	public static void viewUserAcc(ArrayList<userAccount> userList) {
		System.out.println("VIEW USER ACCOUNTs");
		String output = String.format("%-10s %-30s\n", "StudentID", "USERNAME");
		output += retrieveAllUser(userList);
		System.out.println(output);

	}

	public static String retrieveAllUser(ArrayList<userAccount> userList) {
		String output = "";

		for (int i = 0; i < userList.size(); i++) {

			output += String.format("%-84s \n", userList.get(i).toString());
		}
		return output;
	}

	public static void updateUserAcc(ArrayList<userAccount> userList) {
		boolean isUpdated = false;
		int ID = Helper.readInt("Enter student ID to update > ");
		String username = Helper.readString("Enter username > ");

		for (int i = 0; i < userList.size(); i++) {
			int studId = userList.get(i).getStudentId();
			if (username != userList.get(i).getUsername()) {
				if (studId == ID) {
					userList.get(i).setUsername(username);

				}
				isUpdated = true;
			}

			else {

				isUpdated = false;
			}

		}

		if (!isUpdated) {
			System.out.println("Update for student ID: " + ID + " failed!");
		}

		else {
			System.out.println("Update for student ID " + ID + " is successful!");
		}

	}
}
