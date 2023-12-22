import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[N];
        dp[0] = 0;
        for(int i=1 ;i< N;i++ ){
            int min = Integer.MAX_VALUE;
            for(int j=1; j<= K; j++){
                if(i-j>=0){
                    int cost = dp[i-j] + Math.abs(arr[i]-arr[i-j]);
                    if(cost<min){
                        min = cost;
                    }
                }
            }
            dp[i]=min;
        }
        System.out.println(dp[N-1]);
    }
}
