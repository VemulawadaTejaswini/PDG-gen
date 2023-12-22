import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ma=sc.nextInt();
        int mb=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }
        int[][][] dp=new int[n+1][401][401];//何個目まで見たか、aの量、bの量
        for(int i=0;i<n+1;i++){
            for(int j=1;j<401;j++){
                for(int k=1;k<401;k++){
                    dp[i][j][k]=Short.MAX_VALUE;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=0;j<6;j++){
                for(int k=0;k<6;k++){
                    dp[i][j][k]=Math.min(dp[i-1][j][k],a[i-1]<=j&&b[i-1]<=k&&dp[i-1][j-a[i-1]][k-b[i-1]]<Short.MAX_VALUE?dp[i-1][j-a[i-1]][k-b[i-1]]+c[i-1]:Short.MAX_VALUE);
                }
            }
        }
        int ans=Short.MAX_VALUE;
        for(int i=1;i<401;i++){
            for(int j=1;j<401;j++){
                if(i%ma!=0||j%mb!=0||i/ma!=j/mb)continue;
                ans=Math.min(ans,dp[n][i][j]);
            }
        }
        System.out.println(ans==Short.MAX_VALUE?-1:ans);
    }
    
    
}