import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long z = sc.nextLong();
    long w = sc.nextLong();
    long[] a = new long[n];
    for(int i = 0; i < n; i++) {
      a[i] = sc.nextLong();
    }
    long ans1 = Math.abs(a[n - 1] - w);
    long[] dp1 = new long[n];
    long[] dp2 = new long[n];
    for(int i = n - 1; i >= 0; i--) {
      long aite = w;
      if(i > 0) aite = a[i - 1]; 
      // dp1の更新
      long temp1 = Math.abs(aite - a[n - 1]);
      for(int j = i; j < n; j++) {
        if(j < n - 1) temp1 = Math.max(temp1, dp2[j + 1]);
      }
      dp1[i] = temp1;
 
      aite = z;
      if(i > 0) aite = a[i - 1];
      // dp2の更新
      long temp2 = Math.abs(aite - a[n - 1]);
      for(int j = i; j < n; j++) {
        if(j < n - 1) temp2 = Math.min(temp2, dp1[j + 1]);
      }
      dp2[i] = temp2;
      
    }
    long ans = Math.max(ans1, dp1[0]);
    System.out.println(ans);
  }
}