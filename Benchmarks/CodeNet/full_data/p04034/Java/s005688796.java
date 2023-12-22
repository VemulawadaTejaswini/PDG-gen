import java.io.*;
import java.util.*;
public class Main {
  static int r_box[];
  static int w_box[];
  static int nn = 0;
  public static void main(String[] args) throws Exception {
    String line = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //1行目のデータの読み込み
    line = br.readLine();
    String input[] = line.split(" ");
    nn = Integer.parseInt(input[0]); // 箱の数
    int mm = Integer.parseInt(input[1]); // 移動データの数
    //System.out.println("箱の数:" + nn + ",操作の数:" + mm);
    r_box = new int[nn];
    w_box = new int[nn];

    //2行目以降(移動データ)の読み込み
    // 箱の初期化
    initBox();
    int last = 0;
    //printBox(); // 移動前の位置
    Set<Integer> r_pos = new HashSet<Integer>();
    for (int i = 0; i < mm; i++) {
      line = br.readLine();
      input = line.split(" ");
      int xx = Integer.parseInt(input[0]); // 移動前
      int yy = Integer.parseInt(input[1]); // 移動後
      if (r_box[(xx - 1)] == 1) {
        r_move(xx, yy);
        r_pos.add(yy);
        last = yy;
        //System.out.println("赤玉を移動:" + xx + " --> " + yy);
      } else {
        w_move(xx, yy);
        //System.out.println("白玉を移動:" + xx + " --> " + yy);
      }
      //printBox(); // 移動後の位置
    }

    // 可能な位置のカウント
    int count = 0;
    for (int i : r_pos) {
      //System.out.println("白箱(" +  i + "):" + w_box[(i - 1)]);
      if (w_box[(i - 1)] > 0) {
        count = count + 1;
      }
    }
    if (w_box[(last - 1)] == 0) { // 最後に箱は白のあるなしに関係なくカウント
      count = count + 1;
    }
    //System.out.println("ANSWER=" + count);
    System.out.println(count);
  }

  // それぞれの玉の位置の初期化
  public static void initBox() {
    for (int i = 0; i < nn; i++) {
      if (i == 0) {
        r_box[i] = 1;
        w_box[i] = 0;
      } else {
        r_box[i] = 0;
        w_box[i] = 1;
      }
    }
  }

  // 赤玉と白玉の位置を出力
/*
  public static void printBox() {
    for (int i = 0; i < nn; i++) {
      System.out.println((i + 1) + ":R=" + r_box[i] + ",W=" + w_box[i]);
    }
  }
*/
  // 赤玉を移動
  public static void r_move(int a, int b) {
    r_box[(a - 1)] = r_box[(a - 1)] - 1;
    r_box[(b - 1)] = r_box[(b - 1)] + 1;
  }

  // 白玉を移動
  public static void w_move(int a, int b) {
    w_box[(a - 1)] = w_box[(a - 1)] - 1;
    w_box[(b - 1)] = w_box[(b - 1)] + 1;
  }


}