import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String A = "Sunny";
    String B = "Cloudy";
    String C = "Rainy";
    if (S.equals(A)) {
      System.out.println(B);
    } else if (S.equals(B)) {
      System.out.println(C);
    } else {
      System.out.println(A);
    }
  }
}
