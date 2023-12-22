import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int w = sc.nextInt();

    String[][] a = new String[h][w];

    for (int i = 0; i < h; i++) {
      a[i] = sc.next().split("");
    }

    int[] x = new int[h];
    int[] y = new int[w];
    
    for (int i = 0; i < h; i++) {
      int c = 0;
      for (int j = 0; j < w; j++) {
        if (a[i][j].equals(".")) c++;
      }
      if (c == w) {
        x[i] = 1;
      } else {
        x[i] = 0;
      }
    }
    
    for (int i = 0; i < w; i++) {
      int c = 0;
      for (int j = 0; j < h; j++) {
        if (a[j][i].equals(".")) c++;
      }
      if (c == h) {
        y[i] = 1;
      } else {
        y[i] = 0;
      }
    }

    String s = "";
    for (int i = 0; i < h; i++) {
      s = "";
      for (int j = 0; j < w; j++) {
        if (x[i] == 0 && y[j] == 0) s += a[i][j];
      }
      if (s != "") System.out.println(s);
    }

  }
}
