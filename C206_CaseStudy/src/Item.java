
public class Item {
  
  private int itemID;
  private String category;
  private String name;
  private String description;
  private double price;
  
  public Item (int itemID, String category, String name, String description, double price) { // Constructor that will be used in the main class to create 
    // objects like Western item, Asian item, Veggie item, drink1, drink2, drink3, fruit1, fruit2, fruit3
    this.itemID = itemID;
    this.category = category;
    this.name = name;
    this.description = description;
    this.price = price;
  }
  
  public int get_itemID() {
    return itemID;
  }
  
  public String get_Category() {
    return category;
  }
  
  public String get_Name() {
    return name;
  }
  
  public String get_Description() {
    return description;
  }
  
  public double get_Price() {
    return price;
  }
  
  public void set_itemID(int itemID) {
    this.itemID = itemID;
  }
  
  public void set_Category(String category) {
    this.category = category;
  }
  
  public void set_Name(String name) {
    this.name = name;
  }
  
  public void set_Description(String description) {
    this.description = description;
  }
  
  public void set_Price() {
    this.price = price;
  }
  
}


