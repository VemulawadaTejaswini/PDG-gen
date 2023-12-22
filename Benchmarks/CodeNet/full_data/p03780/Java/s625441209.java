import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] a = new int[N];
    for(int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
    }

    // dp1[i][j]はカード0～iで総和をjに出来るかを表す
    int[][] dp1 = new int[N][K];
    dp1[0][0] = 1;
    if(a[0] < K) dp1[0][a[0]] = 1;
    for(int i = 1; i < N; i++) {
      for(int j = 0; j < K; j++) {
        if(a[i] <= j) {
          if((dp1[i - 1][j] == 1) || (dp1[i - 1][j - a[i]] == 1)) dp1[i][j] = 1;
        } else {
          dp1[i][j] = dp1[i - 1][j];
        }
      }
    }

    // dp2[i][j]はカードi～N-1で総和をjに出来るかを表す
    int[][] dp2 = new int[N][K];
    dp2[N - 1][0] = 1;
    if(a[N - 1] < K) dp2[N - 1][a[N - 1]] = 1;
    for(int i = N - 2; i >= 0; i--) {
      for(int j = 0; j < K; j++) {
        if(a[i] <= j) {
          if((dp2[i + 1][j] == 1) || (dp2[i + 1][j - a[i]] == 1)) dp2[i][j] = 1;
        } else {
          dp2[i][j] = dp2[i + 1][j];
        }
      }
    }

    // dps1[i][j]はカード0～iまでで総和0～jの内、何個達成出来るかを表す
    int[][] dps1 = new int[N][K];
    for(int i = 0; i < N; i++) {
      dps1[i][0] = 1;
      for(int j = 1; j < K; j++) {
        dps1[i][j] = dps1[i][j - 1];
        if(dp1[i][j] == 1) dps1[i][j]++;
      }
    }

    // dps1[i][j]はカードi～N-1までで総和0～jの内、何個達成出来るかを表す
    int[][] dps2 = new int[N][K];
    for(int i = 0; i < N; i++) {
      dps2[i][0] = 1;
      for(int j = 1; j < K; j++) {
        dps2[i][j] = dps2[i][j - 1];
        if(dp2[i][j] == 1) dps2[i][j]++;
      }
    }

    int nec = 0;
    for(int i = 0; i < N; i++) {
      boolean flg = false;
      if(i == 0) {
        if(a[i] >= K) {
          flg = true;
        } else {
          if((dps2[1][K - 1] - dps2[1][K - a[i] - 1]) > 0) flg = true;
        }
      } else if(i == N - 1) {
        if(a[i] >= K) {
          flg = true;
        } else {
          if((dps2[N - 2][K - 1] - dps2[N - 2][K - a[i] - 1]) > 0) flg = true;
        }
      } else {
        if(a[i] >= K) {
          flg = true;
        } else {
          for(int j = 0; j < K; j++) {
            if((dp1[i - 1][j] == 1) && (dps2[i + 1][K - j - 1] - dps2[i + 1][K - j - a[i] - 1] > 0)) flg = true;
          }
        }
      }
      if(flg) nec++;
    }
    System.out.println(N - nec);
  }
}