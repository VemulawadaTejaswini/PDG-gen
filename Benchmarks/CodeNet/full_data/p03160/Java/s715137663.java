import java.util.Scanner;

class Problem {
    int N;
    int[] hs;

    Problem() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        hs = new int[N];
        for (int i = 0; i < hs.length; i++) {
            hs[i] = sc.nextInt();
        }
    }

    int solve() {
        int prev1 = 0;
        int prev2 = 0;
        for(int i = 1; i < N; i++) {
            int minCost = Math.abs(hs[i] - hs[i-1]) + prev1;
            if (i - 2 >= 0) {
                int cost = Math.abs(hs[i] - hs[i-2]) + prev2;
                minCost = Math.min(minCost, cost);
            }
            prev2 = prev1;
            prev1 = minCost;
        }

        return prev1;
    }
}

public class Main {
    public static void main(String[] args) {
        int ans = new Problem().solve();
        System.out.println(ans);
    }
}
