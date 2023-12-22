import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static long mod=1000000007;
    static long[][] dp;
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] s=br.readLine().split(" ");
        int n=Integer.parseInt(s[0].trim());
        int m=Integer.parseInt(s[1].trim());
        char[][] a=new char[n][m];
        for(int i=0;i<n;i++){
            String s1=br.readLine().trim();
            for(int j=0;j<m;j++){
                a[i][j]=s1.charAt(j);
            }
        }
        dp=new long[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        System.out.println(grid(a,n-1,m-1));






    }

    public static long grid(char[][] a,int i,int j){
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(i==0 && j==0){
            dp[i][j]=1;
            return 1;
        }
        long res=0;
        if(i-1>=0 && a[i-1][j]!='#'){
            res=(grid(a,i-1,j)%mod);
        }
        long res2=0;
        if(j-1>=0 && a[i][j-1]!='#'){
            res2=(grid(a,i,j-1)%mod);
        }
        long r=((res%mod)+(res2%mod))%mod;
        dp[i][j]=r;
        return r;
    }






}
