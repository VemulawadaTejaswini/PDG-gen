import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      long n = sc.nextLong();
      long ans = 0;

      ans += n / 500 * 1000;
      n %= 500;

      ans += n / 5 * 5;
      System.out.println(ans);
    } finally {
      sc.close();
    }
  }
}
