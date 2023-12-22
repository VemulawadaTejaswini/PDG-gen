import java.util.*;
import java.util.stream.*;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt(), M = in.nextInt();
    Pair[] pair = new Pair[N];
    for (int i = 0; i < N; i++) {
      pair[i] = new Pair(in.nextInt(), in.nextInt());
    }
    Arrays.sort(pair, (x, y) -> x.A - y.A);
    PriorityQueue<Pair> pq = new PriorityQueue<>((x, y) -> y.B - x.B);
    int pos = 0;
    long ans = 0;
    for (int i = 1; i <= M; i++) {
      while (pos < N && pair[pos].A <= i) {
        pq.offer(pair[pos++]);
      }
      Pair p = pq.poll();
      if (p != null) {
        ans += p.B;
      }
    }
    System.out.println(ans);
  }
}

class Pair {
  int A, B;

  public Pair(int A, int B) {
    this.A = A;
    this.B = B;
  }

  public String toString() {
    return String.format("(%d, %d)", this.A, this.B);
  }
}
