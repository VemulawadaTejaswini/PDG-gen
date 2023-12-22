import java.util.*;

public class Main {
  static int INF = 10000;
  static int N,A,B,C;
  static int[] l;
  
  public static void main(String[] args) {    
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();A = sc.nextInt();
    B = sc.nextInt();C = sc.nextInt();
    l = new int[N];
    for (int i =0; i<N; i++) l[i] = sc.nextInt();
    System.out.println(dfs(0,0,0,0));
  }

  public static long dfs(int cur, int a, int b, int c) {
    int min = INF;
    if (cur == N) {
      if (Math.min(a,Math.min(b, c)) == 0) return Integer.MAX_VALUE;     
      return Math.abs(a - A) + Math.abs(b - B) + Math.abs(c - C) - 30;
    }
    long ret0 = dfs(cur + 1, a, b, c);
    long ret1 = dfs(cur + 1, a + l[cur], b, c) + 10;
    long ret2 = dfs(cur + 1, a, b + l[cur], c) + 10;
    long ret3 = dfs(cur + 1, a, b, c + l[cur]) + 10;
    return Math.min(Math.min(ret0,ret1),Math.min(ret2,ret3));
  }
}