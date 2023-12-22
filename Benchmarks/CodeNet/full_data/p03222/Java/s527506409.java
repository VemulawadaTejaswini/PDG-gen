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
        int H = in.nextInt();
        int W = in.nextInt();
        int K = in.nextInt();
        int m = 1_000_000_007;
        if (W == 1){
            if(K==1) out.println(1);
            else out.println(0);
        }
        else {
            long dp[][] = new long[H][W];
            int lex[] = new int[W - 1];
            int all = 0;
            for (int i = 0; i < Math.pow(2, W - 1); i++) {
                StringBuilder st = new StringBuilder();
                String num = Integer.toBinaryString(i);
                for (int j = 1; j <= W - 1 - num.length(); j++) {
                    st.append(0);
                }
                st.append(num);
                if (st.toString().contains("11")) continue;
                all++;
                for (int idx = 0; idx <= W - 2; idx++) {
                    if (st.charAt(idx) - '0' == 1) {
                        lex[idx]++;
                    }
                }
            }
            dp[0][0] = all - lex[0];
            dp[0][1] = lex[0];
            for (int ih = 1; ih <= H - 1; ih++) {
                dp[ih][0] = (dp[ih][0] + dp[ih - 1][0] * (all - lex[0])) % m;
                dp[ih][0] = (dp[ih][0] + dp[ih - 1][1] * lex[0]) % m;
                for (int iw = 1; iw <= W - 2; iw++) {
                    dp[ih][iw] = (dp[ih][iw] + dp[ih - 1][iw] * (all - lex[iw - 1] - lex[iw])) % m;
                    dp[ih][iw] = (dp[ih][iw] + dp[ih - 1][iw - 1] * lex[iw - 1]) % m;
                    dp[ih][iw] = (dp[ih][iw] + dp[ih - 1][iw + 1] * lex[iw]) % m;
                }
                dp[ih][W - 1] = (dp[ih][W - 1] + dp[ih - 1][W - 1] * (all - lex[W - 2])) % m;
                dp[ih][W - 1] = (dp[ih][W - 1] + dp[ih - 1][W - 2] * lex[W - 2]) % m;
            }
            out.println(dp[H - 1][K - 1]);
        }
    }

}
}

