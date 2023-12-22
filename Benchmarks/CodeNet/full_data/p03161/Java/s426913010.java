import java.util.Scanner;

public class Main {
	int N;
    int[] h;
    int K;
	public static void main(String[] args) {
        (new Main()).run();
    }
    
    void run(){
        input();
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = Math.abs(h[1] - h[2]);
        
        for(int i=3; i<=N; i++){
            int min = Integer.MAX_VALUE;
            for(int k=(i-K <1 ? 1 : i-K); k<i; k++){
                //System.err.println(i+":"+k);
                int tmp = dp[k] + Math.abs(h[k] - h[i]);
                if(tmp < min){
                    min = tmp;
                }
            }
            dp[i] = min;
        }
        System.out.println(dp[N]);
    }
	void input(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        h = new int[N+1];
        for(int i=1; i<=N; i++){
            h[i] = sc.nextInt();
        }
	}
}