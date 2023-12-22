import java.util.*;

public class Main {

  static int N;
  static int W;
  static int[] w;
  static int[] v;

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    W = sc.nextInt();
    w = new int[N];
    v = new int[N];

    for (int i = 0; i < N; i++) {
      w[i] = sc.nextInt();
      v[i] = sc.nextInt();
    }

    sc.close();

    System.out.println(dfs(0,W));

  }

  // i番目以降の品物から重さの総和がj以下になるように選ぶ
  public static long dfs(int i, long j){

    long result = 0;

    if (i == N) {
      // 品物は残っていない
      result = 0;
    } else if (j < w[i]) {
      // この品物は入らない
      result = dfs(i + 1, j);
    } else {
      // 品物を入れた場合と入れなかった場合で価値が大きい方を選ぶ
      result = Math.max(dfs(i + 1, j), dfs(i + 1, j - w[i]) + v[i]); 
    }

    return result;

  }

}