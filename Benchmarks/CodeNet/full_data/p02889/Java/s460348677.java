import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        int M = scan.nextInt();
        long L = scan.nextLong();
        long[][] distance = new long[N][N];
        int[][] via = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(distance[i], Long.MAX_VALUE);
            Arrays.fill(via[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < N; i++) {
            distance[i][i] = 0;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                via[i][j] = i;
            }
        }
        for (int i = 0; i < M; i++) {
            int from = scan.nextInt()-1;
            int to = scan.nextInt()-1;
            long d = scan.nextLong();
            if (d <= L) {
                distance[from][to] = d;
                distance[to][from] = d;
            }
        }
        int Q = scan.nextInt();
        int[][] query = new int[Q][2];
        for (int i = 0; i < Q; i++) {
            query[i][0] = scan.nextInt()-1;
            query[i][1] = scan.nextInt()-1;
        }
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (distance[i][k] == Long.MAX_VALUE || distance[k][j] == Long.MAX_VALUE) {
                        continue;
                    }
                    if (distance[i][k] + distance[k][j] < distance[i][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                        via[i][j] = k;
                    }
                }
            }
        }
        for (int i = 0; i < Q; i++) {
            int from = query[i][0];
            int to = query[i][1];
            long min_distance = distance[from][to];
            if (min_distance == Long.MAX_VALUE) {
                System.out.println(-1);
                continue;
            }
            if (min_distance <= L) {
                System.out.println(0);
                continue;
            }
            List<Long> routes = route(distance, via, from ,to);
            long answer = 0;
            long fuel = L;
            for (int j = 0; j < routes.size(); j++) {
                if (fuel < routes.get(j)) {
                    fuel += (L - fuel);
                    answer += 1;
                }
                fuel -= routes.get(j);
            }
            System.out.println(answer);
        }
    }
    private List<Long> route(long[][] distance, int[][] via, int from, int to) {
        int current = from;
        int goal = to;
        List<Long> route = new ArrayList<>();
        while (current != goal) {
            int prev = via[current][goal];
            if (prev == current) {
                prev = goal;
            }
            route.add(distance[current][prev]);
            current = prev;
        }
        return route;
    }
}
