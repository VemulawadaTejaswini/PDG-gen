import java.util.Scanner;

public class Main {
    int N;
    int W;
    int[] v;
    int[] w;
	public static void main(String[] args) {
        (new Main()).run();
    }
    
    void run(){
        input();
        long[][] dp = new long[N+1][W+1];
        for(int k=w[1]; k<=W; k++){
            dp[1][k] = v[1];
        }
        for(int i=2; i<=N; i++){
            for(int k=1; k<=W; k++){
                if(k>=w[i]){
                    //System.err.println(dp[i-1][k]+","+(dp[i-1][k-w[i]]+v[i]));
                    dp[i][k] = Math.max(dp[i-1][k], dp[i-1][k-w[i]] + v[i]);
                }else{
                    dp[i][k] = dp[i-1][k];
                }
            }
        }
        for(int i=0; i<=N; i++){
            for(int k=0; k<=W; k++){
                System.err.printf("%2d ",dp[i][k]);
            }
            System.err.println();
        }
       
        System.out.println(dp[N][W]);
    }
	void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        W = sc.nextInt();
        w = new int[N+1];
        v = new int[N+1];
        for(int i=1; i<=N; i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
	}
}