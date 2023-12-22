import java.util.*;

public class Main {
  // 変数宣言
  static int N;
  static int P;
  static int[] biscuits;

  // main
  public static void main(String[] args) {
    // 準備
    Scanner sc = new Scanner(System.in);

    // ロード
    String[] line = sc.nextLine().split(" ");
    N = Integer.parseInt(line[0]);
    P = Integer.parseInt(line[1]);
    line = sc.nextLine().split(" ");
    biscuits = new int[N];
    for (int i = 0; i < N; i++) {
      biscuits[i] = Integer.parseInt(line[i]);
    }

    // 処理
    int count = 0;
    for (int i = 0; i < N; i++) {
      count += calcMatchP(i);
    }

    // 出力
    System.out.println(count);
  }

  // 一致するPの数を計算する
  public static int calcMatchP(int num) {
    if (num == 0) {
      return (P == 0);
    }

    int match = 0;
    int[] total = calcAllBiscuits(num);
    for (int i = 0; i < total.length; i++) {
      match += (P == (total[i] % 2));
    }
    return match;
  }

  // 特定の組み合わせ数の組み合わせの合計数を計算するメソッド
  public static int[] calcAllBiscuits(int num) {
    int[][] inds = getCombn(num);
    int len = inds.length;
    int[] res = new int[len];
    for (int i = 0; i < len; i++) {
      res[i] = calcBiscuits(inds[i]);
    }
    return res;
  }

  // ビスケットの合計数を計算するメソッド
  public static int calcBiscuits(int[] inds) {
    int total = 0;
    for (int ind : inds) {
      total += biscuits[ind];
    }
    return total;
  }

  // ビスケットの組み合わせを計算するメソッド
  public static int[][] getCombn(int num) {
    // 組み合わせ数
    int combnN = calcCombnN(N, num);
    int[][] combn = new int[num][combnN];

    // 1つ目
    int start = 0;
    int combnN;
    for (int i = 0; i < (N - num + 1); i++) {
      combnN = calcCombnN(N - i - 1, num - 1);
      for (int j = start; j < (start + combnN); j++) {
        combn[0][j] = i;
      }
      start += combnN;
    }

    if (num > 1) {
      int[] combnList;
      intn start = 0;
      for (int k = 1; k < num; k++) {
        for(int i=(k-1); i<N; i++) {
          combnList = calcCombnList(combn[k-1][start], num-k);
        }

      }
      for (int k = 1; k < num; k++) {
        for (int i = combn[k - 1]; i < (N - num + 1); i++) {
          combnN = calcCombnN(N - i - 1, num - 1);
          for (int j = start; j < (start + combnN); j++) {
            combn[0][j] = i;
          }
          start += combnN;
        }
      }
    }

    return combn;
  }

  // (選択済数+1)個目の各indexの選択予定数を計算するメソッド
  public static int[] calcCombnList(int no, int num) {
    int[] res = new int[N];
    for (int i = no; i < (N-num+1); i++) {
      res[i] = calcCombnN(N - i - 1, num - 1);
    }
    return res;
  }

  // 組み合わせ数を計算するメソッド
  public static int calcCombnN(int A, int B) {
    // 組み合わせ数 A Combination B
    int combnN = 1;
    for (int i = 0; i < B; i++) {
      combnN *= (A - i);
    }
    for (int i = 0; i < B; i++) {
      combnN /= (B - i);
    }
    return combnN;
  }
}
