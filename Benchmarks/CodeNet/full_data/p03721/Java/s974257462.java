package AtCoder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.io.PrintWriter;

public class TaskC {
    long[] arr = new long[100000+1];
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        for (int i = 0; i < n; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            arr[a] += b;
        }
        for (int i = 1; i <= 100000; ++i) {
            if (k > arr[i])
                k -= arr[i];
            else {
                out.println(i);
                break;
            }
        }
    }
}
