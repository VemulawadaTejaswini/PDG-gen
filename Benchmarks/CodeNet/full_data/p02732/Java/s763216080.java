import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    long[] c = new long[n+1];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
      c[a[i]]++;
    }

    long sum = 0;

    for (int i = 0; i < n+1; i++) {
      sum += res(c[i]);
    }

    for (int i = 0; i < n; i++) {
      System.out.println(sum-(c[a[i]]-1));
    }

  }

  public static long res (long c) {
    long ans = c*(c-1)/2;
    return ans;
  }

}
