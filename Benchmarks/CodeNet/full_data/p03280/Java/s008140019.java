package main;

import net.egork.io.InputReader;
import net.egork.io.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int A = in.readInt();
        int B = in.readInt();
        out.print((A - 1) * (B - 1));
    }
}
