import java.io.*;
import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int h = sc.nextInt();
    int[] wields = new int[n];
    int[] bato = new int[n];
    int batoSum = 0;
    int ans = 0;
    int maxWield = 0;
    int batoOfMax = 0;
    for(int i = 0; i < n; i++) {
      wields[i] = sc.nextInt();
      bato[i] = sc.nextInt();
      maxWield = Math.max(maxWield, wields[i]);
      if(maxWield == wields[i]) {
        batoOfMax = Math.max(bato[i], batoOfMax);
      }
    }
    int batos = 0;
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
