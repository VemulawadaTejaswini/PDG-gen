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
    if ( n == 0 ) {
      throw new IllegalStateException("a.length=0");
    }
    if ( n == 1 ) {
      return (int)Math.abs(a[0]);
    }
    int candidate = maxGcd(a);
    if ( k > 0 ) {
      int n0 = (int)Math.floor(n/2);
      int n1 = n - n0;
      int[] a0 = new int[n0];
      int[] a1 = new int[n1];
      System.arraycopy(a, 0, a0, 0, n0);
      System.arraycopy(a, n0, a1, 0, n1);
      
      //0側のみ
      for( int i0 = 0; i0 < n0; i0++ ) {
        for (int j0 = i0+1; j0 < n0; j0++ ) {
          int[] a00 = new int[n0];
          System.arraycopy(a, 0, a00, 0, n0);
          a00[i0]++;
          a00[j0]--;
          int[] anext = new int[n];
          System.arraycopy(a00, 0, anext, 0, n0);
          System.arraycopy(a1, 0, anext, n0, n1);
          int v = solve(anext, k-1);
          if ( v > candidate ) {
            candidate = v;
          }
          a00[i0] -= 2;
          a00[j0] += 2;
          System.arraycopy(a00, 0, anext, 0, n0);
          v = solve(anext, k-1);
          if ( v > candidate ) {
            candidate = v;
          }
        }
      }
        
      //1側のみ
      for(int i1 = 0; i1 < n1; i1++) {
        for(int j1 = i1+1; j1 < n1; j1++) {
          int[] a10 = new int[n1];
          System.arraycopy(a, n0, a10, 0, n1);
          a10[i1]++;
          a10[j1]--;
          int[] anext = new int[n];
          System.arraycopy(a0, 0, anext, 0, n0);
          System.arraycopy(a10, 0, anext, n0, n1);
          int v = solve(anext, k-1);
          if ( v > candidate ) {
            candidate = v;
          }
          a10[i1] -= 2;
          a10[j1] += 2;
          System.arraycopy(a10, 0, anext, n0, n1);
          v = solve(anext, k-1);
          if ( v > candidate ) {
            candidate = v;
          }
        }
      }
      
      //0,1にまたがる場合
      for(int i = 0; i < n0; i++) {
        for(int j = 0; j < n1; j++) {
          int[] a00 = new int[n0];
          int[] a10 = new int[n1];
          System.arraycopy(a0, 0, a00, 0, n0);
          System.arraycopy(a1, 0, a10, 0, n1);
          a00[i]++;
          a10[j]--;
          int[] anext = new int[n];
          System.arraycopy(a00, 0, anext, 0, n0);
          System.arraycopy(a10, 0, anext, n0, n1);
          int v = solve(anext, k-1);
          if ( v > candidate ) {
            candidate = v;
          }
          a00[i] -= 2;
          a10[j] += 2;
          System.arraycopy(a00, 0, anext, 0, n0);
          System.arraycopy(a10, 0, anext, n0, n1);
          v = solve(anext, k-1);
          if ( v > candidate ) {
            candidate = v;
          }          
        }
      }
    }
    return candidate;
  }    
  
  private static int maxGcd(int[] a) {
	int n = a.length;
    if ( n == 1 ) {
      return (int)Math.abs(a[0]);
    }
    if ( n == 2 ) {
      return maxGcd(a[0], a[1]);
    }
    
    int n0 = (int)(Math.floor(n/2));
    int n1 = n - n0;
    int[] a0 = new int[n0];
    System.arraycopy(a, 0, a0, 0, n0);
    int[] a1 = new int[n1];
    System.arraycopy(a, n0, a1, 0, n1);
    
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