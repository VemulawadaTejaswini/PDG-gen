import java.util.*;
import java.text.*;

public class Main {
    static long MOD = (long)1e9+7;
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[][] g = new boolean[n][n];
        for(int i = 0; i< n; i++)
            for(int j = 0; j< n; j++)
                g[i][j] = in.nextInt() == 1;
        long[] ways = new long[1<<n];
        Arrays.fill(ways, -1);
        ways[0] = 1;
        System.out.println(calc(ways, g, n-1, (1<<n)-1));
    }
    static long calc(long[] ways, boolean[][] g, int cur,  int mask){
        if(cur == -1)return 1;
        if(ways[mask] != -1)return ways[mask];
        ways[mask] = 0;
        for(int i = 0; i < g.length; i++){
            if(((mask>>i)&1) == 1 && g[cur][i]){
                ways[mask] += calc(ways, g, cur-1, mask^(1<<i));
                if(ways[mask] >= MOD)ways[mask] -= MOD;
            }
        }
        return ways[mask];
    }
    static int bit(int x){
        return x == 0?0:(1+bit(x&(x-1)));
    }
}