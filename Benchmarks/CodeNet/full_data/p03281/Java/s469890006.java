package main.java.tasks;

import java.util.Scanner;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, Scanner in, PrintWriter out) {
        int N = Integer.parseInt(in.next());
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) continue;
            int cnt = 0;
            for (int j = 1; j <= N; j++) {
                if (i % j == 0) cnt++;
            }
            if (cnt == 8) {
                ans++;
            }
        }
        out.println(ans);
    }
}
