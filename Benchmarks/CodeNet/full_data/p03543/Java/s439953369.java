import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    String[] b = String.valueOf(a).split("");
    
    String a1 = b[0];
    String a2 = b[1];
    String a3 = b[2];
    String a4 = b[3];
    
    if (a1.equals(a2) && a2.equals(a3)) {
      System.out.println("Yes");
    } else if (a2.equals(a3) && a3.equals(a4)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}