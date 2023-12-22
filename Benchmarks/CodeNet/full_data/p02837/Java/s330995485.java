import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            int[] A = new int[N + 1];
            int[][] X = new int[N + 1][N + 1];
            int[][] Y = new int[N + 1][N + 1];

            for (int i = 1; i <= N; i++) {
                A[i] = sc.nextInt();
                for (int j = 1; j <= A[i]; j++) {
                    X[i][j] = sc.nextInt();
                    Y[i][j] = sc.nextInt();
                }
            }

            int ans = 0;

            for (int i = 1; i <= N; i++) {
                int ans2 = 1;

                boolean[] check = new boolean[N + 1];
                check[i] = true;

                Set<Integer> unkind = new HashSet<>();

                ArrayDeque<Integer> queue = new ArrayDeque<>();
                queue.add(i);

                while (!queue.isEmpty()) {
                    Integer p = queue.poll();

                    for (int j = 1; j <= A[p]; j++) {
                        int x = X[p][j];

                        if (Y[p][j] == 1) {
                            if (unkind.contains(x)) {
                                ans2 = -1;
                                queue.clear();
                                break;
                            }

                            if (!check[x]) {
                                check[x] = true;
                                queue.push(x);
                                ans2++;
                            }
                        } else {
                            unkind.add(x);
                        }
                    }
                }

                ans = Math.max(ans, ans2);
            }

            System.out.println(ans);
        }
    }

}
