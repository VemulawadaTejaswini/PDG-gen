import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] B = new int[N];

    for(int i = 1; i < N; i++) {
      B[i] = sc.nextInt();
    }

    sc.close();

    int[] A = new int[N+1];

    A[N] = B[N-1];

    for (int i = N-1; 1 < i; i--) {
      if (B[i-1] <= B[i]) {
        A[i] = B[i-1];
      } else {
        A[i] = B[i];
      }
    }

    A[1] = B[1];

    int max = 0;

    for (int i = 1; i < N+1; i++) {
      max += A[i];
    }

    System.out.println(max);

  }

}
