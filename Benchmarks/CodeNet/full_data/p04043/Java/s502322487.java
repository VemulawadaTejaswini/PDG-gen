import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();

    if (s.equals(t)) {
      System.out.println("same");
    } else {
      String normalizedStrS = s.toLowerCase();
      String normalizedStrT = t.toLowerCase();

      if (normalizedStrS.equals(normalizedStrT)) {
        System.out.println("case-insensitive");
      } else {
        System.out.println("different");
      }
    }
  }
}

