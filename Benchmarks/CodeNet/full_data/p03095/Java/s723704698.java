
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        final String s = sc.nextLine();
        final int combinations = (int) Math.pow(2, 26) - 1;
        final long[] dp = new long[combinations];
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            final char c = s.charAt(i);
            count[c - 97]++;
        }
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                b.append("1");
            } else {
                b.append("0");
            }
        }
        final int target = Integer.parseInt(b.toString(), 2);
        long result = 0;
        for (int i = 1; i <= combinations; i++) {
            if ((target & i) == i) {
                //has combination
                long r = 1;
                int tindex = (int) Math.pow(2, 25);
                int tmpIndex = 0;
                for (int i1 = 25; i1 >= 0; i1--) {
                    if ((tindex & i) == tindex) {
                        if (dp[tmpIndex + tindex] != 0) {
                            r = dp[tmpIndex + tindex];
                        } else {
                            r = (r * count[25 - i1]) % 1_000_000_007;
                            dp[tmpIndex + tindex] = r;
                        }
                        tmpIndex += tindex;
                    }
                    tindex >>= 1;
                }
                result += r;
                result %= 1_000_000_007;
            }
        }
        System.out.println(result);
    }
}
