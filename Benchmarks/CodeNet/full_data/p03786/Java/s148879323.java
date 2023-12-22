import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
public class Main {
  public static void main(String[] args) {
    Main m = new Main();
    m.run();
  }
  private void run() {
    int n = 0;
    long[] a = new long[0];
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
      n = Integer.parseInt(br.readLine());
      a = Arrays.stream(br.readLine().split("\\s+"))
        .mapToLong(Long::parseLong).toArray();
    } catch (IOException e) {
      e.printStackTrace();
    }
    Arrays.sort(a);
    long max = a[n-1];
    PriorityQueue<Long> pq = new PriorityQueue<>();
    for (int i=0;i<n;i++) pq.offer(a[i]);
    while (pq.size() > 1) {
      long s = pq.poll();
      if (2*s >= max) {
        pq.offer(s);
        break;
      }
      long t = pq.poll();
      pq.offer(s+t);
      if (max < s+t) max = s+t;
    }
    System.out.println(pq.size());
  }
}