import java.util.Scanner;

class Main {

    static int knapsack(int W, int N, int[] v, int[] w) {
        int[][] bag = new int[N + 1][W + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= W; j++) {
                if (i == 0 || j == 0) {
                    bag[i][j] = 0;
                } else if (w[i - 1] <= j) {
                    bag[i][j] = v[i - 1] + bag[i - 1][j - w[i - 1]] > bag[i - 1][j]
                            ? v[i - 1] + bag[i - 1][j - w[i - 1]]
                            : bag[i - 1][j];
                } else {
                    bag[i][j] = bag[i - 1][j];
                }
            }
        }
        return bag[N][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   
      	int W = sc.nextInt();
        int[] v = new int[N];
        int[] w = new int[N];
        int tmp;
        for (int i = 0; i < N; i++) {
            tmp = sc.nextInt();
            w[i] = tmp;
            tmp = sc.nextInt();
            v[i] = tmp;
        }
        System.out.print(knapsack(W, N, v, w));
    }
}
