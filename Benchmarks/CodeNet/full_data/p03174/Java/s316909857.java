import java.util.*;
import java.io.*;
public class Main {
    static boolean arr[][];
    static long dp[][],mod=1000000007L;
    static int pow[];
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        arr=new boolean[n][n];
        dp=new long[n][(int)Math.pow(2, n)];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(input.nextInt()==1) {
                    arr[i][j]=true;
                }
            }
        }
        for(int i=0;i<dp.length;i++) {
            for(int j=0;j<dp[i].length;j++) {
                dp[i][j]=-1L;
            }
        }
        pow=new int[30];
        int p=1;
        for(int i=0;i<pow.length;i++) {
            pow[i]=p;
            p*=2;
        }
        System.out.println(solve(n-1,new boolean[n]));
    }
    public static long solve(int n,boolean taken[]) {
        if(n==-1) {
            return 1;
        }
        long ways=0;
        for(int i=0;i<taken.length;i++) {
            if(arr[n][i] && !taken[i]) {
                taken[i]=true;
                if(dp[n][get_state(taken)]==-1) {
                    dp[n][get_state(taken)]=solve(n-1,taken)%mod;
                }
                ways+=dp[n][get_state(taken)];
                ways%=mod;
                taken[i]=false;
            }
        }
        return ways;
    }
    public static int get_state(boolean b[]) {
        int state=0;
        for(int i=0;i<b.length;i++) {
            if(b[i]) {
                state+=pow[i];
            }
        }
        return state;
    }
}
