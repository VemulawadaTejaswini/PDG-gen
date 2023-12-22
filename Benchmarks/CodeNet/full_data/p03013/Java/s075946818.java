import java.util.*;
import java.lang.*;

class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            int[] A = new int[M+2];

            for(int i = 1 ; i <= M ; i++){
                A[i] = sc.nextInt();
            }
            A[0] = -1;
            A[M+1] = N+1;
            sc.close();

            /*
            for(int i = 0 ; i <=M+1 ; i++){
                System.out.println(A[i]);
            }
            */
            long[] dp = new long[N+1];
            dp[0] = 1;
            dp[1] = 1;

            long ans = 1;
            long INF = 1000000007;
            boolean flag = true;
            for(int i = 1 ; i <= M+1 ; i++){
                int tmp = (A[i]-1) -(A[i-1]+1);
                if(tmp<0){
                    flag = false;
                    break;
                }
                if(dp[tmp] != 0){
                    ans *= (dp[tmp]);
                }
                else{
                    for(int j = 2 ; j <= tmp ; j++){
                            dp[j] = (dp[j-2] + dp[j-1])%INF;
                    }
                    ans *= (dp[tmp]);
                }
            }
            if(!flag){
                System.out.println("0");
            }
            else{
                System.out.println(ans%INF);
            }
    }

}
