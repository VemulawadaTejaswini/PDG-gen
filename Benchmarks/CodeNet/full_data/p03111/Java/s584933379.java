import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int[] l = new int[N];
    for (int i = 0; i < N; i++) {
      l[i] = sc.nextInt();
    }
    
    int ans = dfs(0, l, 0, 0, 0, 0, A, B, C);

    System.out.println(ans);
  }
  
  private static int dfs(int n, int[] l, int mp,
                         int a, int b, int c,
                        int A, int B, int C) {
    if (n == l.length) {
      if (a == 0 || b == 0 || c == 0) {
        return Integer.MAX_VALUE;
      }
      return mp-30 + Math.abs(A-a) + Math.abs(B-b) + Math.abs(C-c);
    }
    int forA = dfs(n+1, l, mp+10, a+l[n], b, c, A, B, C);
    int forB = dfs(n+1, l, mp+10, a, b+l[n], c, A, B, C);
    int forC = dfs(n+1, l, mp+10, a, b, c+l[n], A, B, C);
    int nouse= dfs(n+1, l, mp, a, b, c, A, B, C);
    return Math.min(Math.min(forA, forB), Math.min(forC, nouse));
  }
}