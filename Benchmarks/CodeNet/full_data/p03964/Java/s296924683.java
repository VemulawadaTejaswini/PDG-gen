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
    
    int[] Takahashi = new int[N];
    int[] Aoki = new int[N];
    
    Takahashi[0] = T[0];
    Aoki[0] = A[0];

    for (int i = 1; i < N; i++) {
      
      int n = Math.max((int) Math.ceil((double) Takahashi[i - 1] / T[i]), (int) Math.ceil((double) Aoki[i - 1] / A[i]));

      Takahashi[i] = n * T[i];
      Aoki[i] = n * A[i];

    }

    System.out.println(Takahashi[N - 1] + Aoki[N - 1]);

  }

}