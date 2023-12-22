import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[M];
    int[] B = new int[M];
    for (int i = 0; i < M; i++) {
      // 0 origin
      A[i] = sc.nextInt()-1;
      B[i] = sc.nextInt()-1;
    }
    
    // union-find
    int[] par = new int[N];
    for (int i = 0; i < N; i++) {
      par[i] = i;
    }
    int[] size = new int[N];
    Arrays.fill(size, 1);
    
    long[] ans = new long[M];
    ans[M-1] = (long) N*(N-1)/2;
    for (int i = M-2; i >= 0; i--) {
      if (root(par, A[i+1]) == root(par, B[i+1])) {
        ans[i] = ans[i+1];
      } else {
        ans[i] = ans[i+1] - (long)size[root(par,A[i+1])]*size[root(par,B[i+1])];
        unite(par, size, A[i+1], B[i+1]);
      }
    }

    for (int i = 0; i < M; i++) {
      System.out.println(ans[i]);
    }
  }
  
  private static int root(int[] par, int x) {
    if (par[x] == x) {
      return x;
    }
    par[x] = root(par, par[x]);
    return par[x];
  }
  
  private static void unite(int[] par, int[] size, int x, int y) {
    x = root(par, x);
    y = root(par, y);
    if (x == y) {
      return;
    }
    par[x] = y;
    size[y] += size[x];
  }
}