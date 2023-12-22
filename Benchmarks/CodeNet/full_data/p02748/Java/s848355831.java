import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Main m = new Main(sc);
    m.show(m.solve());
    // Main m = new Main(); // テスト用
    // m.debug();
  }

  int A;
  int B;
  int M;
  int[] a;
  int[] b;
  int[] x;
  int[] y;
  int[] c;
  Scanner sc;
  int[] ticket;

  // 標準入力用のコンストラクタ
  public Main(Scanner sc) {
    this.sc = sc;
    A = sc.nextInt();
    B = sc.nextInt();
    M = sc.nextInt();
    a = nextArray(A);
    b = nextArray(B);
    x = new int[M];
    y = new int[M];
    c = new int[M];
    ticket = new int[M];
    for (int i = 0; i < M; i++) {
      x[i] = sc.nextInt() - 1;
      y[i] = sc.nextInt() - 1;
      c[i] = sc.nextInt();
      ticket[i] = a[x[i]] + a[y[i]] - c[i];
    }
  }

  // テスト用コンストラクタ
  public Main() {
    A = 2;
    B = 2;
    M = 1;
    a = new int[] { 3, 5 };
    b = new int[] { 3, 5 };
    x = new int[] { 2 };
    y = new int[] { 2 };
    c = new int[] { 1 };
    ticket = new int[M];
    for (int i = 0; i < M; i++) {
      ticket[i] = a[x[i]-1] + a[y[i]-1] - c[i];
    }
  }

  // int配列の読み込み
  int[] nextArray(int n) {
    int[] ans = new int[n];
    for (int i = 0; i < n; i++) ans[i] = sc.nextInt();
    return ans;
  }

  // 判定処理：割引券で２台買う、１台ずつ買う、安いほう
  int solve() {
    int x = waribiki();
    int y = refrigerator() + microwave();
    return Math.min(x, y);
  }

  // int配列の最低値
  int min(int[] a) {
    int ans = a[0];
    for (int i = 1; i < a.length; i++) if (ans > a[i]) ans = a[i];
    return ans;
  }

  // 冷蔵庫単体の最低金額
  int refrigerator() {
    return min(a);
  }

  // 電子レンジ単体の最低価格
  int microwave() {
    return min(b);
  }

  // 割引券使ったペアの最低価格
  int waribiki() {
    return min(ticket);
  }

  // 回答の表示
  void show(int ans) {
    System.out.println(ans);
  }

  // デバッグ表示
  void debug() {
    System.out.printf("A = %d\n", A);
    System.out.printf("B = %d\n", B);
    System.out.printf("M = %d\n", M);
    System.out.printf("a = %s\n", Arrays.toString(a));
    System.out.printf("min(a) = %d\n", min(a));
    System.out.printf("b = %s\n", Arrays.toString(b));
    System.out.printf("min(b) = %d\n", min(b));
    System.out.printf("x = %s\n", Arrays.toString(x));
    System.out.printf("y = %s\n", Arrays.toString(y));
    System.out.printf("c = %s\n", Arrays.toString(c));
    System.out.printf("ticket = %s\n", Arrays.toString(ticket));
    System.out.printf("min(ticket) = %d\n", min(ticket));
  }
}
