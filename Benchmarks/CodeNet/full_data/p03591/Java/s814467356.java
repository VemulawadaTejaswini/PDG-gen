import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner cin = new Scanner(System.in);

    String s = cin.nextLine();
    if (s.length() < 4) {
      System.out.println("No");
    } else if ("YAKI".equals(s.substring(0, 4))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
