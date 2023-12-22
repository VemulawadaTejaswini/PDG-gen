import java.util.*;

class Main{
  static final Scanner in = new Scanner(System.in);
  static int knapSack(int W, int wt[], int val[], int n) 
    { 
        int i, w; 
        int K[][] = new int[n + 1][W + 1]; 
  
        // Build table K[][] in bottom up manner 
        for (i = 0; i <= n; i++) { 
            for (w = 0; w <= W; w++) { 
                if (i == 0 || w == 0) 
                    K[i][w] = 0; 
                else if (wt[i - 1] <= w) 
                    K[i][w] = Math.max( 
                        val[i - 1] + K[i - 1][w - wt[i - 1]], 
                        K[i - 1][w]); 
                else
                    K[i][w] = K[i - 1][w]; 
            } 
        } 
  
        return K[n][W]; 
    }
  
   public static void main(String[] args) throws Exception {
        int N = in.nextInt();
        int W = in.nextInt();
        int[] w = new int[N];
        int[] v = new int[N];

        long[][] dp = new long[N][W+1];

        for (int i = 0; i < N; i++) {
            w[i] = in.nextInt();
            v[i] = in.nextInt();
            
        }
     System.out.println(knapSack(W, w, v, N));
   }
}
