import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int cm = in.nextInt();
            int[] s = new int[n];
            int[] e = new int[n];
            int[] c = new int[n];

            for (int i = 0; i < n; i++) {
                s[i] = in.nextInt();
                e[i] = in.nextInt();
                c[i] = in.nextInt();
            }

            int[] recordingMachines = new int[100001];
            for (int i = 0; i < 100001; i++) recordingMachines[i] = 0;

            for (int i = 1; i <= cm; i++) {
                int[] onAir = new int[100002];
                for (int j = 0; j < n; j++) {
                    if (c[j] == i) {
                        onAir[s[j]]++;
                        onAir[e[j] + 1]--;
                    }
                }
                for (int j = 1; j < onAir.length; j++) {
                    onAir[j] += onAir[j - 1];
                }
                for (int j = 0; j < recordingMachines.length; j++) {
                    if (onAir[j] >= 1) recordingMachines[j]++;
                }
            }


            int ans = 0;
            for (int i = 0; i < recordingMachines.length; i++) {
                if (recordingMachines[i] > ans) ans = recordingMachines[i];
            }

            out.println(ans);
        }

    }
}

