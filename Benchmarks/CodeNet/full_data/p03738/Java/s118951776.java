import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();

    if (a.length() > b.length()) {
      System.out.println("GREATER");
      return;
    } else if (a.length() < b.length()) {
      System.out.println("LESS");
      return;
    } else {
      int len = a.length();
      for (int i = 0; i < len; i++) {
        if (a.charAt(i) > b.charAt(i)) {
          System.out.println("GREATER");
          return;
        } else if (a.charAt(i) < b.charAt(i)) {
          System.out.println("LESS");
          return;
        }
      }
    }

    System.out.println("EQUAL");

  }
}