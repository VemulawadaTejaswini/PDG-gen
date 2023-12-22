import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    
    while (input.hasNext()) {
      int N = input.nextInt();
      int K = input.nextInt();
      int[] A = new int[N];
      
      int idxOf1 = -1;
      for (int i = 0; i < A.length; ++i) {
        A[i] = input.nextInt();
        
        if (A[i] == 1) {
          idxOf1 = i;
        }
      }
      
      if (N == K) {
        System.out.println(1);
        continue;
      }

      int ans = idxOf1 / (K - 1) + (idxOf1 % (K - 1) == 0 ? 0 : 1) + (N - (idxOf1) - 1) / (K - 1) + ((N - (idxOf1) - 1) % (K - 1) == 0 ? 0 : 1);
      System.out.println(ans);
    }
  }
}