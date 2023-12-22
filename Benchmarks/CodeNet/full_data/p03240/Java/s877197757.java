
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int index = -1;

    List<int[]> protList = new ArrayList<int[]>();
    for (int i = 0; i < n; i++) {
      int[] prot = new int[3];
      prot[0] = sc.nextInt();
      prot[1] = sc.nextInt();
      prot[2] = sc.nextInt();
      if (prot[2] > 0) {
        index = i;
      }
      protList.add(prot);
    }

    for (int x = 0; x <= 100; x++) {
      for (int y = 0; y <= 100; y++) {

        int aa = Math.abs(protList.get(index)[0] - x);
        int bb = Math.abs(protList.get(index)[1] - y);
        int hh = aa + bb + protList.get(index)[2];
        int tmpH = hh;

        boolean isCollect = true;

        for (int[] p : protList) {
          int a = Math.abs(p[0] - x);
          int b = Math.abs(p[1] - y);
          int h = a + b + p[2];
          if (p[2] != 0 && tmpH != h) {
            isCollect = false;
            break;
          }
          if (p[2] == 0 && tmpH < h) {
            isCollect = false;
            break;
          }
        }
        if (isCollect) {
          System.out.println(x + " " + y + " " + tmpH);
          return;
        }
      }
    }
  }
}
