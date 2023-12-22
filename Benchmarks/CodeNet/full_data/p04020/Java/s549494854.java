import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    int ans = 0;
    for (int i = 0; i < N-1; i++) {
      int p = (A[i]+A[i+1])/2;
      int tmp = A[i];
      A[i] = Math.max(A[i]-2*p, 0);
      A[i+1] -= 2*p-(tmp-A[i]);
      ans += p;
    }
    System.out.println(ans);
  }
}