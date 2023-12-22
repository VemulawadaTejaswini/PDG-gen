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
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = 1;
        }

        long count = 0;
        int[] odd = new int[N];
        int[] even = new int[N];
        while(count < Math.pow(10, 100)) {
            Arrays.fill(odd, 0);
            for (int i = 0; i < N; i++) {
                if (s[i] == 'R') {
                    odd[i + 1] += num[i];
                } else {
                    odd[i - 1] += num[i];
                }
            }

            Arrays.fill(even, 0);
            for (int i = 0; i < N; i++) {
                if (s[i] == 'R') {
                    even[i + 1] += odd[i];
                } else {
                    even[i - 1] += odd[i];
                }
            }
            if (Arrays.equals(num, even)) {
                break;
            }
            System.arraycopy(even, 0, num, 0, num.length);
            count ++;
        }

        for (int i = 0; i < N; i++) {
            if (i != 0) {
                out.printf(" ");
            }
            out.printf("%d", even[i]);
        }
        out.printf("\n");
        out.flush();
    }
}
