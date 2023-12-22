import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    long c = sc.nextInt();
    if ((Math.sqrt(a) + Math.sqrt(b)) < Math.sqrt(c)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}