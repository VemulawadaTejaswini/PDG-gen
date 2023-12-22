import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int[] al = new int[26];
    for (int i = 0; i < S.length(); i++) {
      al[S.charAt(i) - 'a']++;
    }
    boolean dif = true;
    for (int i = 0; i < 26; i++) {
      if (al[i] > 1) {
        dif = false;
      }
    }
    if (dif) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}