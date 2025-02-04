import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] u = new int[N];
    int[] v = new int[N];
    for (int i = 0; i < N; i++) {
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      u[i] = x + y;
      v[i] = x - y;
    }

    int r = Math.abs(u[0] % 2);
    for (int i = 1; i < N; i++) {
      if (Math.abs(u[i] % 2) != r) {
        System.out.println("-1");
        return;
      }
    }
    r = 1 - r;

    int m = 30;
    System.out.println(m + r);
    StringBuilder sb = new StringBuilder();
    if (r > 0) System.out.print("1 ");
    for (int i = 0; i < m; i++) {
      int d = 1 << i;
      sb.append(d);
      if (i < m - 1) sb.append(' ');
    }
    System.out.println(sb.toString());

    int base = (1 << m) - 1 - r;
    char[] d = new char[]{'L', 'D', 'U', 'R'};
    for (int i = 0; i < N; i++) {
      sb.setLength(0);
      if (r > 0) sb.append('R');
      int uu = (u[i] + base) / 2;
      int vv = (v[i] + base) / 2;
      for (int j = 0; j < m; j++) {
        int u1 = Math.abs(uu % 2);
        int v1 = Math.abs(vv % 2);
        sb.append(d[u1 * 2 + v1]);
        uu /= 2;
        vv /= 2;
      }
      System.out.println(sb.toString());
    }
  }
}
