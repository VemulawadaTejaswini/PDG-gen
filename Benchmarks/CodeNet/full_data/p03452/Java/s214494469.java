import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    Root r = new Root(N+1);
    boolean ans = true;
    for (int i=0; i<M; i++) {
      if (!r.set(sc.nextInt(), sc.nextInt(), sc.nextInt())) {
        ans = false;
        break;
      }
    }
    System.out.println(ans ? "Yes" : "No");
  }

  static class Root {
    int[] root;
    int[] toRoot;
    Root(int N) {
      root = new int[N];
      toRoot = new int[N];
      for (int i = 0; i < N; i++) {
        root[i] = i;
        toRoot[i] = 0;
      }
    }

    boolean set(int L, int R, int D) {
      if (root[L] != root[R]) {
        if (root[L] < root[R]) {
          root[R] = root[L];
          toRoot[R] = toRoot[L] + D;
        } else {
          root[L] = root[R];
          toRoot[L] = toRoot[R] - D;
        }
      } else if (toRoot[R] - D != toRoot[L]) {
        return false;
      }
      return true;
    }
  }
}
