import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    if (N == K) {
      System.out.println(1);
      return;
    }
    if (N % (K-1) == 0) {
      System.out.println(N / (K-1));
    } else {
      System.out.println(N / (K-1) + 1);
    }
  }
}