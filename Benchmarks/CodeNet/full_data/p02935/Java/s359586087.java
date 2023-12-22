import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    PriorityQueue<Double> queue = new PriorityQueue<>();
    for (int i = 0; i < n; i++) {
      queue.add(sc.nextDouble());
    }
    while (queue.size() > 1) {
      double item1 = queue.poll();
      double item2 = queue.poll();
      queue.add((item1 + item2) / 2);
    }
    System.out.println(queue.peek());
  }
}