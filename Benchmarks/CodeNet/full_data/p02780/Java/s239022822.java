import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double[] e = new double[1001];
    for(int i = 1; i <= 1000; i++) {
      double sum = 0;
      for(int j = 1; j <= i; j++) {
        sum += ((double)j / (double)i);
      }
      e[i] = sum;
    }
    int n = sc.nextInt();
    int k = sc.nextInt();
    double[] rui = new double[n + 1];
    for(int i = 1; i <= n; i++) {
      int p = sc.nextInt();
      rui[i] = rui[i - 1] + e[p]; 
    }
    double ans = 0;
    for(int i = k; i <= n; i++) {
      ans = Math.max(ans, rui[i] - rui[i - k]);
    }
    System.out.println(ans);
  }
}