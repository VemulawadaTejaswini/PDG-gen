import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskAFG011A solver = new TaskAFG011A();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAFG011A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int c = in.nextInt();
            int k = in.nextInt();

            int[] t = new int[n];
            for (int i = 0; i < n; i++) {
                t[i] = in.nextInt();
            }

            Arrays.sort(t);

            int index = 0;
            int currBus = 0;

            while (index < n) {
                currBus++;
                int currBusCap = 0;

                int earliestTime = t[index];
                int currTime = earliestTime;

                while (currBusCap < c && currTime <= earliestTime + k) {
                    currBusCap++;
                    index++;

                    if (index == n) break;
                    currTime = t[index];
                }
            }
            System.out.println(currBus);
        }
    }
}

