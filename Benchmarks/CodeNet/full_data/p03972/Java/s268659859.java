import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    new Main().run();
  }

  class Edge {
    boolean x;
    int u;
    int v;
    int cost;
  }

  class UF {
    int[] arr;

    UF(int n) {
      arr = new int[n];
      for (int i = 0; i < n; ++i) {
        arr[i] = i;
      }
    }

    void unite(int a, int b) {
      int A = parent(a);
      int B = parent(b);
      arr[B] = A;
    }

    boolean isSame(int a, int b) {
      int A = parent(a);
      int B = parent(b);
      return A == B;
    }

    int parent(int a) {
      if (a == arr[a]) {
        return a;
      }
      return arr[a] = parent(arr[a]);
    }
  }

  void run() {
    int w = ni();
    int h = ni();
    int[] p = new int[w];
    int[] q = new int[h];
    ArrayList<Edge> list = new ArrayList<>();
    for (int i = 0; i < w; ++i) {
      p[i] = ni();
      Edge e = new Edge();
      e.x = true;
      e.u = i;
      e.v = i + 1;
      e.cost = p[i];
      list.add(e);
    }
    for (int i = 0; i < h; ++i) {
      q[i] = ni();
      Edge e = new Edge();
      e.x = false;
      e.u = i;
      e.v = i + 1;
      e.cost = q[i];
      list.add(e);
    }

    int P = h + 1;
    int Q = w + 1;
    Collections.sort(list, (a, b) -> a.cost - b.cost);
    long sum = 0;
    for (int i = 0; i < list.size(); ++i) {
      Edge e = list.get(i);
      if (e.x) {
        sum += (long) P * (long) e.cost;
        --Q;
      } else {
        sum += (long) Q * (long) e.cost;
        --P;
      }
    }
    System.out.println(sum);
  }

  int ni() {
    return Integer.parseInt(sc.next());
  }

  void debug(Object... os) {
    System.err.println(Arrays.deepToString(os));
  }
}