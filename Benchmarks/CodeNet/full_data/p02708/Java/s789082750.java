import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    sc.close();
    long res = 0;
    for (int i = k; i <= n + 1; i++) {
      long min = 0;
      long max = 0;
      for (int p = 0; p < i; p++) {
        min += p;
        max += n - p;
      }
      res += max - min + 1;
    }
    res %= Math.pow(10, 9) + 7;
    System.out.println(res);
  }
}