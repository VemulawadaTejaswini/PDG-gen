import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.solve());
  }

  int a;
  int b;

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      a = sc.nextInt();
      b = sc.nextInt();
    } finally {
      sc.close();
    }
  }

  int solve() {
    for (int i = 1; i <= 1000; i++) {
      int x = i * 8 / 100;
      int y = i * 10 / 100;
      if (x == a && y == b) return i;
    }
    return -1;
  }
}
