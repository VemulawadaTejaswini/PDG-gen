import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] a = new long[3 * N];
    for(int i = 0; i < 3 * N; i++) {
      a[i] = sc.nextLong();
    }
    PriorityQueue<Long> pq = new PriorityQueue<Long>();
    long[] max = new long[N + 1];
    for(int i = 0; i < N; i++) {
      pq.add(a[i]);
      max[0] += a[i];
    }
    for(int i = 1; i < N + 1; i++) {
      pq.add(a[N + i - 1]);
      long m = pq.poll();
      max[i] = max[i - 1] + a[N + i - 1] - m;
    }
 
    PriorityQueue<Long> pq2 = new PriorityQueue<>(N, Collections.reverseOrder());
    long[] min = new long[N + 1];
    for(int i = 3 * N - 1; i > 2 * N - 1; i--) {
      pq2.add(a[i]);
      min[0] += a[i];
    }
    for(int i = 1; i < N + 1; i++) {
      pq2.add(a[2 * N - i]);
      long m = pq2.poll();
      min[i] = min[i - 1] + a[2 * N - i] - m;
    }
    long ans = -1000000000000000000l;
    for(int i = 0; i < N + 1; i++) {
      ans = Math.max(ans, max[i] - min[N - i]);
    }
    System.out.println(ans);
  }
}