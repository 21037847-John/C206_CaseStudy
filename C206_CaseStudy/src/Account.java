
public class Account extends Student{

  private String email;
  private String ParentID;
  
  

  public Account(String name, int StudentID, String password, String ParentID,String email) {
    super(name,StudentID,password);
    this.email= email;
    this.ParentID= ParentID;
    
  }
  
  
  public String getEmail() {
    return email;
  }

  public String getParentID() {
    return ParentID;
  }
  
  
  
}


