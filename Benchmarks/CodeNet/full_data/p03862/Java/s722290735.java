import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long x = sc.nextLong();
    long[] a = new long[N];
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextLong();
    }
    long count = 0;
    for(int i = 0; i < N - 1; i++) {
      if(a[i] > x) {
        count += (a[i] + a[i + 1] - x);
        a[i + 1] = 0;
      } else {
        count += Math.max(a[i] + a[i + 1] - x, 0);
        a[i + 1] -= count;
      }
    }
    System.out.println(count);
  }
}