import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node();
        }
        for (int i = 0; i < N-1; i++) {
            StringTokenizer st = new StringTokenizer(reader.readLine());
            int src = Integer.parseInt(st.nextToken()) - 1;
            int dst = Integer.parseInt(st.nextToken()) - 1;
            nodes[src].edges.add(dst);
            nodes[dst].edges.add(src);
        }

        Process p = new Process(nodes);
        Result r = p.dfs(0, -1);
        System.out.println((r.black + r.white) % mod);
    }

    private static class Process{
        private Node[] nodes;
        Process(Node[] nodes){
            this.nodes = nodes;
        }

        Result dfs(int nodeIndex, int parent){
            int allWhite = 1;
            int somethingIsBlack = 0;
            for (int e : nodes[nodeIndex].edges){
                if (e != parent){
                    Result r = dfs(e, nodeIndex);
                    somethingIsBlack = (mul(allWhite, r.black) + mul((r.black + r.white), somethingIsBlack))% mod;
                    allWhite = mul(allWhite, r.white);
                }
            }
            Result current = new Result();
            current.white = allWhite + somethingIsBlack;
            current.black = allWhite;
            return current;
        }
    }

    private static int mul(int a, int b){
        return a * b % mod;
    }

    private static int mod = (int) (1e9 + 7);

    private static class Node{
        Vector<Integer> edges = new Vector<>();
    }

    private static class Result{
        int black, white;
    }
}
