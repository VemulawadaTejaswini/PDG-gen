import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    int[] T = new int[N];
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      T[i] = sc.nextInt();
      A[i] = sc.nextInt();
    }

    sc.close();
    
    long[] Takahashi = new long[N];
    long[] Aoki = new long[N];
    
    Takahashi[0] = T[0];
    Aoki[0] = A[0];

    for (int i = 1; i < N; i++) {
      
      long n = Math.max((long) Math.ceil((double) Takahashi[i - 1] / T[i]), (long) Math.ceil((double) Aoki[i - 1] / A[i]));

      Takahashi[i] = n * T[i];
      Aoki[i] = n * A[i];

    }

    System.out.println(Takahashi[N - 1] + Aoki[N - 1]);

  }

}