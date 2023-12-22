import java.lang.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Main m = new Main();
    m.exec();
  }

  private void exec() {
    Scanner scan = new Scanner(System.in);
    // 変数宣言及び標準入力
    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] x = new int[n];
    for (int i = 0; i < x.length; i++) {
      x[i] = scan.nextInt();
    }

    // 移動距離総和の最小値を計算
    int total = 0;
    for (int i = 0; i < n; i++) {
      int a = Math.abs(k - x[i]);
      int distance = x[i];
      if (distance > a) {
        distance = a;
      }
      total += distance * 2;
    }
    
    scan.close();
  }
}