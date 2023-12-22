import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
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
    long m = 0L;
    for (int i=0;i<n;i++) {
      PriorityQueue<Long> pq = new PriorityQueue<>();
      for (int j=i;j<n;j++) {
        pq.offer(a[j]);
        long b = pq.poll();
        m += b;
        pq.offer(b);
      }
    }
    System.out.println(m);
  }
}