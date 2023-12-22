import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        int NUM = 100001;
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

        int index = 0;
        int tmpK = K;
        long ans = 0;
        while (tmpK-- > 0) {
            ans += one[index];
            ans += zero[index];
            index++;
        }

        long tmp = ans;
        while (index < NUM) {
            if(index - K - 1 >= 0) {
                tmp -= one[index - K - 1];
            }
            tmp -= zero[index - K];
            tmp += one[index] + zero[index];

            ans = Math.max(ans, tmp);
            index++;
        }

        out.print(ans);
    }
}