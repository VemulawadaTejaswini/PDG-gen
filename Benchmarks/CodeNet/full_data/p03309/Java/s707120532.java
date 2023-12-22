import java.util.Scanner;
import java.util.Arrays;

public class Main { 
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long[] A = new long[N];
    long[] B = new long[N];
    for (int i =0; i<N; i++) {
      A[i] = sc.nextLong();
      B[i] = A[i] - i;
    }
    Arrays.sort(B);
    if (N == 1) {
      System.out.println(-A[0]);
      return;
    }
    long c1 = B[N/2 - 1]; 
    long c2 = B[N/2];
    long ans1 =0;long ans2 =0; long ans;
    for (int i =0; i<N; i++) {
      ans1 += Math.abs(B[i] - c1);
    }
    for (int i =0; i<N; i++) {
      ans2 += Math.abs(B[i] - c2);
    }
    ans = Math.min(ans1,ans2);
    System.out.println(ans);
  }
}