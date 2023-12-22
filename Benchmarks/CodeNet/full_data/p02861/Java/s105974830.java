import java.util.Scanner;
import java.lang.Math;

class Main {
  static double distance(int x1, int x2, int y1, int y2) {
    int dx = (x1 - x2) * (x1 - x2);
    int dy = (y1 - y2) * (y1 - y2);
    return Math.pow((dx + dy), 0.5);
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    double ave = 0.0;

    int n = Integer.parseInt(stdIn.next());
    int x[] = new int[n];
    int y[] = new int[n];
    for (int i = 0; i < n; i++) {
      x[i] = Integer.parseInt(stdIn.next());
      y[i] = Integer.parseInt(stdIn.next());
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        ave += distance(x[i], x[j], y[i], y[j]);
      }
    }

    ave /= n;

    System.out.println(ave);
  }
}
