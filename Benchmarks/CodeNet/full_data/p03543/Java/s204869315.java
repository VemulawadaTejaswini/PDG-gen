import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    char[] c = s.toCharArray();
    int count = 0;

    if (c[0] == c[1]) {
      count++;
      if (c[1] == c[2]) {
        count++;
        if (c[2] == c[3]) {
          count++;
        }
      }
    }

    if (count >= 2) {
      System.out.println("Yes");
      return;
    }

    System.out.println("No");
  }

}
