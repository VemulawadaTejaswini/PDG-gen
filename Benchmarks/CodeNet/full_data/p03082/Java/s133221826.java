import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D_ModuloOperations solver = new D_ModuloOperations();
        solver.solve(1, in, out);
        out.close();
    }

    static class D_ModuloOperations {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            final int MOD = (int) (1e9 + 7);
            int n = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);

            int[][] d = new int[n + 1][x + 1];
            for (int v = 0; v <= x; v++) {
                d[0][v] = v;
            }

//		int[][] C = new int[n + 1][n + 1];
//		C[0][0] = 1;
//		for (int i = 1; i < C.length; i++) {
//			C[i][0] = 1;
//			for (int j = 1; j < C.length; j++) {
//				C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % MOD;
//			}
//		}
//		int[] fact = new int[n + 1];
//		fact[0] = 1;
//		for (int i = 1; i < fact.length; i++) {
//			fact[i] = (int)((long)i * fact[i - 1] % MOD);
//		}
//		boolean[] reachable = new boolean[x + 1];
//		reachable[x] = true;
//		int[] q = new int[x + 1];
//		int qt = 0;
//		int qh = 1;
//		q[0] = x;
//		while (qt < qh) {
//		    int v = q[qt++];
//		    for (int i = 0; i < n; i++) {
//		        int nv = v % a[i];
//		        if (!reachable[nv]) {
//		            reachable[nv] = true;
//		            q[qh++] = nv;
//                }
//            }
//        }
//        System.out.println("reachable " + qh);
//		for (int j = 0; j <= n; j++) {
//			for (int v = 0; v <= x; v++) {
//			    if (!reachable[v]) {
//			        continue;
//                }
//				for (int i = j + 1; i <= n; i++) {
//					int nv = v % a[j];
//					d[i][v] = (int)((d[i][v] + (long)C[i - 1][i - j - 1] * fact[i - j - 1] % MOD * d[j][nv]) % MOD);
//				}
//			}
//		}

            for (int i = 1; i <= n; i++) {
                for (int v = 0; v <= x; v++) {
                    d[i][v] += d[i - 1][v % a[i - 1]];
                    d[i][v] %= MOD;
                    d[i][v] += (long) d[i - 1][v] * (i - 1) % MOD;
                    d[i][v] %= MOD;
                }
            }

            out.println(d[n][x]);
        }

    }

    static class FastScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public FastScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

