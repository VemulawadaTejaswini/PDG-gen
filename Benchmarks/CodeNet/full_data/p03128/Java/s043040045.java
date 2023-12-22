import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nm = scanner.nextLine().split(" ", 2);
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[] dispatch = { 0, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

        String[] line = scanner.nextLine().split(" ", m);
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = Integer.parseInt(line[i]);
        }

        int[][] dp = new int[n+1][1];
        int[] dpSize = new int[n+1];
        dynamicProgramming(dp, dpSize, 0, n, m, nums, dispatch);
        for (int i = 0; i < dpSize[n]; i++) {
            System.out.print(dp[n][i]);
        }
        System.out.print("\n");
    }

    private static void dynamicProgramming(int[][] dp, int[] dpSize, int i, int n, int m, int[] nums, int[] dispatch) {
        int remaining = n - i;
        for (int j = 0; j < m; j++) {
            int num = nums[j];
            int willUse = dispatch[num];
            if (willUse > remaining) continue;
            if (i + willUse > n) continue;

            /* next num */
            int nextSize = dpSize[i] + 1;
            int[] next = new int[nextSize];
            boolean numUsed = false;
            int nextInd = 0;
            for (int dpInd = 0; dpInd < dpSize[i]; dpInd++) {
                if (numUsed) {
                    next[nextInd] = dp[i][dpInd];
                    nextInd++;
                } else {
                    if (num > dp[i][dpInd]) {
                        next[nextInd] = num;
                        nextInd++;
                        next[nextInd] = dp[i][dpInd];
                        nextInd++;
                        numUsed = true;
                    } else {
                        next[nextInd] = dp[i][dpInd];
                        nextInd++;
                    }
                }
            }
            if (!numUsed) {
                next[nextInd] = num;
            }

            if (compare(dp[i + willUse], dpSize[i + willUse], next, nextSize) < 0) {
                dp[i + willUse] = next;
                dpSize[i + willUse] = nextSize;
                dynamicProgramming(dp, dpSize, i + willUse, n, m, nums, dispatch);
            }
        }
    }

    private static int compare(int[] a, int aSize, int[] b, int bSize) {
        if (aSize != bSize) {
            return aSize - bSize;
        } else {
            for (int i = 0; i < aSize; i++) {
                if (a[i] != b[i]) {
                    return a[i] - b[i];
                }
            }
            return 0;
        }
    }
}
