import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    new Main().d();

  }

  private void d() {
    try (Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)))) {

      int n = in.nextInt();
      int k = in.nextInt();
      int l = in.nextInt();

      int[] p = new int[k];
      int[] q = new int[k];
      for (int i = 0; i < k; i++) {
        p[i] = in.nextInt();
        q[i] = in.nextInt();
      }

      int[] r = new int[l];
      int[] s = new int[l];
      for (int i = 0; i < l; i++) {
        r[i] = in.nextInt();
        s[i] = in.nextInt();
      }

      int[] result = solve(n, p, q, r, s);
      System.out.print(result[0]);

      for (int i = 1; i < n; i++) {
        System.out.print(' ');
        System.out.print(result[i]);
      }
      System.out.println();
    }
  }

  private int[] solve(int n, int[] p, int[] q, int[] r, int[] s) {
    BitSet roadLink[] = new BitSet[n+1];
    for (int i = 1; i < n+1; i++) {
      roadLink[i] = new BitSet(n+1);
      roadLink[i].set(i);
    }
    
    BitSet railLink[] = new BitSet[n+1];
    for (int i = 1; i < n+1; i++) {
      railLink[i] = new BitSet(n+1);
      railLink[i].set(i);
    }

    int k = p.length;
    int l = r.length;

    for (int i = 0; i < k; i++) {
      int from = p[i];
      int to = q[i];

      roadLink[from].set(to);
      roadLink[to].set(from);

      for (int j = 1; j <= n; j++) {
        if (roadLink[from].get(j)) {
          roadLink[j].set(to);
          roadLink[to].set(j);
        }
      }
    }

    for (int i = 0; i < l; i++) {
      int from = r[i];
      int to = s[i];

      railLink[from].set(to);
      railLink[to].set(from);

      for (int j = 1; j <= n; j++) {
        if (railLink[from].get(j)) {
          railLink[j].set(to);
          railLink[to].set(j);
        }
      }
    }

    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      roadLink[i+1].and(railLink[i+1]);
      result[i] = roadLink[i+1].cardinality();
    }

    return result;
  }

}
