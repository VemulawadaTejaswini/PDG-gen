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
 * @author Echizen
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int arr[] = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
                sum += arr[i];
            }
            // sort the arrays;
            Arrays.sort(arr);
            if (sum % 10 != 0) {
                out.println(sum);
            } else {
                for (int i = 0; i < arr.length; i++) {
//                sum = sum - arr[i];
                    if (arr[i] % 10 != 0) {
                        sum -= arr[i];
                        out.println(sum);
                        break;
                    }
                }
            }
            if (sum % 10 == 0) {
                out.println(0);
            }
        }

    }
}

