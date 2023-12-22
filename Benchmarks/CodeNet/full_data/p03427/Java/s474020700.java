import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int lower = 0;
    int same = 0;
    for (int i = 0; i < N.length(); i++) {
      int d = N.charAt(i) - '0';
      lower += Math.max(lower+9, same + Math.max(0, d-1));
      same += d;
    }
    System.out.println(Math.max(lower, same));
  }
}