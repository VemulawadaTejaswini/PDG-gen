package atcoder;

import java.util.Scanner;

/** https://atcoder.jp/contests/abc048/tasks/abc048_b */
public class B048 {

  /** 入力値A */
  private static int a;

  /** 入力値B */
  private static int b;

  /** 入力値X */
  private static int X;

  /**
   * メインメソッド
   *
   * @param args 実行時引数
   */
  public static void main(String[] args) {
    inputDate();
    System.out.println(getCount(b) - getCount(a - 1));
  }

  /** 入力値設定 */
  private static void inputDate() {
    var sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    X = sc.nextInt();
  }

  /**
   * Xで割り切れる数を取得
   *
   * @param targetNum 数値
   * @return count 個数
   */
  private static int getCount(int targetNum) {

    // a == 0 の場合
    if (targetNum == -1) {
      return 0;
    } else {
      return targetNum / X;
    }
  }
}
