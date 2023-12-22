import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        int c = scan.nextInt();
        int[][] d = new int[c][c];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                d[i][j] = scan.nextInt();
            }
        }
        int[][] g = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = scan.nextInt() - 1;
            }
        }
        Main main = new Main();
        System.out.println(main.solve(n, c, d, g));
    }
    public int solve(int n, int c, int[][] d, int[][] g) {
        if (n == 1) {
            return 0;
        }
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (!map.containsKey((i+j) % 3)) {
                    Map<Integer, Integer> t = new HashMap<>();
                    map.put((i+j) % 3, t);
                }
                Map<Integer, Integer> entry = map.get((i+j) % 3);
                if (!entry.containsKey(g[i][j])) {
                    entry.put(g[i][j], 0);
                }
                Integer count = entry.get(g[i][j]);
                entry.put(g[i][j], count+1);
            }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < c; i++) {
            int i_diff = subAnswer(d, map.get(0), i);
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    continue;
                }
                int j_diff = subAnswer(d, map.get(1), j);
                for (int k = 0; k < c; k++) {
                    if (i == k || j == k) {
                        continue;
                    }
                    int k_diff = subAnswer(d, map.get(2), k);
                    answer = Math.min(answer, i_diff + j_diff + k_diff);
                }
            }
        }
        return answer;
    }
    public int subAnswer(int[][] d, Map<Integer, Integer> base, int color) {
        int diff = 0;
        for(int i : base.keySet()) {
            if (i == color) {
                continue;
            }
            int count = base.get(i);
            diff += count * d[i][color];
        }
        return diff;
    }

}
