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

    System.out.println((max + K) / 2.0);

    sc.close();
  }
}