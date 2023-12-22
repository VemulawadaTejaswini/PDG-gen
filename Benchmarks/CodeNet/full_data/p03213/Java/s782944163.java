import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean[] prime = new boolean[N+1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        
        for(int i = 0; i < prime.length; i++){
            if(prime[i]){
                for(int j = i * 2; j < prime.length; j += i){
                    prime[j] = false;
                }
            }
        }
        
        // N! の素因数分解の指数
        int[] e = new int[N+1];
        // N! を素因数分解
        for(int i = 1; i <= N; i++){
            for(int j = 2; j < prime.length; j++){
                if( prime[j] ) {
                    int target = i;
                    while( target % j == 0 ){
                        target /= j;
                        e[j]++;
                    }
                }
            }
        }

        int[][] dp = new int[N+1][76];
        dp[0][1] = 1;
        
        for(int i = 1; i <= N; i++){
            for(int j = 0; j <= e[i]; j++){
                for(int k = 0; k <= 75; k++){
                    if( (j+1) * k > 75 ) break;
                    dp[i][ (j+1) * k ] += dp[i-1][k];
                }
            }
        }
        
        System.out.println(dp[N][75]);
    }
}

