/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * Vanessa_Quan, 10 August 2022 7:35:24
 */
public class OrderBill {
  private int ID;
  private String food;
  private String drink;
  private String fruit;
  private double Totalamount;
  private String dueDate;
  
  
  public OrderBill(int ID, String food, String drink, String fruit, double Totalamount,String dueDate) {
    this.ID = ID;
    this.food = food;
    this.drink = drink;
    this.fruit = fruit;
    this.Totalamount = Totalamount;
    this.dueDate = dueDate;
  }
  public int getID() {
    return ID;
  }
  public void setID(int ID) {
	  this.ID = ID;
  }
  public String getFood() {
	  return food;
  }
  public String getDrink() {
	  return drink;
  }
  public String getFruit() {
	  return fruit;
  }
  public double getTotalAmount() {
	  return Totalamount;
  }
  public String getdueDate() {
	  return dueDate;
	}
  public void setFood(String food) {
	  this.food = food;
  }
  public void setDrink(String drink) {
	  this.drink = drink;
  }
  public void setFruit(String fruit) {
	  this.fruit = fruit;
  }
  public void setTotalAmount(double Totalamount) {
	  this.Totalamount = Totalamount;
  }
  public void setdueDate(String dueDate) {
	  this.dueDate = dueDate;
  }
}