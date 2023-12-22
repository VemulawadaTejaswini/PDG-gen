import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    long K = sc.nextLong();
    int[] a = new int[N];
    long[] b = new long[N];

    for (int i = 0; i < N; i++) {
      a[i] = sc.nextInt();
      b[i] = sc.nextLong();
    }

    sc.close();

    for (int i = 0; i < N; i++) {
      K = K - b[i];
      if (K <= 0) {
        System.out.println(a[i]);
        break;
      }
    }

  }

}