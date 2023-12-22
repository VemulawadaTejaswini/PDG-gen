
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
        G[0] = new Graph(null, 1);
        for(int i = 1; i < N-1; i++) {
            G[i] = new Graph(i-1, i+1);
        }
        G[N-1] = new Graph(N-2, null);
        G[X].g.add(Y);
        G[Y].g.add(X);

        Set<String> counted = new HashSet<>();
        int ans[] = new int[N-1];
        for(int i = 0; i < N; i++) {
            int dist = 0;
            Set<String> visited = new HashSet<>();
            LinkedList<Integer> q = new LinkedList<>();
            q.addAll(G[i].g);
            while(!q.isEmpty()) {
                LinkedList<Integer> q2 = new LinkedList<>();
                dist += 1;
                while (!q.isEmpty()) {
                    Integer next = q.pop();
                    int small = Math.min(i, next);
                    int big = Math.max(i, next);
                    String temp = small + "-" + big;
                    if (small != big && !visited.contains(temp)) {
                        visited.add(temp);
                        if(!counted.contains(temp)) {
                            counted.add(temp);
                            ans[dist - 1]++;
                        }
                        q2.addAll(G[next].g);
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
        Set<Integer> g;
        Graph(Integer prev, Integer next){
            g = new HashSet<>();
            if(prev != null)
                g.add(prev);
            if (next != null)
                g.add(next);
        }
    }
}