import java.util.*;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String[] strs = new String[N];
        // char[][] seq = new char[N][];
        // ArrayList<String> arr = new ArrayList<String>
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            strs[i] = sc.nextLine();
            char[] seq = strs[i].toCharArray();

            Arrays.sort(seq);
            strs[i] = new String(seq);
            // System.out.println(seq[i]);
        }
        Arrays.sort(strs);
        // combinationInit();
        long ans = 0;
        int lif = 0;
        // int[][] pkr = new int[N][27];
        for (int i = 1; i < N; i++) {
            if (strs[i].equals(strs[i - 1])) {
                // System.out.println(strs[i]);
                lif++;
            } else if (lif > 0) {
                ans += combination(lif + 1, 2);
                lif = 0;
            }
        }
        if (lif > 0) {
            ans += combination(lif + 1, 2);
            lif = 0;
        }

        System.out.println(ans);

    }

    static private long combination(long num1, long num2) {
        if (num2 == 0) {
            return 1;
        }
        return (num1 - num2 + 1) * combination(num1, num2 - 1) / num2;
    }
}