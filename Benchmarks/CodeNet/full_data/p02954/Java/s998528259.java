import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String S = sc.next();
        sc.close();

        int N = S.length();
        char[] s = new char[N];
        s = S.toCharArray();
        long[] num = new long[N];
        for (int i = 0; i < N; i++) {
            num[i] = 1;
        }

        long count = 0;
        long[] temp = new long[N];
        while(count < Math.pow(10, 100)) {
            System.arraycopy(num, 0, temp, 0, num.length);
            for (int i = 0; i < N-1; i++) {
                if (s[i] == 'R' && s[i+1] == 'R') {
                    if (i < N - 2) {
                        num[i+2] += num[i];
                    }
                    num[i] = 0;
                }
            }
            for (int i = 1; i < N; i++) {
                if (s[i] == 'L' && s[i-1] == 'L') {
                    if (i >= 2) {
                        num[i-2] += num[i];
                    }
                    num[i] = 0;
                }
            }
            if (Arrays.equals(num, temp)) {
                break;
            }
            count ++;
        }

        for (int i = 0; i < N; i++) {
            if (i != 0) {
                out.printf(" ");
            }
            out.printf("%d", num[i]);
        }
        out.printf("\n");
        out.flush();
    }
}
