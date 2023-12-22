import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        graff graph = new graff(n);
        for(int i=0;i<m;i++)    {
            int x = in.nextInt();
            int y = in.nextInt();
            graph.adj[x].add(y);
        }
        int max = 0;
        for(int i=1;i<=n;i++)   {
            max = Math.max(max, graph.solve(i));
        }
        System.out.println(max);
        in.close();
    }
}

class graff {
    int n;
    int[] dp;
    boolean[] visited;
    List<Integer>[] adj;

    @SuppressWarnings("unchecked")
    graff(int size) {
        n = size;
        dp = new int[n+1];
        visited = new boolean[size+1];
        adj = new ArrayList[size+1];
        for (int i=1;i<=size;i++)    {
            adj[i] = new ArrayList<Integer>();
        }
    }

    int solve(int i)    {
        if(visited[i])  return dp[i];
        visited[i] = true;
        int best = 0;
        for(int u:adj[i])   {
            best = Math.max(best, solve(u)+1);
        }
        return dp[i] = best;
    }
}