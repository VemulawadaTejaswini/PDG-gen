import java.util.*;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int min_place = 0;

    for (int i=0; i < N; i++) {
      int num = sc.nextInt();
      if (num == 1) {
        min_place = i;
      }
    }

    System.out.println((int)(Math.ceil((double)(min_place/(K-1)))) + (int)(Math.ceil((double)(N-min_place-1)/(K-1))));
  }
}
