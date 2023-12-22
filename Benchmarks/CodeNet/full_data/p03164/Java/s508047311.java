import java.util.*;

public class Main {

    public static void main(String[] args) {
        Problems problems = new Problems();
        problems.problemE_Knapsack2();
    }
}

class Problems {
    void problemE_Knapsack2() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        long[] weight = new long[N];
        int[] value = new int[N];
        int V_MAX = 0; // possible maximum value we can take
        // read data
        for (int i = 0; i < N; i++ ){
            weight[i] = sc.nextLong();
            value[i] = sc.nextInt();
            V_MAX+=value[i];
        }

        // create dp function
        // DP[i][v] : min weight that achieves value v with item 1 ~ i
        long[][] DP = new long[N+1][V_MAX + 1];

        // initialisation: without any item, the problem is infeasible
        for (int v = 1; v <= V_MAX; v++)
            DP[0][v] = Integer.MAX_VALUE;  // set infinity weight
        DP[0][0] = 0; // if no value is required -> weight is zero

        // loop for dp
        for (int i=1; i <= N; i++) {
            for (int v=1; v <= V_MAX; v++) {
                DP[i][v] = DP[i-1][v];
                // when we can include the item
                if (v >= value[i-1]) {
                    // whether include item i or not
                    DP[i][v] = Math.min(DP[i-1][v], DP[i - 1][v - value[i - 1]] + weight[i - 1]);
                }
            }
        }

        // loop for ans
        for (int v = V_MAX; v>=0; v--) {
            // stop when DP is equal or smaller than W
            if (DP[N][v] <= W) {
                System.out.println(v);
                return;
            }
        }
    }
}