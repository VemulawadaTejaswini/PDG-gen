import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);
    
    while (in.hasNext()) {
      int N = in.nextInt();
      int[] A = new int[N];
      
      for (int i = 0; i < A.length; ++i) {
        A[i] = in.nextInt();
      }

      long[] prefixSum = new long[N];
   
      prefixSum[0] = A[0];
      for (int i = 1; i < A.length; ++i) {
        prefixSum[i] = prefixSum[i - 1] + A[i];
      }

      long count0Sum = 0;
      for (int i = 0; i < prefixSum.length; ++i) {
        if (prefixSum[i] == 0) {
          ++count0Sum;
        }

        for (int j = i + 1; j < prefixSum.length; ++j){
          if (prefixSum[j] - prefixSum[i] == 0) {
            ++count0Sum;
          }
        }
      }

      System.out.println(count0Sum);
    }
  }
}