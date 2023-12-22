import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();
    Set<Integer> nums = new HashSet<>();
    for (int i = 0; i < N; i++) nums.add(scanner.nextInt() / 2);
    List<Integer> list = new ArrayList<>(nums);
    Collections.sort(list);

    int gcd = 1;
    for (Integer i : list) {
      if (i % 2 == 0) {
        System.out.println(0);
        return;
      }
      gcd = gcd(gcd, i);
    }

    long lcm = gcd;
    for (Integer i : list) {
      lcm = lcm * (i / gcd);
    }
    if (M < lcm) {
      System.out.println(0);
      return;
    }
    System.out.println((M - lcm) / (lcm * 2) + 1);
  }

  static int gcd(int i, int j) {
    if (i > j) return gcd(j, i);
    while (i > 0) {
      int r = j % i;
      j = i;
      i = r;
    }
    return j;
  }
}
