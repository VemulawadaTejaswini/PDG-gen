import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[2 * N - 1];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        int high = 2 * N - 1;
        int low = 0;
        int[] b = new int[a.length];
        while ((high - low) > 1) {
            int mid = (high + low) / 2;
            for (int i = 0; i < a.length; ++i) {
                b[i] = a[i] <= mid ? 0 : 1;
            }
            if (go(b)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        out.println(high);
        out.flush();
    }
    private static boolean go(int[] b) {
        int len = b.length;
        int[] tmp = new int[len];
        while (len > 1) {
            len -= 2;
            for (int i = 0; i < len; ++i) {
                tmp[i] = b[i] + b[i + 1] + b[i + 2];
                if (tmp[i] <= 1) {
                    tmp[i] = 0;
                } else {
                    tmp[i] = 1;
                }
            }
            b = tmp;
        }
        return b[0] == 0;
    }
    private static int mid(int a1, int a2, int a3) {
        if (a1 <= a2 && a2 <= a3) {
            return a2;
        } else if (a2 <= a1 && a1 <= a3) {
            return a1;
        } else {
            return a3;
        }
    }
}