import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int len = sc.nextInt();
    String s = sc.next();
    if (len % 2 != 0) {
      System.out.println("No");
      return;
    }
    for (int i = 0, j = len/2; j < len; i++, j++) {
      if (s.charAt(i) != s.charAt(j)) {
        System.out.println("No");
        return;
      }
    }
    System.out.println("Yes");
  }
}
