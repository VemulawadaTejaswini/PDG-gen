import static java.lang.Integer.max;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int n = scanner.nextInt();
    final int k = scanner.nextInt();
    final List<Integer> p = new ArrayList<>();
    int max = 0;
    int prev = 0;
    int idx = k-1;
    for (int i = 0; i < n; i++) {
      p.add(scanner.nextInt());
    }
    for (int i = 0; i < k; i++) {
      prev += p.get(i);
    }
    for (int i = k; i < n; i++) {
      int current = prev - p.get(i - k) + p.get(i);
      if(current > prev) {
        max = current;
        idx = i;
      }
    }

    double exp = 0;
    for (int i = idx - k + 1; i <= idx; i++) {
      exp += calcExp(p.get(i));
    }
    System.out.println(exp);

  }

  private static double calcExp(final int num) {
    int sum = 0;
    for (int i = 1; i <= num; i++) {
      sum += i;
    }
    return (double) sum / (double) num;
  }
}
