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
    
    Arrays.sort(A);
    if (K > A[N-1]) {
      System.out.println("IMPOSSIBLE");
      return;
    }
    
    boolean ans = false;
    int d = A[0];
    for (int i = 0; i < N; i++) {
      if (A[i] != (long)d*(i+1) || A[i] == K) {
        ans = true;
        break;
      }
    }
    System.out.println(ans ? "POSSIBLE" : "IMPOSSIBLE");
  }
}