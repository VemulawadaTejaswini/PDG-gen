import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] as = new int[n];
    for (int i = 0; i < n; i++) {
      as[i] = sc.nextInt();
    }
    int[] sums = new int[n];

    sums[0] = as[0];
    for (int i = 1; i < n; i++) {
      sums[i] = sums[i - 1] + as[i];
    }
    int count = 0;
    for (int i = 1; i < n; i++) {
      int prev = sums[i - 1];
      int now = sums[i];
      if (prev < 0 && 0 < now || 0 < prev && now < 0) {
        continue;
      }
      int add = -now + (now < 0 ? 1 : -1);
      for (int j = i; j < n; j++) {
        sums[j] += add;
      }
      count += Math.abs(add);
    }
    System.out.println(count);
  }
}
