/**
 * 
 */

/**
 * @author 21041214
 *
 */
public class menu {
	private int ID;
	private String name;
	private double price;
	private boolean isAvailable;

	public menu(int ID, String name, double price) {
		this.ID = ID;
		this.name = name;
		this.price = price;
		this.isAvailable = true;
	}
	
	public String toString() {
		String itemInfo = String.format("%-10d %-30s %-10.2f %-10s", ID,
				name, price, showAvailability(isAvailable));
		return itemInfo;
	}
	
	public String showAvailability(boolean isAvailable) {
		String avail;

		if (isAvailable == true) {
			avail = "Yes";
		} else {
			avail = "No";
		}
		return avail;
	}
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
