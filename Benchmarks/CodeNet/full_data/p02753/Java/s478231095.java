import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    if (s.indexOf('A') >= 0 && s.indexOf('B') >= 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}