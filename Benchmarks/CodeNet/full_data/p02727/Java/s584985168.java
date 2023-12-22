import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    resolve(System.in, System.out);
  }

  static void resolve(InputStream is, PrintStream pw) {
    Scanner sc = new Scanner(is);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int p[] = new int[a];
    int q[] = new int[b];
    int r[] = new int[c];
    int candidate[] = new int[x + y + c];
    for (int i = 0; i < a; i++) {
      p[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(p);
    for (int i = 0; i < x; i++) {
      candidate[i] = p[p.length - 1 - i];
    }

    for (int i = 0; i < b; i++) {
      q[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(q);
    for (int i = 0; i < y; i++) {
      candidate[x + i] = q[q.length - 1 - i];
    }

    for (int i = 0; i < c; i++) {
      r[i] = Integer.parseInt(sc.next());
      candidate[x + y + i] = r[i];
    }
    long ans = 0;
    Arrays.sort(candidate);
    for (int i = 0; i < x + y; i++) {
      ans += candidate[candidate.length - 1 - i];
    }
    pw.println(ans);
  }
}
