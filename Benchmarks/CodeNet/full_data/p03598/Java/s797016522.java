import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] x = new int[N];

    for (int i = 0; i < N; i++) {
      x[i] = sc.nextInt();
    }

    sc.close();

    int d = 0;

    for (int i = 0; i < N; i++) {
      if (K / 2 < x[i]) {
        d += K - x[i];
      } else {
        d += x[i];
      }
    }

    System.out.println(d * 2);

  }

}