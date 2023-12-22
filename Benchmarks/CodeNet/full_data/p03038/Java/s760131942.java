import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int M = scanner.nextInt();

    List<Card> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int a = scanner.nextInt();
      list.add(new Card(a, 1));
    }
    for (int i = 0; i < M; i++) {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      list.add(new Card(b, a));
    }
    list.sort((c1, c2) -> c2.number - c1.number);

    int remain = N;
    long sum = 0;
    for (Card c : list) {
      int r = Math.min(remain, c.count);
      sum += (long) c.number * r;
      remain -= r;
    }
    System.out.println(sum);
  }

  private static class Card {
    private final int number;
    private final int count;

    private Card(int number, int count) {
      this.number = number;
      this.count = count;
    }
  }
}
