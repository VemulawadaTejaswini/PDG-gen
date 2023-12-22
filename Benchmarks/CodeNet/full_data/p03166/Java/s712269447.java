import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class G {
    public static int[] dp;
    public static ArrayList<Integer>[] graph;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] lo = reader.readLine().split(" ");
        int N =Integer.parseInt(lo[0]);
        int M =Integer.parseInt(lo[1]);
        graph = new ArrayList[N+1];
        dp = new int[N+1];
        for (int i = 0; i <=N ; i++) {
            dp[i]=-1;
            graph[i]=new ArrayList<>();
        }
        for (int i = 0; i <M ; i++) {
            String[] xy = reader.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            graph[x].add(y);
        }
        int res =0;
        for (int i = 1; i <=N ; i++) {
            res=Math.max(res,dfs(i));
        }
        System.out.println(res);
    }
    public static int dfs(int a){
        if(dp[a]!=-1) return dp[a];
        int temp = 0;
        for(int y:graph[a]){
            temp = Math.max(temp,1+dfs(y));
        }
        dp[a] = temp;
        return temp;
    }
}
