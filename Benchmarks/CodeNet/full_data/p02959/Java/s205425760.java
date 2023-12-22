import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    long[] A = new long[N + 1];
    Pair[] B = new Pair[N];
    for (int i = 0; i < N + 1; i++) {
      A[i] = in.nextLong();
    }
    for (int i = 0; i < N; i++) {
      B[i] = new Pair(i, in.nextLong());
    }
    Arrays.sort(B, (a, b) -> a.value - b.value > 0 ? 1 : -1);
    long ans = 0;
    for (int i = 0; i < N; i++) {
      int idx = B[i].idx;
      if (A[idx] > A[idx + 1]) {
        long t = Math.min(A[idx], B[i].value);
        ans += t;
        ans += Math.min(A[idx + 1], B[i].value - t);
      } else {
        long t = Math.min(A[idx + 1], B[i].value);
        ans += t;
        ans += Math.min(A[idx], B[i].value - t);
      }
    }
    System.out.println(ans);
  }
}

class Pair {
  int idx;
  long value;

  public Pair(int i, long v) {
    this.idx = i;
    this.value = v;
  }
}