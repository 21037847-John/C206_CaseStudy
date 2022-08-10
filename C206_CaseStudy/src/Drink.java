
/**
 * @author 21041214
 *
 */
public class Drink extends menu {
	private String category;
	
	public Drink(String ID, String name, String category, double price) {
		// TODO Auto-generated constructor stub
		super(ID, name, price);
		this.category = category;
	}

	public String getCategory() {
		return category;
	}
	
	public String toString() {
		// Write your codes here
		String output = super.toString();
		output = String.format("%-63s %-20s", output, category);
		return output;
	}

}
