import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[][] red = new int[n][2];
    int[][] blue = new int[n][2];

    for (int i = 0; i < n; ++i) {
      red[i][0] = sc.nextInt();
      red[i][1] = sc.nextInt();
    }

    for (int i = 0; i < n; ++i) {
      blue[i][0] = sc.nextInt();
      blue[i][1] = sc.nextInt();
    }

    ArrayList<Integer>[] binds = new ArrayList[n];
    for (int i = 0; i < n; ++i)
      binds[i] = new ArrayList<>();

    for (int j = 0; j < n; ++j) {
      for (int i = 0; i < n; ++i) {
        if (red[j][0] < blue[i][0] && red[j][1] < blue[i][1]) {
          binds[i].add(j);
        }
      }
    }

    int res = 0;

    int min;

    do {
      min = -1;
      int minSize = n + 1;
      for (int i = 0; i < n; ++i) {
        int sz = binds[i].size();
        if (sz > 0 && sz < minSize) {
          min = i;
          minSize = sz;
        }
      }

      if (min > -1) {
        int j = binds[min].get(0);
        binds[min].clear();
        for (ArrayList list : binds) {
          list.remove(new Integer(j));
        }
        ++res;
      }
    } while (min > -1);

    System.out.println(res);
  }
}