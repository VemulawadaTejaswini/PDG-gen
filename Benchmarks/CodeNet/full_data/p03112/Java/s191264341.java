import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
*/public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		Scanner in = new Scanner(inputStream);
		PrintWriter out = new PrintWriter(outputStream);
		TaskD solver = new TaskD();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskD   {
public void solve(int testNumber, Scanner in, PrintWriter out) {

        int A = in.nextInt();
        int B = in.nextInt();
        int Q = in.nextInt();
        long s[] = new long[A];
        long t[] = new long[B];
        long x[] = new long[Q];
        for (int i = 0; i < A; i++) {
            s[i] = in.nextLong();
        }
        for (int i = 0; i < B; i++) {
            t[i] = in.nextLong();
        }
        for (int i = 0; i < Q; i++) {
            x[i] = in.nextLong();
        }

        for (int i = 0; i < Q; i++) {
            long ans = 1_000_000_000_000L;
            int jm = binary_search(x[i], 0, s);
            int ju = binary_search(x[i], 1, s);
            int tm = binary_search(x[i], 0, t);
            int tu = binary_search(x[i], 1, t);

            if (jm != A && tm != B && jm != -1 && tm != -1) {
                ans = min(ans, max(s[jm]-x[i], t[tm]-x[i]));
            }
            if (ju != A && tu != B && ju != -1 && tu != -1) {
                ans = min(ans, max(x[i]-s[ju], x[i]-t[tu]));
            }
            if (jm != A && tu != B && jm != -1 && tu != -1) {
                ans = min(ans, 2 * (s[jm] - x[i]) + (x[i] - t[tu]));
                ans = min(ans, (s[jm] - x[i]) + 2 * (x[i] - t[tu]));
            }
            if (ju != A && tm != B && ju != -1 && tm != -1) {
                ans = min(ans, 2 * (x[i]-s[ju]) + (t[tm] - x[i]));
                ans = min(ans, (x[i]-s[ju]) + 2 * (t[tm] - x[i]));
            }
            out.println(ans);
        }
    }

boolean isOK(int index, long key, long[] a) {
        if (a[index] >= key) return true;
        else return false;
    }

boolean isOK2(int index, long key, long[] a) {
        if (a[index] <= key) return true;
        else return false;
    }

int binary_search(long key, int ver, long[] a) {
        int ng = -1;
        int ok = (int)a.length;
        if(ver == 1){
            ok = -1;
            ng = (int)a.length;
        }
        while (Math.abs(ok - ng) > 1) {
            int mid = (ok + ng) / 2;
            if(ver == 1){
                if (isOK2(mid, key, a)) ok = mid;
                else ng = mid;
            } else {
                if (isOK(mid, key, a)) ok = mid;
                else ng = mid;
            }
        }
        return ok;
    }

long min(long a1, long a2) {
        if(a1 <= a2) return a1;
        return a2;
    }

long max(long a1, long a2) {
        if(a1 >= a2) return a1;
        return a2;
    }

}
}

