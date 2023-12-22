import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    
    if(a == "D"){
      if(b.equals("H")) b = "D";
      else b = "H";
    }
    System.out.println(b);
  }
}
