import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int K = scanner.nextInt() - 1;
    long res = 1;
    for (int i = 0; i < K; i++) {
      res = next(res);
    }
    System.out.println(res);
  }

  private static long next(long num) {
    List<Integer> digits = new ArrayList<>();
    while (num > 0) {
      digits.add((int) (num % 10));
      num /= 10;
    }
    int i = 0;
    while (i < digits.size() - 1 && (digits.get(i) > digits.get(i + 1) || digits.get(i) == 9)) i++;
    if (digits.get(i) != 9) {
      digits.set(i, digits.get(i) + 1);
    } else {
      digits.set(i, 0);
      digits.add(1);
    }
    while (i > 0) {
      digits.set(i - 1, Math.max(0, digits.get(i) - 1));
      i--;
    }
    long res = 0;
    long d = 1;
    for (int j = 0; j < digits.size(); j++) {
      res += digits.get(j) * d;
      d *= 10;
    }
    return res;
  }
}
