import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    Map<Set<Integer>, Integer> memo = new HashMap<>();
    int maxGcd = 1;
    for (int i = 0; i < N; i++) {
      int l = gcdSum(A, 0, i-1, memo);
      int r = gcdSum(A, i+1, N-1, memo);
      int val = gcd(l, r, memo);
      if (val > maxGcd) {
        maxGcd = val;
      }
    }

    System.out.println(maxGcd);
  }
  
  private static int gcdSum(int[] A, int start, int end, Map<Set<Integer>, Integer> memo) {
    if (start > end) {
      return 0;
    }
    int gcdVal = A[start];
    for (int i = start+1; i <= end; i++) {
      gcdVal = gcd(gcdVal, A[i], memo);
    }
    return gcdVal;
  }
  
  private static int gcd(int i, int j, Map<Set<Integer>, Integer> memo) {
    int a, b;
    if (i > j) {
      a = i;
      b = j;
    } else {
      a = j;
      b = i;
    }

    // a > b
    if (b == 0) {
      return a;
    }

    Set<Integer> key = new HashSet<>();
    key.add(a);
    key.add(b);
    Integer cachedValue = memo.get(key);
    if (cachedValue != null) {
      return cachedValue;
    }

    int value = gcd(b, a % b, memo);
    memo.put(key, value);
    return value;
  }
}