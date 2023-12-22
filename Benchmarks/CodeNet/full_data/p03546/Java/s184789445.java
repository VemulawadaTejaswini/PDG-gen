import java.util.Scanner;

class Main {

    static int[][] cost = new int[10][10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt(), width = sc.nextInt();
        int[][] num = new int[height][width];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        long actual[] = new long[10];

        long sum = 0;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (num[i][j] == 1 || num[i][j] == -1) {
                    continue;
                } else if (actual[num[i][j]] != 0) {
                    sum += actual[num[i][j]];
                } else {
                    boolean[] visit = new boolean[10];
                    actual[num[i][j]] = search(num[i][j], 0, visit, cost[num[i][j]][1]);
                    sum += actual[num[i][j]];
                }
            }
        }
        System.out.println(sum);
    }

    private static long search(int num, long sum, boolean[] v, long direct) {
        boolean[] visit = new boolean[10];
        for (int i = 0; i < 10; i++) {
            visit[i] = v[i];
        }
        visit[num] = true;
        if (num == 1 || sum >= direct) {
            return sum;
        }
        long min = direct;
        for (int i = 0; i < 10; i++) {
            if (visit[i]) {
                continue;
            }
            long c = search(i, sum + cost[num][i], visit, direct);
            if (c < min) {
                min = c;
            }
        }
        return min;
    }
}
