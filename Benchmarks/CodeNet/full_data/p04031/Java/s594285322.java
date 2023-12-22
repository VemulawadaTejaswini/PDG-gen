import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    int ans = 1000000000;
    for(int i = -100; i <= 100; i++) {
      int t = 0;
      for(int j = 0; j < n; j++) {
        t += ((i - a[j]) * (i - a[j]));
      }
    }
    System.out.println(ans);
  }
}