import java.util.*;
public class Main{
    public static long memo[][];
    public static int w[],v[];
    public static int n;

    public static long dp(int i,int rw){
        if(rw<0) return (long) -1e9;
        if(i==n) return 0;
        if(memo[i][rw] != -1) return memo[i][rw];
        return memo[i][rw] = Math.max(dp(i+1,rw),v[i] + dp(i+1,rw - w[i])); 
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int s = sc.nextInt();
        w = new int[n];
        v = new int[n];
        memo = new long[n+1][s+1];
        for(long x[] : memo)
            Arrays.fill(x,-1L);
        for(int i=0;i<n;i++){
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        System.out.println(dp(0,s)); 
    } 
}