import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        long K = sc.nextLong();
        
        int[] Kdigits = new int[41];
        int t = 0;
        while( K > 0 ){
            if( (K & 1) == 1 ) Kdigits[t]++;
            K = K >> 1;
            t++;
        }
        
        int[] numOnes = new int[41];
        for(int i = 0; i < N; i++){
            long A = sc.nextLong();
            int j = 0;
            while( A > 0 ){
                if( (A & 1) == 1 ) numOnes[j]++;
                A = A >> 1;
                j++;
            }
        }
        
        long[][] dp = new long[42][2];
        for(int i = 40; i >= 0; i--){
            long d = 1L << i;
            int ones = numOnes[i];
            int zeros = N - ones;
            if( Kdigits[i] == 0 ){
                dp[i][0] = dp[i+1][0] + d * ones;
                if( dp[i+1][1] > 0 ) dp[i][1] = dp[i+1][1] + d * Math.max(ones, zeros);
            } else {
                dp[i][0] = dp[i+1][0] + d * zeros;
                dp[i][1] = dp[i+1][0] + d * ones;
                if( dp[i+1][1] > 0 ) dp[i][1] = Math.max(dp[i][1], dp[i+1][1] + d * Math.max(ones, zeros)); 
            }
        }
        
        System.out.println( Math.max(dp[0][0], dp[0][1]) );
        
    }
}
