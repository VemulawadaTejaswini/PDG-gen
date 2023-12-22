
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    List<int[]> protList = new ArrayList<int[]>();
    for (int i = 0; i < n; i++) {
      int[] prot = new int[3];
      prot[0] = sc.nextInt();
      prot[1] = sc.nextInt();
      prot[2] = sc.nextInt();
      protList.add(prot);
    }

    for (int x = 0; x <= 100; x++) {
      for (int y = 0; y <= 100; y++) {
        int prev_height = -1;
        boolean isCollect = true;
        for (int[] p : protList) {
          int a = Math.abs(p[0] - x);
          int b = Math.abs(p[1] - y);
          int h = a + b + p[2];
          h = Math.max(h, 0);
          if (prev_height == -1) {
            prev_height = h;
          } else {
            if (prev_height != h) {
              isCollect = false;
              break;
            }
          }
        }
        if (isCollect) {
          System.out.println(x + " " + y + " " + prev_height);
          return;
        }
      }
    }
  }
}
