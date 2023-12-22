import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int H = sc.nextInt();
    int W = sc.nextInt();
    String[][] a = new String[H][W];

    for (int i = 0; i < H; i++) {
      String a_ = sc.next();
      a[i] = a_.split("");
    }

    sc.close();

    boolean[] deleteH = new boolean[H];
    boolean[] deleteW = new boolean[W];

    // 行がすべて.かを調べる
    for (int i = 0; i < H; i++) {
      boolean valid_ = true;
      for (int j = 0; j < W; j++) {
        if (a[i][j].equals("#")) {
          valid_ = false;
          break;
        }
      }
      if (valid_) {
        deleteH[i] = true;
      }
    }

    // 列がすべて.かを調べる
    for (int i = 0; i < W; i++) {
      boolean valid_ = true;
      for (int j = 0; j < H; j++) {
        if (a[j][i].equals("#")) {
          valid_ = false;
          break;
        }
      }
      if (valid_) {
        deleteW[i] = true;
      }
    }

    // 出力
    for (int i = 0; i < H; i++) {
      if (!deleteH[i]) {
        for (int j = 0; j < W; j++) {
          if (!deleteW[j]){
            System.out.print(a[i][j]);
          }
        }
        System.out.println("");
      }
    }

  }

}