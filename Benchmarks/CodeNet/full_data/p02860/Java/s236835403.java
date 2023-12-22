import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n % 2 != 0)
      System.out.println("No");
    else {
      String s = sc.next();
      System.out.println(s.substring(0, s.length() / 2).equals(s.substring(s.length() / 2, s.length())) ? "Yes" : "No");
    }
  }
}