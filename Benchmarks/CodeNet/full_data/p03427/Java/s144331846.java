import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int same = 0;
    for (int i = 0; i < N.length(); i++) {
      int d = N.charAt(i) - '0';
      smae += d;
    }
    int lower = (N.charAt(i) - '0') - 1;
    lower += 9*(N.length()-1);
    System.out.println(Math.max(lower, same));
  }
}