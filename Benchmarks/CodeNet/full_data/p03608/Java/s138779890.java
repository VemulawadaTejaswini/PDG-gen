import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
    private static class Move
    {
        private final int node;
        private final int cost;
        private final ArrayList<Integer> visited;

        Move(int node, int cost, ArrayList<Integer> visited)
        {
            this.node = node;
            this.cost = cost;
            this.visited = visited;
        }
    }

    private static final int INF = Integer.MAX_VALUE / 2;

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        ArrayList<Integer> cities = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            cities.add(sc.nextInt() - 1);
        }

        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = INF;
            }
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();

            matrix[a][b] = c;
            matrix[b][a] = c;
        }

        for (int k = 0; k < n; k++) {
            for (int s = 0; s < n; s++) {
                for (int g = 0; g < n; g++) {
                    matrix[s][g] = Math.min(matrix[s][g], matrix[s][k] + matrix[k][g]);
                    matrix[g][s] = Math.min(matrix[g][s], matrix[g][k] + matrix[k][s]);
                }
            }
        }

        int minCost = Integer.MAX_VALUE;
        LinkedList<Move> queue = new LinkedList<>();
        for (int city : cities) {
            queue.add(new Move(city, 0, new ArrayList<>()));
        }
        while (!queue.isEmpty()) {
            Move move = queue.removeFirst();
            move.visited.add(move.node);
            if (move.visited.size() == r) {
                if (move.cost < minCost) {
                    minCost = move.cost;
                }
            }

            for (int i = 0; i < n; i++) {
                int nextCost = matrix[move.node][i];
                if (nextCost != INF && cities.contains(i) && !move.visited.contains(i)) {
                    queue.add(new Move(i, move.cost + nextCost, new ArrayList<>(move.visited)));
                }
            }
        }

        System.out.println(minCost);
    }
}
