import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        final int N = Integer.parseInt(l.trim());
        final ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        final int[] color = new int[N];
        final int[][] weight = new int[N][N];
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<Integer>());
            color[i] = -1;
        }
        for (int i = 0; i < N - 1; i++) {
            String line = sc.nextLine();
            int u = Integer.parseInt(line.split(" ")[0]);
            int v = Integer.parseInt(line.split(" ")[1]);
            int w = Integer.parseInt(line.split(" ")[2]);

            graph.get(u - 1).add(v - 1);
            graph.get(v - 1).add(u - 1);
            weight[u - 1][v - 1] = w;
            weight[v - 1][u - 1] = w;
        }
        for (int i = 0; i < N; i++) {
            if (dfs(graph, weight, i, 0, color)) break;
        }
//        dfs(graph, weight, 0, 0, color);
        Arrays.stream(color).forEach(System.out::println);
    }

    private static boolean dfs(ArrayList<ArrayList<Integer>> graph, int[][] weight, int start, int c, int[] color) {
        color[start] = c;
        ArrayList<Integer> nexts = graph.get(start);
//        System.out.println("now: " + start);
//        System.out.println("nexts: " + nexts);

        for (int i = 0; i < nexts.size(); i++) {
            int next = nexts.get(i);
            int w = weight[start][next];
            int co = color[next];

            if (co != -1) {
                if (w % 2 == 1 && co == c) {
                    return false;
                }
                continue;
            }

            if (w % 2 == 1) {
                c = 1 - c;
            }
            if (!dfs(graph, weight, next, c, color)) return false;
        }
        return true;
    }
}
