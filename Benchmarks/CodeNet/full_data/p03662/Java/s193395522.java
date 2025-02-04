import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public int[][] dist;
    public LinkedList<Integer>[] node;
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        node = new LinkedList[n];
        for (int i = 0; i < n; i++)
            node[i] = new LinkedList<Integer>();
        dist = new int[2][n];
        for (int i = 0; i < n-1; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            node[a-1].add(b-1);
            node[b-1].add(a-1);
        }
        dfs(0, 0, -1);
        dfs(1, n-1, -1);
        int black = 0;
        for (int i = 0; i < n; i++) {
            if (dist[0][i] <= dist[1][i])
                black++;
        }
        if (black > n/2)
            System.out.println("Fennec");
        else
            System.out.println("Snuke");
    }

    void dfs(int id, int current, int prev) {
        if (prev != -1) dist[id][current] = dist[id][prev] + 1;
        for (int i = 0; i < node[current].size(); i++) {
            int next = node[current].get(i);
            if (next != prev)
                dfs(id, next, current);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
