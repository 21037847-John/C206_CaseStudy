
public class Student {

  private String name;
  private int StudentID;
  private String password;

  public Student(String name, int StudentID, String password) {
    this.name = name;
    this.StudentID = StudentID;
    this.password=password;
  }

  public String getName() {
    return name;
  }
  
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getStudentID() {
    return StudentID;
  }
}


