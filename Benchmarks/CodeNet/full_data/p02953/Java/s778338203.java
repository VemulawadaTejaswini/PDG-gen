import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        System.out.println(solve(n, h));
    }

    public static String solve(int n, int[] h) {
        boolean[] checkLow = new boolean[500000000];
        boolean[] checkHigh = new boolean[500000000];
        for (int i = 0; i < n; i++) {
            int hi = h[i];
            if (hi > 500000000) {
                if (checkHigh[hi]) {
                    continue;
                }
            } else {
                if (checkLow[hi]) {
                    continue;
                }
            }

            for (int j = i + 1; j < n; j++) {
                int hj = h[j];
                if (hj <= hi - 2) {
                    return "No";
                }
            }
            if (hi > 500000000) {
                checkHigh[hi] = true;
            } else {
                checkLow[hi] = true;
            }

        }
        return "Yes";
    }
}

