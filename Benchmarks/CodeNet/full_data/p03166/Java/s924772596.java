import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public final class Main{
    static ArrayList<Integer> l[];
    // static int z = 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] max = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(visited, false);
        int m = sc.nextInt();
        l = new ArrayList[n];
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            l[i] = new ArrayList<Integer>();
        }
        for(int i=0; i<m; i++){
            l[sc.nextInt()-1].add(sc.nextInt()-1);
        }
        for(int i=0; i<n; i++){
            if(visited[i] == false){
                dfs(i,visited,l,dp);
            }
        }
        int ans = 0;
        for(int s : dp)
            ans = Math.max(ans,s);
        System.out.print(ans);
        sc.close();
    }

    static void dfs(int node, boolean[] visited,ArrayList<Integer>[] l,int[] dp){
        // System.out.println(node);
        visited[node] = true;
        for(int i=0; i<l[node].size(); i++){
            if(visited[l[node].get(i)] == false){
                dfs(l[node].get(i),visited,l,dp);
            }
            dp[node] = Math.max(dp[node], 1+dp[l[node].get(i)]);
        }
    }
}