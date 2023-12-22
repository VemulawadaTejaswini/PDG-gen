/*
    Those who cannot remember the past are condemned to repeat it.
                                            - Dynamic Programming
    
    I never lose, I either win or I learn.
                - Competitive Programming

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Graph {
    int n;
    ArrayList<Integer>[] adj;
    int[] max_here;

    Graph(int v) {
        n = v;
        adj = new ArrayList[n+1];
        max_here = new int[n+1];
        for(int i=0 ; i<=n ; i++) {
            max_here[i] = -1;
            adj[i] = new ArrayList<>();
        }
    }

    void addEdge(int u, int v) {
        adj[u].add(v);
    }

    int computeMaxLen() {
        int max_len = 0;
        for(int i=1 ; i<=n ; i++) {
            max_len = Math.max(max_len, dfs(i));
        }
        return max_len;
    }

    int dfs(int start) {
        if(max_here[start] != -1) {
            return max_here[start];
        }
        else {
            int len_for_this_node = 0;
            for(int x: adj[start]) {
                int sub_len = dfs(x);
                if(len_for_this_node < sub_len+1) {
                    len_for_this_node = sub_len+1;
                }
            }
            max_here[start] = len_for_this_node;
            return max_here[start];
        }
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        PrintWriter pw = new PrintWriter(System.out);

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Graph g = new Graph(n);

        for(int i=0 ; i<m ; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            g.addEdge(u, v);
        }

        int ans = g.computeMaxLen();
        pw.print(ans);
        
        
        
        
        
        
        
        pw.flush();
        pw.close();
    }
}
