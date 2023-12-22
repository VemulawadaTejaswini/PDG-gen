import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();

    if (a <= k) {
      System.out.print(0);
      System.out.print(" ");
      System.out.println(b-(k-a));
    } else {
      System.out.print(a-k);
      System.out.print(" ");
      System.out.println(b);
    }
  }
}
