import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    int w = sc.nextInt();
    for (int i = 0; i < S.length(); i++) {
      if (i % w == 0) {
        System.out.print(S.charAt(i));
      }
    }
    System.out.println();
  }
}