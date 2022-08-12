
public class Bill {
  private int bill_id;
  private String meal;
  private String drink;
  private String fruit;
  private double amount;
  
  public Bill(int bill_id, String meal, String drink, String fruit, double amount ) {
    this.bill_id = bill_id;
    this.meal = meal;
    this.drink = drink;
    this.fruit = fruit;
    this.amount = amount;
  }
  public int getBill_id() {
    return bill_id;
  }
  
  public double getAmount() {
    return amount;
  }
  public String getMeal() {
    return meal;
  }

  public String getDrink() {
    return drink;
  }

  public String getFruit() {
    return fruit;
  
  }
}