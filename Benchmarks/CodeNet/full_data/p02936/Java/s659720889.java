
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<List<Integer>> edge;
    private static int[] score;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int q = Integer.parseInt(scan.next());

        edge = new ArrayList<List<Integer>>();
        for (int i = 0; i < n; i++) {
            edge.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n - 1; i++) {
            int a = Integer.parseInt(scan.next());
            int b = Integer.parseInt(scan.next());
            a--;
            b--;
            edge.get(a).add(b);
            edge.get(b).add(a);
        }

        score = new int[n];
        for (int i = 0; i < q; i++) {
            int p = Integer.parseInt(scan.next());
            int x = Integer.parseInt(scan.next());
            p--;
            score[p] += x;
        }
        scan.close();

        dfs(0, 0);

        StringBuilder sb = new StringBuilder();
        sb.append(score[0]);
        for (int i = 1; i < n; i++) {
            sb.append(" ");
            sb.append(score[i]);
        }
        System.out.println(sb.toString());
    }

    private static void dfs(int node, int parent) {
        for (int i : edge.get(node)) {
            if (i == parent) {
                continue;
            }
            score[i] += score[node];
            dfs(i, node);
        }
    }

}
