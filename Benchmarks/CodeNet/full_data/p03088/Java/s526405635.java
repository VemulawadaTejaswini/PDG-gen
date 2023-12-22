import java.util.*;

import static java.lang.System.*;

public class Main {
    final static long mod = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // i番目まで見たとき、３つ前の文字、２つ前の文字、1つ前の文字で条件に違反していない組み合わせ数
        // 文字は、0: 'A', 1: 'C', 2: 'G', 3: 'T';
        long[][][][] dp = new long[N][4][4][4];

        char[] chars = new char[]{'A', 'C', 'G', 'T'};
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);

        for (char c1 : chars) {
            for (char c2 : chars) {
                for (char c3 : chars) {
                    if (!isLegal(c1, c2, c3)) {
                        dp[2][map.get(c1)][map.get(c2)][map.get(c3)] = 1;
                    }
                }
            }
        }

        for (int i = 3; i < N; i++) {
            for (char c1 : chars) {
                for (char c2 : chars) {
                    for (char c3 : chars) {
                        for (char c4 : chars) {
                            if (!isLegal(c2, c3, c4) && !isLegal2(c1, c2, c4) && !isLegal2(c1, c3, c4)) {
                                dp[i][map.get(c2)][map.get(c3)][map.get(c4)] += dp[i - 1][map.get(c1)][map.get(c2)][map.get(c3)];
                                dp[i][map.get(c2)][map.get(c3)][map.get(c4)] %= mod;
                            }
                        }
                    }
                }
            }
        }

        long ans = 0;
        for (int c1 = 0; c1 < 4; c1++) {
            for (int c2 = 0; c2 < 4; c2++) {
                for (int c3 = 0; c3 < 4; c3++) {
                    ans += dp[N - 1][c1][c2][c3];
                    ans %= mod;
                }
            }
        }

        out.println(ans);
    }

    public static boolean isLegal(char c1, char c2, char c3) {
        if ((c1 == 'A' && c2 == 'C' && c3 == 'G') ||
                (c1 == 'A' && c2 == 'G' && c3 == 'C') ||
                (c1 == 'G' && c2 == 'A' && c3 == 'C')) {
            return true;
        }
        return false;
    }

    public static boolean isLegal2(char c1, char c2, char c3) {
        if(c1 == 'A' && c2 == 'G' && c3 == 'C'){
            return true;
        }
        return false;
    }
}