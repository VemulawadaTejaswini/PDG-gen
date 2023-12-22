import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String w = sc.next();
    boolean[] even = new boolean[26];
    Arrays.fill(even, true);

    for (int i = 0; i < w.length(); i++) {
      char c = w.charAt(i);
      even[c - 'a'] = !even[c - 'a'];
    }

    for (boolean b : even) {
      if (!b) {
        System.out.println("No");
        return;
      }
    }

    System.out.println("Yes");

  }
}