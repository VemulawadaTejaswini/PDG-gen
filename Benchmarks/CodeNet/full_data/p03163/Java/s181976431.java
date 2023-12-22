import java.util.*;

public class Main {

    public static void main(String[] args) {
        Problems problems = new Problems();
        problems.problemD_Knapsack1();
    }
}

class Problems {
    static void problemD_Knapsack1() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int[] weight = new int[N];
        long[] value = new long[N];
        for (int i = 0; i < N; i++ ){
            weight[i] = sc.nextInt();
            value[i] = sc.nextLong();
        }

        long[][] V = new long[N+1][W+1];
        for (int w = 0; w <= W; w++)
            V[0][w] = 0;
        if (N == 1) {
            if (weight[0] <= W) {
                System.out.println(value[0]);
                return;
            } else {
                System.out.println(0);
                return;
            }
        }
        for (int i = 1; i<=N; i++) {
            for (int w = 0; w <= W; w++) {
                if (weight[i-1] > w) // new item i is heavier than w -> not include i
                    V[i][w] = V[i-1][w];
                else
                    V[i][w] = Math.max(V[i-1][w],V[i-1][w-weight[i-1]] + value[i-1]);
            }
        }
        System.out.println(V[N][W]);
    }
}