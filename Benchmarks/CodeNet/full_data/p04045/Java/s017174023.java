import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    List<Integer> digits = new ArrayList<>();
    for (int i = 0; i < 10; i++) digits.add(i);
    for (int i = 0; i < K; i++) {
      int D = scanner.nextInt();
      if (digits.contains(D)) digits.remove(Integer.valueOf(D));
    }
    for (int i = 1; i <= 5; i++) {
      List<Integer> numbers = rec(i, new ArrayList<>(digits), digits);
      Collections.sort(numbers);
      for (int n : numbers) {
        if (n >= N) {
          System.out.println(n);
          return;
        }
      }
    }
  }

  private static List<Integer> rec(int remain, List<Integer> numbers, List<Integer> digits) {
    if (remain == 1) return numbers;
    List<Integer> list = new ArrayList<>();
    for (int n : numbers) {
      for (int d : digits) {
        list.add(n * 10 + d);
      }
    }
    return rec(remain - 1, list, digits);
  }
}
