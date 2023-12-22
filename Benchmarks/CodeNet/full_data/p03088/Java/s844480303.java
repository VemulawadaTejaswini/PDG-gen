import java.io.*;
import  java.util.*;
import static java.lang.System.in;

public class Main{
    static int n,m;
    static long[] head,pos;
    static long mod = 1000000000+7;
    static long[][][][][] dp;
    static HashSet<String> wrong = new HashSet<>();
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==3){
            System.out.println(61);
            return;
        }
        dp = new long[115][4][4][4][4];
        for(int i=0;i<115;i++){
            for(int a=0;a<4;a++){
                for(int b=0;b<4;b++){
                    for(int c=0;c<4;c++) Arrays.fill(dp[i][a][b][c],-1);
                }
            }
        }
        wrong.add("012");
        wrong.add("021");
        wrong.add("201");
        for(int i=0;i<4;i++) {
            wrong.add(String.format("%d%d%d%d",0,i,2,1));
            wrong.add(String.format("%d%d%d%d",0,2,i,1));
        }
        long ans = 0;
        for(int a=0;a<4;a++){
            for(int b=0;b<4;b++){
                for(int c=0;c<4;c++) {
                    for(int d=0;d<4;d++) ans = (ans+dfs(n-3,a,b,c,d))%mod;
                }
            }
        }
        System.out.println(ans);
    }
    static long dfs(int idx, int a, int b, int c, int d){
        if(dp[idx][a][b][c][d]>=0) return dp[idx][a][b][c][d];
        if(!check(a,b,c,d)) return dp[idx][a][b][c][d] = 0;
        if(idx==1) return dp[idx][a][b][c][d]=1;
        long ans = 0;
        for(int i=0;i<4;i++) ans += dfs(idx-1,i,a,b,c);
        ans %= mod;
        return dp[idx][a][b][c][d] = ans;
    }
    static boolean check(int a, int b, int c, int d){
        String cur = String.format("%d%d%d%d",a,b,c,d);
        for(String w:wrong){
            int idx = cur.indexOf(w);
            if(idx>=0) return false;
        }
        return true;
    }
}
