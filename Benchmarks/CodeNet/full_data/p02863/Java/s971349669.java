import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), T = sc.nextInt();
        int food[][] = new int[N][2];
        for(int i=0;i<N;i++){
            food[i][0]=sc.nextInt();//time
            food[i][1]=sc.nextInt();//delicious
        }
        sc.close();
        int dp[][] = new int[N+1][T+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<T+1;j++){
                int time = food[i][0], deli = food[i][1];
                if(j>=time){
                    dp[i+1][j]=Math.max(dp[i][j],dp[i][j-time]+deli);
                }else{
                    dp[i+1][j]=dp[i][j];
                }
            }
        }

        int dp2[][] = new int[N+1][T+1];
        for(int i=0;i<N;i++){
            for(int j=0;j<T+1;j++){
                int time = food[N-1-i][0], deli = food[N-1-i][1];
                if(j>=time){
                    dp2[i+1][j]=Math.max(dp2[i][j],dp2[i][j-time]+deli);
                }else{
                    dp2[i+1][j]=dp2[i][j];
                }
            }
        }

        int max = 0;
        for(int i=0;i<N;i++){
            int ans = 0;
            for(int t=0;t<T;t++){
                int tmp = 0;
                tmp = dp[i][t] + dp2[N-i-1][T-1-t];
                ans = Math.max(ans, tmp);
            }
            ans += food[i][1];
            max = Math.max(ans,max);
        }
        System.out.println(max);
    }
}