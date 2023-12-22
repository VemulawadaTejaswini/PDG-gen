import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    int[][] A = new int[N][2];
    for (int i = 0; i < N; i++) {
      A[i][0] = sc.nextInt();
    }
    Arrays.sort(A, (a, b) -> a[0] - b[0]);

    int[][] B = new int[N][2];
    for (int i = 0; i < N; i++) {
      B[i][0] = sc.nextInt();
    }
    Arrays.sort(B, (a, b) -> a[0] - b[0]);
    
    int[][] C = new int[N][2];
    for (int i = 0; i < N; i++) {
      C[i][0] = sc.nextInt();
    }
    Arrays.sort(C, (a, b) -> a[0] - b[0]);
    
    //
    int j = N-1;
    int sum = 0;
    for (int i = N-1; i >= 0; i--) {
      B[i][1] = sum;
      while (j >= 0 && B[i][0] < C[j][0]) {
        sum++;
        B[i][1] = sum;
        j--;
      }
    }
    
    j = N-1;
    sum = 0;
    for (int i = N-1; i >= 0; i--) {
      A[i][1] = sum;
      while (j >= 0 && (A[i][0] < B[j][0])) {
        sum += B[j][1];
        A[i][1] = sum;
        j--;
      }
    }
    
    int ans = 0;
    for (int i = 0; i < N; i++) {
      ans += A[i][1];
    }
    //System.out.println(Arrays.deepToString(A));
    //System.out.println(Arrays.deepToString(B));
    //System.out.println(Arrays.deepToString(C));
    System.out.println(ans);
  }
}