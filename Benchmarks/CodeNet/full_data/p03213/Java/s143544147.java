import java.util.*;

public class Main {
  public static int N;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    int[] num = new int[101];
    for (int i = 2; i <= N; i++) {
      int tmp = i;
      for (int j = 2; j * j <= tmp; j++) {
        while (tmp % j == 0) {
          num[j]++;
          tmp /= j;
        }
      }
      if (tmp != 1) {
        num[tmp]++;
      }
    }
    int ans = 0;
    // p^74
    ans += count(74, num);
    // p^24 * q^2
    ans += count(24, num) * (count(2, num) - 1);
    // p^14 * q^4
    ans += count(14, num) * (count(4, num) - 1);
    // p^4 * q^4 * r^2
    ans += count(4, num) * (count(4, num) - 1) * (count(2, num) - 2) / 2;
    System.out.println(ans);
  }

  public static int count(int n, int[] a) {
    int count = 0;
    for (int i = 2; i <= N; i++) {
      if (a[i] >= n) {
        count++;
      }
    }
    return count;
  }
}