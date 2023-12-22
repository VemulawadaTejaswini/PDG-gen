import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
  private static void solve(int n, double[] v) {
    PriorityQueue<Double> pq = new PriorityQueue<>(n);
    for (double val : v) {
      pq.add(val);
    }
    while (pq.size() > 1) {
      double v1 = pq.poll();
      double v2 = pq.poll();
      pq.add((v1 + v2) / 2);
    }
    System.out.println(pq.poll());
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] vs = sc.nextLine().split(" ");
    sc.close();
    double[] v = new double[n];
    for (int i = 0; i < n; i++) {
      v[i] = Double.parseDouble(vs[i]);
    }
    solve(n, v);
  }
}