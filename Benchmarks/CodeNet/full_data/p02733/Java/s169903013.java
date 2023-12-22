import java.util.*;
import java.io.*;

public class Main {
    
    void solve(InputReader in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int X = in.nextInt();
        char[][] arr = new char[n][m];
        for (int i = 0; i < n; ++i) {
            char[] tmp = in.next().toCharArray();
            for (int j = 0; j < m; ++j) {
                arr[i][j] = tmp[j];
            }
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 1<<(n-1); i < (1<<n); ++i) {
            int cuts = 0;
            for (int k = 0; k < n - 1; ++k) {
                if ((i & (1<<k)) !=0) {
                    ++cuts;
                }
            }

            int[] cnt = new int[n];
            boolean skip = false;
            for (int j = 1; j <= m && !skip; ++j) {
                for (int k = 0; k < n; ++k) {
                    cnt[k] += arr[k][j-1] == '1' ? 1 : 0;
                }

                int sum = 0;
                boolean cut = false;
                for (int k = 0; k < n && !cut; ++k) {
                    sum += cnt[k];
                    if ((i & (1<<k)) !=0) {
                        if (sum > X) cut = true;
                        sum = 0;
                    }
                }

                if (cut) {
                    sum = 0;
                    for (int k = 0; k < n; ++k) {
                        cnt[k] = arr[k][j - 1] == '1' ? 1 : 0;
                        sum += cnt[k];
                        if (sum > X) {
                            skip = true;
                            break;
                        }
                        if ((i & (1<<k)) !=0) {
                            sum = 0;
                        }
                    }
                    ++cuts;
                }
            }

            if (!skip) {
                ans = Math.min(ans, cuts);
            }
        }
        out.println(ans);
    }


    public static void main(String[] args) throws Exception {
        InputReader in = new InputReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        Main solver = new Main();
        solver.solve(in, out);
        out.close();
    }

    static class InputReader {
        BufferedReader in;
        StringTokenizer st;

        public InputReader(InputStream is) {
        in = new BufferedReader(new InputStreamReader(is));
        }

        public String next() {
        try {
            while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine());
            }
            return st.nextToken();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }

        public int nextInt() {
        return Integer.parseInt(next());
        }

        public long nextLong() {
        return Long.parseLong(next());
        }
    }
    }
