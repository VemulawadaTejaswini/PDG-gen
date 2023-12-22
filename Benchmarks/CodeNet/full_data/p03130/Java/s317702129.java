import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.solve());
  }

  int[] town = new int[4];

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      for (int i = 0; i < 3; i++) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        town[--a]++;
        town[--b]++;
      }
    } finally {
      sc.close();
    }
  }

  String solve() {
    return any() ? "NO" : "YES";
  }

  boolean any() {
    for (int i = 0; i < 4; i++) if (town[i] == 3) return true;
    return false;
  }
}
