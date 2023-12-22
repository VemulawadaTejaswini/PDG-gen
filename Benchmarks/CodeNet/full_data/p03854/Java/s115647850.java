import java.util.*;

public class Main {
  public static void main(String[] args) {    
	Scanner sc = new Scanner(System.in);
  	String s = sc.nextLine();
    String a = s.replace("eraser", "x");
    String b = a.replace("erase", "x");
    String c = b.replace("dreamer", "x");
    String d = c.replace("dream", "x");
    if(d.matches("x{d.length()}")) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}