import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N];
    int check =0, total =0;
    for (int i=0; i<N; i++) {
      A[i] = sc.nextInt();
      total += A[i];
    }
    for (int i=0; i<N; i++) {
      if (total % (4 * M) == 0) {
        if (A[i] >= total / (4 * M)) {
          check++;
        }
      } else {
        if (A[i] > total / (4 * M)) {
          check++;
        }
      }
    }
    if (check >= M) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}