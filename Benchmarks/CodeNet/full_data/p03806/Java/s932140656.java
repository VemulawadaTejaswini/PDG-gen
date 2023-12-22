import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Ma = sc.nextInt();
        int Mb = sc.nextInt();
        int[] a = new int[N+1];
        int[] b = new int[N+1];
        int[] c = new int[N+1];
        for(int i=1;i<=N;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
        }
        int[] sa = new int[N+1];
        int[] sb = new int[N+1];
        for(int i=1;i<=N;i++){
            sa[i] = sa[i-1]+a[i];
            sb[i] = sb[i-1]+b[i];
        }
        int sumA = sa[N];
        int sumB = sb[N];
        int[][][] dp = new int[sumA+1][sumB+1][N+1];
        for(int i=0;i<=sumA;i++){
            for(int j=0;j<=sumB;j++){
                for(int k=0;k<=N;k++) dp[i][j][k] = Integer.MAX_VALUE;
            }
        }
        dp[0][0][0] = 0;
        for(int end=1;end<=N;end++){
            for(int front=0;front<end;front++){
                for(int i=0;i<=sa[front];i++){
                    for(int j=0;j<=sb[front];j++){
                        if(dp[i][j][front]<Integer.MAX_VALUE){
                            dp[i][j][end]=Math.min(dp[i][j][end],dp[i][j][front]);
                            dp[i+a[end]][j+b[end]][end] = Math.min(dp[i+a[end]][j+b[end]][end],dp[i][j][front]+c[end]);
                        }
                    }
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i=1;i<=sumA;i++){
            for(int j=1;j<=sumB;j++){
                if(i*Mb==j*Ma&&dp[i][j][N]<Integer.MAX_VALUE) ans = Math.min(ans,dp[i][j][N]);
            }
        }
        if(ans==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(ans);
    }
}
