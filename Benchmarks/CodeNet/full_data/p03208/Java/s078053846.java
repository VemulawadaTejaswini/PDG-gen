import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] h = new int[N];

    for (int i = 0; i < N; i++) {
      h[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(h);

    int min = 999999999;
    int count = -1;

    for (int i = 0; i < N - 2; i++) {
      int d = h[i+2] - h[i];
      if (d < min) {
        min = d;
        count = i;
      }
    }

    System.out.println(h[count+2] - h[count]);

  }

}