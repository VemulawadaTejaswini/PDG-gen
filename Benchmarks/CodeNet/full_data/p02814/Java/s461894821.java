import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    long M = scanner.nextInt();
    Set<Integer> list = new HashSet<>();
    for (int i = 0; i < N; i++) list.add(scanner.nextInt() / 2);
    List<Integer> a = new ArrayList<>(list);

    long lcm = 1;
    for (int num : a) lcm = lcm(lcm, num);

    for (int num : a) {
      if ((lcm / num) % 2 == 0) {
        System.out.println(0);
        return;
      }
    }

    if (M < lcm) {
      System.out.println(0);
      return;
    }
    System.out.println((M - lcm) / (lcm * 2) + 1);
  }

  private static long lcm(long i, long j) {
    long gcd = gcd(i, j);
    return i / gcd * j;
  }
  
  private static long gcd(long i, long j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      long r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
