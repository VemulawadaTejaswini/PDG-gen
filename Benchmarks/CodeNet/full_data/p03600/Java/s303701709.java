import java.util.*;

public class Main {
//    private static final String ex = "5\n" +
//            "0 21 18 11 28\n" +
//            "21 0 13 10 26\n" +
//            "18 13 0 23 13\n" +
//            "11 10 23 0 17\n" +
//            "28 26 13 17 0";
//    private static final String ex = "3\n" +
//        "0 1 3\n" +
//        "1 0 2\n" +
//        "3 2 0";
    private static final String ex = "3\n" +
        "0 1 3\n" +
        "1 0 1\n" +
        "3 1 0";
//    private static final String ex = "3\n" +
//        "0 1000000000 1000000000\n" +
//        "1000000000 0 1000000000\n" +
//        "1000000000 1000000000 0";

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
//        System.out.println(solve(new Scanner(ex)));
    }

    private static long solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.nextLine());

        long[][] graph = new long[N][N];
        for (int i = 0; i < N; i ++) {
            String[] split = scanner.nextLine().split(" ");
            for (int j = 0; j < N; j ++) {
                graph[i][j] = Long.parseLong(split[j]);
            }
        }

        long result = 0;
        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < N; j ++) {
                Set<Long> set = new HashSet<>();
                long minI = Long.MAX_VALUE;
                for (int k = 0; k < N; k ++) {
                    if (i == k) continue;

                    set.add(graph[i][k]);
                    minI = Math.min(minI, graph[i][k]);
                }
                long minJ = Long.MAX_VALUE;
                boolean flag = false;
                for (int k = 0; k < N; k ++) {
                    if (j == k) continue;

                    if (set.contains(graph[i][j] - graph[k][j])) {
                        flag = true;
                    }
                    minJ = Math.min(minJ, graph[k][j]);
                }
                if (minI + minJ > graph[i][j]) {
                    result += graph[i][j];
                } else if (!flag) return -1;
            }
        }

        return result / 2;
    }
}
