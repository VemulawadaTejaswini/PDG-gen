import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    Test[] tests = new Test[N];
    for (int i = 0; i < N; i++) tests[i] = new Test();
    for (int i = 0; i < N; i++) tests[i].a = scanner.nextInt();
    for (int i = 0; i < N; i++) tests[i].b = scanner.nextInt();
    Arrays.sort(tests, Comparator.comparingInt(test -> test.a > test.b ? test.a - test.b : 1_000_000_000));
    long[] casum = new long[N];
    casum[N - 1] = tests[N - 1].a;
    for (int i = N - 2; i >= 0; i--) casum[i] = casum[i + 1] + tests[i].a;
    long[] cbsum = new long[N];
    cbsum[N - 1] = tests[N - 1].b;
    for (int i = N - 2; i >= 0; i--) cbsum[i] = cbsum[i + 1] + tests[i].b;
    if (casum[0] < cbsum[0]) {
      System.out.println(-1);
      return;
    }
    int i = 0;
    while (i < N && tests[i].a >= tests[i].b && casum[i] >= cbsum[i]) i++;
    if (i == N) System.out.println(0);
    else System.out.println(N - i + 1);
  }

  private static class Test {
    private int a;
    private int b;
  }
}
