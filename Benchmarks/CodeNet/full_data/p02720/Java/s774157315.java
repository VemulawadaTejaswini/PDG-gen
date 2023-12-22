package abc.abc161;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int MOD = 1_000_000_007;
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        System.out.println(solve(K));
    }

    private static String solve(int K) {
        if (K <= 9) {
            return String.valueOf(K);
        }

        int total = 9;
        List<String>[] ans = new ArrayList[11];
        List<String>[] leading0 = new ArrayList[11];
        for (int i = 0; i < 11; i++) {
            ans[i] = new ArrayList<>();
            leading0[i] = new ArrayList<>();
        }
        for (long i = 1; i <= 9; i++) {
            ans[1].add(String.valueOf(i));
        }
        leading0[1].add(String.valueOf(0));

        for (int i = 1; i <= 9; i++) {
            for (String val : leading0[1]) {
                if (Math.abs(val.charAt(0) - '0' - i) <= 1) {
                    ans[2].add(i + val);
                }
            }
            for (String val : ans[1]) {
                if (Math.abs(val.charAt(0) - '0' - i) <= 1) {
                    ans[2].add(i + val);
                }
            }
        }
        if (K <= total + ans[2].size()) {
            /*
            for (int i=1; i<=10; i++) {
                System.err.print(i + "(" + ans[i].size() + "):");
                for (String val : ans[i]) {
                    System.err.print(" " + val);
                }
                System.err.println();
            }
             */

            return ans[2].get(K - total - 1);
        }
        total += ans[2].size();
        leading0[2].add("00");
        leading0[2].add("01");

        for (int k = 3; k <= 10; k++) {
            for (int i = 1; i <= 9; i++) {
                for (String val : leading0[k - 1]) {
                    if (Math.abs(val.charAt(0) - '0' - i) <= 1) {
                        ans[k].add(i + val);
                    }
                }

                for (String val : ans[k - 1]) {
                    if (Math.abs(val.charAt(0) - '0' - i) <= 1) {
                        ans[k].add(i + val);
                    }
                }
            }
            Collections.sort(ans[k]);

            if (K <= total + ans[k].size()) {
                /*
                for (int i=1; i<=10; i++) {
                    System.err.print(i + "(" + ans[i].size() + "):");
                    for (String val : ans[i]) {
                        System.err.print(" " + val);
                    }
                    System.err.println();
                }
                 */

                return ans[k].get(K - total - 1);
            }
            total += ans[k].size();
            for (String val : leading0[k-1]) {
                leading0[k].add("0" + val);
            }
            for (String val : ans[k-1]) {
                if (Math.abs(val.charAt(0) - '0') <= 1) {
                    leading0[k].add("0" + val);
                }
            }
        }

        return "-1";
    }
}