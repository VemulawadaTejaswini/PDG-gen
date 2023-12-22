import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long h = sc.nextInt();
    long[] wields = new long[n];
    long[] bato = new long[n];
    long batoSum = 0;
    long ans = 0;
    long maxWield = 0;
    long batoOfMax = 0;
    for(int i = 0; i < n; i++) {
      wields[i] = sc.nextLong();
      bato[i] = sc.nextLong();
      maxWield = Math.max(maxWield, wields[i]);
      if(maxWield == wields[i]) {
        batoOfMax = Math.max(bato[i], batoOfMax);
      }
    }
    long batos = 0;
    for(int i = 0; i < n; i++) {
      if(bato[i] > maxWield) {
        batoSum += bato[i];
        batos++;
      }
    }
    ans += Math.ceil(((h-batoSum)/(double)maxWield));
    ans += batos;
    System.out.println(ans);
  }
}
