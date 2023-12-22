import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.next());
    int K = Integer.parseInt(sc.next());
    int[] p = new int[N];

    for (int i = 0; i < N; i++) {
      p[i] = Integer.parseInt(sc.next());
    }

    int max = 0;
    int ptr = 0;

    for (int i = 0; i <= N - K; i++) {
      int avg = Arrays.stream(p)
                      .skip(i)
                      .limit(K)
                      .sum();

      if (avg > max) {
        max = avg;
        ptr = i;
      }
    }

    double d = Arrays.stream(p)
                     .skip(ptr)
                     .limit(K)
                     .mapToDouble(x -> (double)((1 + x) / 2.0))
                     .sum();

    System.out.println(d);

    sc.close();
  }
}