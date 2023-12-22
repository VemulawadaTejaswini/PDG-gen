import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ACookieExchanges solver = new ACookieExchanges();
        solver.solve(1, in, out);
        out.close();
    }

    static class ACookieExchanges {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[] arr = new int[3];
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            arr[2] = in.nextInt();
            Arrays.sort(arr);
            if (arr[0] == arr[1] && arr[1] == arr[2]) {
                if (arr[0] % 2 == 0) {
                    out.println(-1);
                } else {
                    out.println(0);
                }
                return;
            }
            int cnt = 0;
            while (arr[0] % 2 != 1 && arr[1] % 2 != 1 && arr[2] % 2 != 1) {
                int temp1 = (arr[0] + arr[1]) / 2;
                int temp2 = (arr[0] + arr[2]) / 2;
                int temp3 = (arr[1] + arr[2]) / 2;
                arr[0] = temp1;
                arr[1] = temp2;
                arr[2] = temp3;
                Arrays.sort(arr);
                cnt++;
            }
            out.println(cnt);
        }

    }
}

