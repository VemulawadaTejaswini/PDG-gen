import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    char[] c = new char[123];

    for (int i = 0; i < s.length(); i++) {
      int k = (int)s.charAt(i);
      c[k]++;
    }

    for (int i = 97; i < 123; i++) {
      if (c[i]%2 != 0) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");

  }

}
