import java.util.Scanner;
public class Main {
  static int N, A, B, C;
  static int[] l;
  static final int INF = 1100000000;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    A = sc.nextInt();
    B = sc.nextInt();
    C = sc.nextInt();
    l = new int[N];
    for (int i = 0; i < N; i++) {
      l[i] = sc.nextInt();
    }
    System.out.println(dfs(0, 0, 0, 0, 0));
  }
  static int dfs(int i, int sa, int sb, int sc, int cnt) {
    if (i == N) {
      if (sa == 0 || sb == 0 || sc == 0) return INF;
      int ret = 10*cnt - 30;
      ret += Math.abs(A - sa);
      ret += Math.abs(B - sb);
      ret += Math.abs(C - sc);
      return ret;
    }

    int ret = dfs(i + 1, sa, sb, sc, cnt);
    ret = Math.min(ret, dfs(i + 1, sa + l[i], sb, sc, cnt + 1));
    ret = Math.min(ret, dfs(i + 1, sa, sb + l[i], sc, cnt + 1));
    ret = Math.min(ret, dfs(i + 1, sa, sb, sc + l[i], cnt + 1));
    return ret;
  }
}
