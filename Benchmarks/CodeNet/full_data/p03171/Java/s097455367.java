import java.util.*;
import java.math.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++)
      a[i] = sc.nextInt();
    sc.close();

    long ans = l(a, 0, N - 1);
    System.out.println(ans);
  }

  private static long l(int[] a, int head, int tail) {
    if (head == tail) return a[head];
    return Math.max(
        a[head] - l(a, head + 1, tail),
        a[tail] - l(a, head, tail - 1));
  }
}