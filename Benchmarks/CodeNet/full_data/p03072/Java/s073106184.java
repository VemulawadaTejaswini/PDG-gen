import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] H = new int[N];

    for (int i = 0; i < N; i++) {
      H[i] = sc.nextInt();
    }

    sc.close();

    int count = 0;

    int max = 0;

    for (int i = 0; i < N; i++) {
      if (max <= H[i]) {
        max = H[i];
        count++;
      }
    }

    System.out.println(count);

  }

}