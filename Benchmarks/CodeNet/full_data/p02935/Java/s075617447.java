import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] v = new int[N];
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    for (int i = 0; i < N; i++) {
      queue.add(sc.nextInt());
    }
    float ans = queue.poll();
    while (!queue.isEmpty()) {
      ans = (ans + queue.poll()) / 2;
    }
    System.out.println(ans);
  }
}