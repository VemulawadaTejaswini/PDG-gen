
import java.io.InputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int X = scan.nextInt()-1;
        int Y = scan.nextInt()-1;
        Graph G[] = new Graph[N];
        G[0] = new Graph(-1, 1);
        for(int i = 1; i < N-1; i++) {
            G[i] = new Graph(i-1, i+1);
        }
        G[N-1] = new Graph(N-2, -1);
        G[X].g[2] = Y;
        G[Y].g[2] = X;

//        boolean[] counted = new boolean[8000000];
        Set<String> counted = new HashSet<>();
        int ans[] = new int[N-1];
        for(int i = 0; i < N; i++) {
            int dist = 0;
//            boolean[] visited = new boolean[2000];
            Set<Integer> visited = new HashSet<>();
            Set<Integer> q = new HashSet<>();
            for(int j = 0; j < 3; j++){
                if(G[i].g[j] != -1)
                    q.add(G[i].g[j]);
            }

            while(!q.isEmpty()) {
                Set<Integer> q2 = new HashSet<>();
                dist += 1;
                for (Integer next : q) {
                    int small = Math.min(i, next);
                    int big = Math.max(i, next);
                    String temp = small+"-"+ big;
                    if (small != big && !visited.contains(next)) {
                        visited.add(next);
                        if(!counted.contains(temp)) {
                            counted.add(temp);
                            ans[dist - 1]++;
                        }
                        for(int j = 0; j < 3; j++){
                            if(G[next].g[j] != -1)
                                q2.add(G[next].g[j]);
                        }
                    }
                }
                q = q2;
            }
        }

        for(int i = 0; i < N-1; i++) {
            os.println(ans[i]);
        }

    }


    static class Graph {
        int g[] = new int[3];
        Graph(int prev, int next){
            g[0] = prev;
            g[1] = next;
            g[2] = -1;
        }
    }
}