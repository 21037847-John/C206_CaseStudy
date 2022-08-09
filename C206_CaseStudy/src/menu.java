/**
 * 
 */

/**
 * @author 21041214
 *
 */
public class menu {
	public String ID;
	public String name;
	public String category;
	public double price;
	public boolean isAvailable;

	public menu(String ID, String name, String category, double price) {
		this.ID = ID;
		this.name = name;
		this.category = category;
		this.price = price;
		this.isAvailable = true;
	}
	
	public String toString() {
		String itemInfo = String.format("%-10s %-30s %-10s %-10.2f %-10s", ID,
				name, category, price, showAvailability(isAvailable));
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
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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