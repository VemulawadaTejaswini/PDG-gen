import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    String n = sc.next();
    int ans = 9 * (n.length() - 1) + Character.getNumericValue(n.charAt(0)) - 1;

    System.out.println(ans);
  }
}
