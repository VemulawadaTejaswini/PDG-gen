import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] d = new int[N];

    for (int i = 0; i < N; i++) {
      d[i] = sc.nextInt();
    }

    sc.close();

    Arrays.sort(d);

    int w = d[N-1];
    int count = 1;

    for (int i = N-2; 0 <= i; i--) {
      if (d[i] < w) {
        w = d[i];
        count++;
      }
    }

    System.out.println(count);

  }

}