import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    if (s.matches("^A?KIHA?BA?RA?$")) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }

}
