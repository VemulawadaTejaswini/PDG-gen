import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    BufferedReader in;
    PrintWriter out;
    StringTokenizer tok = new StringTokenizer("");

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        } catch (Throwable t) {
            t.printStackTrace(System.err);
            System.exit(-1);
        }
    }

    String readString() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    int readInt() throws IOException {
        return Integer.parseInt(readString());
    }

    long readLong() throws IOException {
        return Long.parseLong(readString());
    }

    double readDouble() throws IOException {
        return Double.parseDouble(readString());
    }

    HashMap<Integer, HashSet<Integer>> graph;
    int[] indegree;
    int[] dp;
    boolean[] visited;
    void findMax(int row) {
        visited[row]=true;
        if(!graph.containsKey(row))
            return;
        for(int neig : graph.get(row)) {
            dp[neig] = Math.max(dp[neig], dp[row]+1);
            indegree[neig]--;
            if(indegree[neig]==0)
                findMax(neig);
        }
    }
    void solve() throws IOException {
        int n = readInt();
        int m = readInt();
        visited = new boolean[n+1];
        graph = new HashMap<>();
        indegree = new int[n+1];

        for(int i=0;i<m;i++){
            int s = readInt();
            if(!graph.containsKey(s))
                graph.put(s, new HashSet<Integer>());
            int e = readInt();
            graph.get(s).add(e);
            indegree[e]++;
        }

        int max = 0;
        dp = new int[n+1];
        for(int no=1;no<=n; no++) {
            if(!visited[no] && indegree[no]==0)
                findMax(no);
        }
        for(int i=1;i<=n;i++)
                if(dp[i]>max)
                    max=dp[i];
        System.out.println(max);
    }
}
