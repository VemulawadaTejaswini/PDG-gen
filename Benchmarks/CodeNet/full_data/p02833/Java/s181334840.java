import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();

    long calc = fn(n, 1);
    List<String> list = Arrays.asList(String.valueOf(calc).split(""));
    Collections.reverse(list);

    long ans = 0;
    for (String s : list) {
      if (!s.equals("0")) break;
      ans++;
    }
    System.out.println(ans);
  }

  private static long fn(long n, long sum) {
    if (n <= 0) return sum;
    return fn(n - 2, sum * n);
  }
}