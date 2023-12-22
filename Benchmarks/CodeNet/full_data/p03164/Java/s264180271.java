import java.util.*;

public class Main {

    public static void main(String[] args) {
        Problems problems = new Problems();
//        System.out.println("Problem A: Flog 1");
//        problems.problemA_Flog1();
//        System.out.println("Problem B: Flog 2");
//        problems.problemB_Flog2();
//        problems.problemC_Vacation();
//        problems.problemD_Knapsack1();
        problems.problemE_Knapsack2();
    }
}

class Problems {
    public static void problemA_Flog1() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] h = new int[N];
        for (int i=0; i<N; i++) {
            h[i] = sc.nextInt();
        }
        int[] C = new int[N];
        C[0] = 0; C[1] = Math.abs(h[0]-h[1]);
        if (N == 2) {
            System.out.println(C[1]);
            return;
        }
        for (int i=2; i<N; i++) {
            C[i] = Math.min(C[i-2]+Math.abs(h[i]-h[i-2]),
                    C[i-1]+Math.abs(h[i]-h[i-1]));
        }
        System.out.println(C[N-1]);
    }

    public static void problemB_Flog2() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] h = new int[N];
        for (int i=0; i<N; i++) {
            h[i] = sc.nextInt();
        }
        int[] C = new int[N];
        C[0] = 0; C[1] = Math.abs(h[0]-h[1]);
        if (N == 2) {
            System.out.println(C[1]);
            return;
        }
        for (int i=2; i<N; i++) {
            int len = Math.min(K,i);
            int[] Carray = new int[len];
            for (int k = 0; k < len; k++) {
                Carray[k] = C[i-len+k]+Math.abs(h[i]-h[i-len+k]);
            }
            C[i] = Arrays.stream(Carray).min().getAsInt();
        }
        System.out.println(C[N-1]);
    }

    static void problemC_Vacation() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] lastA = new int[N+1];
        int[] lastB = new int[N+1];
        int[] lastC = new int[N+1];
        lastA[0] = 0; lastB[0] = 0; lastC[0] = 0;
        for (int i = 0; i<N; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();

            lastA[i+1] = Math.max(lastB[i]+A[i],lastC[i]+A[i]);
            lastB[i+1] = Math.max(lastA[i]+B[i],lastC[i]+B[i]);
            lastC[i+1] = Math.max(lastA[i]+C[i],lastB[i]+C[i]);
        }
        System.out.println(Math.max(lastA[N],Math.max(lastB[N],lastC[N])));
    }

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
//                System.out.print("V["+i+"][" + w + "] = " + V[i][w] + "  ");
            }
//            System.out.println();
        }
        System.out.println(V[N][W]);
    }

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

        // initialisation: without any, the problem is infeasible
        for (int v = 1; v <= V_MAX; v++)
            DP[0][v] = Integer.MAX_VALUE;  // set infinity weight
        DP[0][0] = 0; // if no items are chosen -> weight is zero
        
        // loop for dp
        for (int i=1; i <= N; i++) {
            for (int v=1; v <= V_MAX; v++) {
                DP[i][v] = DP[i-1][v];
                // when we can include the item
                if (v >= value[i-1]) {
                    // whether include item i or not
                    DP[i][v] = Math.min(DP[i-1][v], DP[i - 1][v - value[i - 1]] + weight[i - 1]);
                }
//                System.out.print("DP[" + i + "][" + v + "] = "+ DP[i][v] + " ");
            }
//            System.out.println("");
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