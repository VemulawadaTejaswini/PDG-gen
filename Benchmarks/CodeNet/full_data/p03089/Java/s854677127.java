

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] b = new int[n + 1];
        for (int i = 1; i <= n; ++i) {
            b[i] = scanner.nextInt();
        }
        int j = 0;
        int [] res = new int[n];
        int oldLen = n;
        for (int i = n; i >= 1;) {
            if (b[i] == i) {
              //  System.out.println("push: " + i);
                res[j] = i;
                ++j;
                delete(b, i, oldLen);
                --oldLen;
                i = oldLen;
            } else {
                --i;
            }
        }
        if (j != n) {
            System.out.println(-1);
            return;
        } else {
            for (int i = n - 1; i >= 0; --i) {
                System.out.println(res[i]);
            }
        }
    }

    public static void delete(int[] b, int i, int oldLen) {
        for (int j = i; j < oldLen; ++j) {
            b[j] = b[j + 1];
        }
    }
}
