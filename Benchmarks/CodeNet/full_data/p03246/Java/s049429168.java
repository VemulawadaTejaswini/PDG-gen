import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i=0; i<n; i++) {
            v[i] = sc.nextInt();
        }

        int ans = solve(n, v);

        System.out.println(ans);
    }

    private static int solve(int n, int[] v) {
        int[] hist = new int[100_001];
        int count = 0;

        for (int i = 0; i < n; i += 2) {
            hist[v[i]]++;
        }
        int[][] ans1 = top(hist);

        hist = new int[100_001];
        for (int i = 1; i < n; i += 2) {
            hist[v[i]]++;
        }
        int[][] ans2 = top(hist);

//        System.err.println(ans1[0][0] + "," + ans1[0][1] + " / " + ans1[1][0] + "," + ans1[1][1]);
//        System.err.println(ans2[0][0] + "," + ans2[0][1] + " / " + ans2[1][0] + "," + ans2[1][1]);

        if (ans1[0][1] != ans2[0][1]) {
            count = n - ans1[0][0] - ans2[0][0];
        } else {
            count = Math.min(n - ans1[0][0] - ans2[1][0], n - ans1[1][0] - ans2[0][0]); 
        }

        return count;
    }

    private static int[][] top(int[] hist) {
        int[][] ans = new int[2][2];
        for (int i=0; i<hist.length; i++) {
            if (hist[i] > 0) {
              if (hist[i] >= ans[0][0]) {
                  ans[1][0] = ans[0][0];
                  ans[1][1] = ans[0][1];

                  ans[0][0] = hist[i];
                  ans[0][1] = i;
              } else if (hist[i] > ans[1][0]) {
                  ans[1][0] = hist[i];
                  ans[1][1] = i;
              }
            }
        }

        return ans;
    }
}
