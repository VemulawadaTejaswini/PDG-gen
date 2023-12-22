import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  void run() {
    int n = ni();
    int[] a = new int[n];
    for (int i = 0; i < n; ++i) {
      a[i] = ni() - 1;
    }

    int cnt = 0;
    for (int i = 0; i < n; ++i) {
      debug(a[a[i]], i);
      if (a[a[i]] == i) {
        ++cnt;
      }
    }
    cnt /= 2;

    System.out.println(cnt);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }

}
