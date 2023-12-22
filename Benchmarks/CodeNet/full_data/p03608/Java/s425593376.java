

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    // TODO solve
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        final int r = scanner.nextInt();

        final int[] toVisit = new int[r];
        for (int i = 0; i < r; i++) {
            toVisit[i] = scanner.nextInt() - 1;
        }

        final int[][] graph = new int[n][n];
        for (final int[] array : graph) {
            Arrays.fill(array, Integer.MAX_VALUE);
        }

        for (int i = 0; i < n; i++) {
            graph[i][i] = 0;
        }

        for (int i = 0; i < m; i++) {
            final int a = scanner.nextInt() - 1;
            final int b = scanner.nextInt() - 1;
            final int c = scanner.nextInt();

            graph[a][b] = c;
            graph[b][a] = c;
        }

        for (int i = 0; i < toVisit.length; i++) {
            final boolean[] isVisited = new boolean[r];
            isVisited[i] = true;
            permutation(toVisit, isVisited, toVisit[i], graph, 1, 0);
        }
        System.out.println(answer);
    }

    static int answer = Integer.MAX_VALUE;

    private static void permutation(final int[] toVisit, final boolean[] isVisited, final int current, final int[][] graph, final int index, final int sum) {
        if (index == isVisited.length) {
            answer = Math.min(answer, sum);
            return;
        }

        for (int i = 0; i < isVisited.length; i++) {
            if (isVisited[i]) {
                continue;
            }

            isVisited[i] = true;
            permutation(toVisit, isVisited, toVisit[i], graph, index + 1, sum + graph[current][toVisit[i]]);
            isVisited[i] = false;
        }
    }
/*
    private static void permutation(final int level, final int length, final Set<Integer> set, final int[] per, final int[][] min) {
        if (level == length) {
            int temp = 0;
            for (int i = 0; i < per.length - 1; i++) {
                temp += min[per[i]][per[i + 1]];
            }
            answer = Math.min(answer, temp);
            return;
        }

        for (final int element : set) {
            final Set<Integer> set2 = new HashSet<>(set);
            set2.remove(element);
            per[level] = element;
            permutation(level + 1, length, set2, per, min);
        }
    }
*/

    private static void warshallFloyd(final int[][] graph) {
        for (int k = 0; k < graph.length; k++) {
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph.length; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }
    }

    /*
    private static void dijkstra(final long[] distances, final int current, final int finalDestination, final Map<Integer, List<Destination>> graph, final PriorityQueue<Destination> queue) {
        if (distances[finalDestination] >= 0 || queue.isEmpty()) {
            return;
        }

        for (final Destination dest : graph.get(current)) {
            if (dest.city == current || distances[dest.city] >= 0) {
                continue;
            }

            queue.add(new Destination(dest.city, distances[current] + dest.distance));
        }

        Destination nextCity;
        while (distances[(nextCity = queue.poll()).city] >= 0) ;

        distances[nextCity.city] = nextCity.distance;
        dijkstra(distances, nextCity.city, finalDestination, graph, queue);
    }
    */

    static class Destination {
        int city;
        long distance;

        Destination(final int city, final long distance) {
            this.city = city;
            this.distance = distance;
        }
    }
}
