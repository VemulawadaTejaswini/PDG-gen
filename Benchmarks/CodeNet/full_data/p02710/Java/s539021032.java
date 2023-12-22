import java.util.*;
import java.util.Arrays;

import java.util.ArrayList;
import java.io.*;
 
public class Main implements Runnable{
    int[] C;
    List<List<Integer>> list;
    boolean[] seen;
    long[] cnt, res;
    long[][] dp;
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException{
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
        out.flush();
    }
    public void run() {
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        C = new int[N];
        list = new ArrayList<>(N);
        for(int i = 0; i < N; i++){
            C[i] = Integer.parseInt(sc.next());
        }

        for (int i = 0; i < N; i++) {
			list.add(new ArrayList<>());
		}
        for(int i = 0; i < N-1; i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            list.get(a).add(b);
            list.get(b).add(a);
        }

        seen = new boolean[N]; cnt = new long[N]; dp = new long[N][N]; 
        res = new long[N]; 
        for(int j = 0; j < N; j++){
            seen[j] = false;
        }
        dfs(list, 0, N);

        for(int i = 0; i < N; i++){
            if(C[0] == i+1){
                
            }else{
                res[i] = res[i] + sum(dp[0][i]);
                dp[0][i] = 0;
            }
            out.println(sum((long)N) - res[i]);
        }
        out.flush();
    }

    void dfs(List<List<Integer>> tree, int v, int N){
        boolean[] reset = new boolean[N];
        for(int i = 0; i < N; i++){
            if(C[v] == i+1){
                dp[v][i] = 0;
            }else{
                dp[v][i] = 1;
            }
        }
        cnt[v] = 1;
        seen[v] = true;
        
        for(int i = 0; i < tree.get(v).size(); i++){
            if(seen[tree.get(v).get(i)]) continue;
            dfs(tree, tree.get(v).get(i), N);
            for(int j = 0; j < N; j++){
                if(C[v] != j+1){
                    dp[v][j] = dp[v][j] + dp[tree.get(v).get(i)][j];
                }else{
                    res[j] = res[j] + sum(dp[tree.get(v).get(i)][j]);
                    reset[j] = true;
                }
            }
            cnt[v] = cnt[v] + cnt[tree.get(v).get(i)];
        }
        for(int i = 0; i < N; i++){
            if(reset[i] == true) dp[v][i] = 0;
        }
        
    }

    long sum(long n){
        return ((n)*(n+1))/2;
    }
} 