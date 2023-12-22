import java.util.*;

public class Problem5Solution {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
      int[] A = new int[N];
      for (int i = 0; i < N; i++) {
         A[i] = sc.nextInt() % 1000000007;
      }
      Arrays.sort(A);
      int min_sum = 0;
      for (int i = 0; i < A.length; i++) {
         int end = nCr(A.length - i - 1, K - 1);
         for (int j = 0; j < end; j++) {
            min_sum += A[i];
            min_sum %= 1000000007;
         }
      }
      int max_sum = 0;
      for (int i = A.length - 1; i >= 0; i--) {
         int end = nCr(i, K - 1);
         for (int j = 0; j < end; j++) {
            max_sum += A[i];
            max_sum %= 1000000007;
         }
      }
      System.out.println((max_sum - min_sum) % 1000000007);
   }
   
   public static int nCr(int n, int r) {
      if (n == 0 || n < r) {
         return 0;
      }
      int result = 1;
      r = Math.min(r, n-r);
      for (int i = n; i > n - r; i--) {
         result *= i;
      }
      for (int i = r; i >= 1; i--) {
         result /= i;
      }
      return result;
   }
}