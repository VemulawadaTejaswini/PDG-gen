import java.io.BufferedInputStream;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        int bag=sc.nextInt();
        int n=sc.nextInt();
        int dp[][]=new int[n+1][bag+1];
        int sh[]=new int[n+1];
        int xs[]=new int[n+1];
        int flag=0;
        double v=0;
        double b[]=new double[n+1];
        for(int i=1;i<=n;i++){
            sh[i]=sc.nextInt();
            xs[i]=sc.nextInt();
            b[i]=sh[i]*1.0/xs[i];
            if(b[i]>v){
                v=b[i];
                flag=i;
            }
        }
        for(int i=1;i<=n;i++){
            if(sh[i]<sh[flag]&&xs[i]>xs[flag])
                sh[i]=-1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=bag;j++){
                if(sh[i]!=-1) {
                    int c = j / sh[i];
                    if (j % sh[i] != 0 && i == 1)
                        c++;
                    if (dp[i][j] == 0) {
                        if (i == 1)
                            dp[i][j] = c * xs[i];
                        else if (j <= sh[i])
                            dp[i][j] = Math.min(dp[i - 1][j], xs[i]);
                        else
                            dp[i][j] = dp[i - 1][j];
                    }
                    if (i > 1 && j >= sh[i]) {
                        for (int k = 1; k <= c; k++)
                            dp[i][j] = Math.min(dp[i][j], dp[i][j - k * sh[i]] + k * xs[i]);
                    }
                }else{
                    if(i!=1)
                        dp[i][j] = dp[i - 1][j];
                    else
                        dp[i][j]=999999999;
                }
            }
        }
        System.out.println(dp[n][bag]);
    }
}