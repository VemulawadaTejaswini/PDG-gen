import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        int NUM = 1000000;
        int[] one = new int[NUM];
        int[] zero = new int[NUM];

        int oneIndex = 0;
        int zeroIndex = 0;

        if (S.charAt(0) != '0') {
            zero[zeroIndex++] = 0;
        }

        int i = 0;
        while (i < S.length()) {
            if (S.charAt(i) == '0') {
                int cnt = 0;
                while (i < S.length() && S.charAt(i) == '0') {
                    cnt++;
                    i++;
                }
                zero[zeroIndex++] = cnt;
            } else {
                int cnt = 0;
                while (i < S.length() && S.charAt(i) == '1') {
                    cnt++;
                    i++;
                }
                one[oneIndex++] = cnt;
            }
        }

        oneIndex = 0;
        zeroIndex = 0;
        long ans = 0;

        int tmpK = K;
        while (tmpK-- > 0 && zero[zeroIndex] != -1 && one[oneIndex] != -1) {
            ans += one[oneIndex++];
            ans += zero[zeroIndex++];
        }

        long tmp = ans;
        while (oneIndex < NUM && zeroIndex < NUM) {
            if (oneIndex - K - 1 >= 0) {
                tmp -= one[oneIndex - K - 1];
            }
            tmp -= zero[zeroIndex - K];

            tmp += one[oneIndex++];
            tmp += zero[zeroIndex++];

            ans = Math.max(ans, tmp);
        }

        out.print(ans);
    }
}
