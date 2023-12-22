// // Longest Path

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


class Main{
    static ArrayList<Integer>[] lists;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] l1 = br.readLine().split(" ");

        int N = Integer.parseInt(l1[0]);
        int M = Integer.parseInt(l1[1]);

        lists = new ArrayList[M];
        for(int i = 0; i < M; i++){
            String[] l2 = br.readLine().split(" ");
            int a = Integer.parseInt(l2[0]);
            int b = Integer.parseInt(l2[1]);

            if(lists[a] == null){
                lists[a] = new ArrayList<>();
            }

            lists[a].add(b);
        }

        int[] dp = new int[M];
        Arrays.fill(dp, -1);

        int ans = 0;
        for(int i = 1; i <= N; i++){
            if(lists[i] != null){
                ans = Math.max(ans, helper(lists, i, dp));
            }
        }
        System.out.println(ans);
    }

    public static int helper(ArrayList<Integer>[] lists, int node, int[] dp){
        if(dp[node] != -1){
            return dp[node];
        }
        dp[node] = 0;
        int count = 0;
        if(lists[node] != null){
            for(int neigh: lists[node]){
                count = Math.max(count, helper(lists, neigh, dp) + 1);
            }
        }
        dp[node] = count;
        return dp[node];
    }
}