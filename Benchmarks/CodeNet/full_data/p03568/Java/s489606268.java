import java.util.*;
// import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    main.solve();
  }

  int n;
  int a[];

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      a = new int[n];

      for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    } finally {
      sc.close();
    }
  }

  void solve() {
    int b = total();
    int c = oddTotal();
    System.out.println(b - c);
  }

  int total() {
    int ans = 1;
    for (int i = 0; i < n; i++) {
      ans *= calcTotal(a[i]);
    }
    return ans;
  }

  int calcTotal(int i) {
    if (i == 1 || i == 100) return 2;
    return 3;
  }

  int oddTotal() {
    int ans = 1;
    for (int i = 0; i < n; i++) ans *= oddCalc(a[i]);
    return ans;
  }

  int oddCalc(int i) {
    if (i == 1 || i == 100) return 1;
    if (i % 2 == 0) return 2;
    return 1;
  }
}
