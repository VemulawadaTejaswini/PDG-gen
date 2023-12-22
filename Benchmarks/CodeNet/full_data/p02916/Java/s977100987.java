import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n+1];
    int[] b = new int[n+1];
    int[] c = new int[n];
    for (int i = 1; i <= n; i++) {
      int num = sc.nextInt();
      a[i] = num;
    }
    for (int i = 1; i <= n; i++) {
      int num = sc.nextInt();
      b[i] = num;
    }
    for (int i = 1; i < n; i++) {
      int num = sc.nextInt();
      c[i] = num;
    }
    int total = 0;
    int prev = -1;
    for (int i = 1; i <= n; i++) {
      total += b[a[i]];
      if (a[i] - 1 == prev && prev < n) {
        System.out.println(a[prev]);
        total += c[prev];
      }
      prev = a[i];
    }
    System.out.println(total);
  }
}