import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    PriorityQueue<Double> set =
        new PriorityQueue<>(N, Comparator.<Double>naturalOrder().reversed());
    for (int i = 0; i < N; i++) {
      set.add((double) sc.nextLong());
    }

    for (int i = 0; i < M; i++) {
      double max = set.poll();
      set.add(max / 2);
    }
    System.out.println(set.stream().mapToLong(Double::longValue).sum());
  }
}
