import java.util.*;
import java.io.*;
class Main {
    static long MOD = (long)(1e9+7);
    static long[][] multiply(long[][] a, long[][] b) {
        int n = a.length;
        long[][] res = new long[n][n];
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++) {
                for(int k = 0; k<n; k++) {
                    res[i][k] = (res[i][k] + (a[i][j]%MOD * 1l * b[j][k]%MOD)%MOD)%MOD;
                }
            }
        }
        return res;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[][] graph = new long[n][n];
        for(int i = 0; i<n; i++)
            for(int j = 0; j<n; j++)
                graph[i][j] = sc.nextLong();
        long[][] res = new long[n][n];
        for(int i = 0; i<n; i++)
            res[i][i] = 1l;
        while(k>0) {
            if(k%2==1)
                res = multiply(res, graph);
            graph = multiply(graph, graph);
            k/=2;
        }
        long ans = 0;
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n; j++)
                ans = (ans+res[i][j])%MOD;
        }
        System.out.println(ans);
    }
}