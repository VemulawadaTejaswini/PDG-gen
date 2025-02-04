//package atcoder.dpContest;

import java.io.*;
import java.util.*;

public class Main {
    private static double[][][] ev;
    private static double[][][] p;
    private static boolean[][][] visited;
    public static void main(String[] args) {
//        try {
//            FastScanner in = new FastScanner(new FileInputStream("src/input.in"));
//            PrintWriter out = new PrintWriter(new FileOutputStream("src/output.out"));

        FastScanner in = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

            solve(1, in, out);

//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private static void solve(int q, FastScanner in, PrintWriter out) {
        for (int qq = 0; qq < q; qq++) {
            int N = in.nextInt();
            int[] a = new int[N];
            int sum = 0, ones = 0, twos = 0, threes = 0;
            for(int i = 0; i < N; i++) {
                a[i] = in.nextInt();
                sum += a[i];
                if(a[i] == 1) {
                    ones++;
                }
                else if(a[i] == 2) {
                    twos++;
                }
                else {
                    threes++;
                }
            }

            ev = new double[N + 1][N + 1][N + 1];    //ev[i][j][k]: the expected number of operations to go from state(i, j, k) to state(0, 0, 0)
            p = new double[N + 1][N + 1][N + 1];     //p[i][j][k]: the probability of getting from state(i, j, k) to state(0, 0, 0)
            visited = new boolean[N + 1][N + 1][N + 1];
            p[0][0][0] = 1.0;
            ev[0][0][0] = 0.0;
            visited[0][0][0] = true;

            out.println(sushiHelper(N, ones, twos, threes));
        }
        out.close();
    }

    private static double sushiHelper(int N, int ones, int twos, int threes) {
//        if(ones == 0 && twos == 0 && threes == 0) {
//            return ev[0][0][0];
//        }
        if(visited[ones][twos][threes]) {
            return ev[ones][twos][threes];
        }
        //there are N - ones - twos - threes empty dishes
        double p_waste = (double)(N - ones - twos - threes) / N;
        double ev_waste = p_waste / (1 - p_waste);
        ev[ones][twos][threes] += ev_waste;

        if(ones > 0) {
            ev[ones][twos][threes] += sushiHelper(N, ones - 1, twos, threes) * ones / (ones + twos + threes);
        }
        if(twos > 0) {
            ev[ones][twos][threes] += sushiHelper(N, ones + 1, twos - 1, threes) * twos / (ones + twos + threes);
        }
        if(threes > 0) {
            ev[ones][twos][threes] += sushiHelper(N, ones, twos + 1, threes - 1) * threes / (ones + twos + threes);
        }
        ev[ones][twos][threes] += 1;
        visited[ones][twos][threes] = true;
        return ev[ones][twos][threes];

//        double p_waste = (double)(N - ones - twos - threes) / N;
//        ev[ones][twos][threes] = 1 + ()
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}


