import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner();
    // 整数の入力
    int N = sc.nextInt();
    int K = sc.nextInt();
    int X = sc.nextInt();
    int Y = sc.nextInt();
    //　宿泊費の合計を計算
    int sum;
    if (N<=K) {
      sum = N * X;
    } else {
      sum = K * X + (N - K) * Y;
    }
    // 出力
    System.out.println(sum);
  }
}