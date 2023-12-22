import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] a = new int[n][20];
    for(int i = 0; i < n; i++) {
      int A = sc.nextInt();
      for(int j = 0; j < 20; j++) {
        a[i][j] = (A % 2);
        A /= 2;
      }
    }
    long ans = 0;
    int right = 0;
    int[] b = new int[20];
    for(int i = 0; i < n; i++) {
      if(i > right) {
        right = i;
      }
      while(right < n) {
        int p = 0;
        for(int j = 0; j < 20; j++) {
          if((b[j] + a[right][j]) > 1) {
            p++;
            for(int k = 0; k < (j - 1); k++) {
              b[k] -= a[right][k];
            }
            break;
          }
          b[j] += a[right][j];
        }
        if(p > 0) break;
        right++;  
      }
      ans += (right - i);
      for(int j = 0; j < 20; j++) { 
        b[j] -= a[right][j];
      }
    }
    System.out.println(ans);
  }
}