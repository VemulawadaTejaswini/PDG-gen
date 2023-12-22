import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    Map<Integer, Integer> memo = new HashMap<>();

    int maxN = 0;
    int bunshi = 0;
    for (int i = 1; i <= N; i++) {
      int n = powern(i, K);
      if (i == 1) {
        maxN = n;
      }
      bunshi = bunshi + power2(maxN - n, memo);
    }
    int bunbo = N * power2(maxN, memo);

    System.out.println((double) bunshi / bunbo);
  }
  /*
  private static int power2(int n, Map<Integer, Integer> memo) {
    Integer cached = memo.get(n);
    if (cacehd != null) {
      return cached;
    }

    int ret = 1;
    for (int i = 0; i < n; i++) {
      ret = ret * 2;
    }
    memo.put(n, ret);
    return ret;
  }
  */

  private static int power2(int n, Map<Integer, Integer> memo) {
    Integer cached = memo.get(n);
    if (cached != null) {
      return cached;
    }

    if (n == 0) {
      return 1;
    }

    int tmp = power2(n/2, memo);
    int ret = tmp * tmp;
    if (n % 2 != 0) {
      ret = ret * 2;
    }
    memo.put(n, ret);

    return ret;
  }


  private static int powern(int a, int K) {

    int work = a;
    int ret = 0;

    while (work < K) {
      work = work * 2;
      ret++;
    }

    return ret;
  }
}

