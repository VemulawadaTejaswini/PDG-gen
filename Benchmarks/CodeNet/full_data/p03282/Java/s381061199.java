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
		TaskC solver = new TaskC();
		solver.solve(1, in, out);
		out.close();
	}
static class TaskC   {
public void solve(int testNumber, Scanner in, PrintWriter out) {
        String S = in.next();
        long K = in.nextLong();
        int idx1 = 0;
        while (idx1 < S.length()) {
            if(S.charAt(idx1)-'0' != 1) break;
            idx1++;
        }
        if(K <= idx1) out.println(1);
        else{
            char ans = S.charAt(idx1);
            out.println(ans);
        }
    }

}
}

