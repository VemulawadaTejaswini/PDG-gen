import java.util.*;

public class Main{

    static long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }

    static long lcm(long a,long b){
        return a/gcd(a,b)*b;
    }
    public static void main(String[] srgs){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt(),m=sc.nextInt();
        int[][] in=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                in[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                in[i][j]-=sc.nextInt();
            }
        }
        int[][][] dp=new int[n+1][m+1][7000];
        dp[0][0][0]=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<7000;k++)if(dp[i][j][k]==1){
                    int a=k,b=in[i][j];
                    int c=Math.abs(a+b);
                    if(c<7000){
                        dp[i+1][j][c]=1;
                        dp[i][j+1][c]=1;
                    }
                    c=Math.abs(a-b);
                    if(c<7000){
                        dp[i+1][j][c]=1;
                        dp[i][j+1][c]=1;
                    }
                }
            }
        }
        for(int i=0;i<7000;i++)if(dp[n][m-1][i]==1){
            System.out.println(i);
            break;
        }
    }
}
