import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int M = sc.nextInt();

    int[] K = new int[N];
    int[][] A = new int[N][];

    for (int i = 0; i < N; i++) {
      K[i] = sc.nextInt();
      A[i] = new int[K[i]];
      for (int j = 0; j < K[i]; j++) {
        A[i][j] = sc.nextInt();
      }
    }

    sc.close();

    int[] m = new int[M+1];

    for (int i = 0; i < N; i++) {
 
      for (int j = 0; j < K[i]; j++) {

        m[A[i][j]]++;

      }

    }

    int count = 0;

    for (int i = 0; i < M+1; i++) {
      if (m[i] == N) {
        count++;
      }
    }

    System.out.println(count);

  }

}