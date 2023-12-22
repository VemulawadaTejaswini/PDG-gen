import java.util.*;

public class Main {
  private static boolean elapsed = false;

  private static long sum;
  private static int cnt;
  private static long div = (long)Math.pow(10, 9) + 7;

  public static void main(String[] args) {
    long S = System.currentTimeMillis();

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] P = new int[N];
    for (int i = 0; i < P.length; ++i) {
      P[i] = sc.nextInt();
    }

    solve(P);
    System.out.println(sum % div);

    long G = System.currentTimeMillis();
    if (elapsed) {
      System.err.println((G - S) + "ms");
    }
  }
  private static void solve(int[] P) {
    List<Integer> list = new ArrayList<>(P.length);
    for (int i = 0; i < P.length; ++i) {
      list.add(i + 1);
    }
    search(list, 0, new ArrayList<>(), P);
  }
  private static void search(List<Integer> list, int d, List<Integer> p, int[] P) {
    if (d >= list.size()) {
      ++cnt;
      if (match(P, p)) {
        sum += cnt;
        sum %= div;
      }
    } else {
      for (int i = 0; i < list.size(); ++i) {
        int num = list.get(i);
        if (p.contains(num)) {
          continue;
        }
        p.add(num);
        search(list, d + 1, p, P);
        p.remove(p.size() - 1);
      }
    }
  }
  private static boolean match(int[] P, List<Integer> list) {
    for (int i = 0; i < P.length; ++i) {
      if (P[i] > 0) {
        if (list.get(i) != P[i]) {
          return false;
        }
      }
    }
    return true;
  }
}