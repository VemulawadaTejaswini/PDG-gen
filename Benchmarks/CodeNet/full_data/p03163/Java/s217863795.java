import java.util.*;
import java.io.*;

public class Main {
    static int[] weight;
    static int[] value;
    static long[][] dp;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new FileWriter("knapsack1.in");
        //StringTokenizer st = new StringTokenizer(br.readLine());
        //PrintWriter pw = new PrintWriter("knapsack1.out");
        //HashMap<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        int weightMax = sc.nextInt();

        weight = new int[n+1];
        value = new int[n+1];
        dp = new long[n+1][weightMax+1];
        for(int x = 0; x<n+1; x++){
            Arrays.fill(dp[x], -1);
        }
        for(int x = 1; x<n+1; x++){
            int w = sc.nextInt();
            int v = sc.nextInt();
            weight[x] = w;
            value[x] = v;
        }

        System.out.println(max(n, weightMax));



    }

    public static long max(int i, int w){
        if(dp[i][w] != -1)
            return dp[i][w];
        if(i == 0)
            return dp[i][w] = 0;
        if(w == 0)
            return dp[i][w] = 0;
        if(weight[i] <= w)
            return dp[i][w] = Math.max(value[i] + max(i-1, w - weight[i]), max(i-1, w));
        return dp[i][w] = max(i-1, w);
    }
}
