import java.util.*;

public class Main {
  public static void main(String[] args) {
    int N, K;
    int[] A;
    try(Scanner sc = new Scanner(System.in)) {
      N = sc.nextInt();
      K = sc.nextInt();
      A = new int[N];
      for(int i = 0; i < N; i++) {
        A[i] = sc.nextInt();
      }
    }
    int answer = solve(A, K);
    System.out.println(answer);
  }
  
  private static int solve(int[] a, int k) {
    int n = a.length;
    if ( n == 1 ) {
      return (int)Math.abs(a[0]);
    }
    
    int candidate = maxGcd(a);
    
    if ( k > 0 ) {
      //a[0] は何も変えない場合
      int[] a0 = new int[n-1];
      System.arraycopy(a, 1, a0, 0, n-1);
      int v0 = maxGcd(a[0], solve(a0, k));
      if ( v0 > candidate ) {
        candidate = v0;
      }
      //a[0] に 1を足す場合
      for(int j = 1; j < n; j++) {
        int[] a1 = new int[n];
        System.arraycopy(a, 0, a1, 0, n);
        a1[0]++;
        a1[j]--;
        int v1 = solve(a1, k-1);
        if ( v1 > candidate ) {
          candidate = v1;
        }
      }
      //a[0] に -1 を足す場合
      for(int j = 1; j < n; j++) {
        int[] a2 = new int[n];
        System.arraycopy(a, 0, a2, 0, n);
        a2[0]--;
        a2[j]++;
        int v2 = solve(a2, k-1);
        if ( v2 > candidate ) {
          candidate = v2;
        }
      }
    }
	return candidate;
  }    
  
  private static int maxGcd(int[] a) {
	int n = a.length;
    if ( n == 1 ) {
      return a[0];
    }
    if ( n == 2 ) {
      return maxGcd(a[0], a[1]);
    }
    int n0 = (int)(Math.floor(n/2));
    int n1 = n - n0;
    int[] a0 = new int[n0];
    for(int i = 0; i < n0; i++) {
      a0[i] = a[i];
    }
    int[] a1 = new int[n1];
    for(int i = 0; i < n1; i++ ) {
      a1[i] = a[n0+i];
    }
    if ( n0 > 0 ) {
      int v1 = maxGcd(a0);
      if ( n1 > 0 ) {
        int v2 = maxGcd(a1);
        return maxGcd(v1, v2);
      }
      return v1;
    }
    else {
      return maxGcd(a1);
    }
  }
  
  private static int maxGcd(int a, int b) {
    int aa = (int)Math.abs(a);
    int bb = (int)Math.abs(b);
    if ( aa == 0 ) {
      return bb;
    }
    if ( bb == 0 ) {
      return aa;
    }    
    int x = Math.max(aa, bb);
    int y = Math.min(aa, bb);
    //ユークリッドの互除法
    int tmp;
    while ((tmp = x % y) != 0) {
      x = y;
      y = tmp;
    }
    return y;
  }

}