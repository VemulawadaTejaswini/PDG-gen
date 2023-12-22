import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (InputReader in = new InputReader(); PrintWriter out = new PrintWriter(System.out)) {
            new Main().solve(in, out);
            out.flush();
        }
    }

    void solve(InputReader in, PrintWriter out) {
        int N = in.nextInt();
        int M = in.nextInt();
        int[] ks = new int[M];
        int[][] ss = new int[M][N];
        for (int i = 0; i < M; i++) {
            ks[i] = in.nextInt();
            for (int j = 0; j < ks[i]; j++) {
                ss[i][j] = in.nextInt() - 1;
            }
        }

        int[] p = new int[M];
        for (int i = 0; i < M; i++) {
            p[i] = in.nextInt();
        }

        long ans = 0;
        int[] sum = new int[N];
        for (int i = 0; i < (1 << N); i++) {
            Arrays.fill(sum, 0);
            for (int j = 0; j < N; j++) {
                if (((i >> j) & 1) == 1) {
                    sum[j] = 1;
                }
            }

            boolean allOn = true;
            for (int j = 0; j < M; j++) {
                int isOn = 0;
                for (int k = 0; k < ks[j]; k++) {
                    isOn += sum[ss[j][k]];
                }
                isOn %= 2;
                if (isOn != p[j]) {
                    allOn = false;
                    break;
                }
            }

            if (allOn) {
                ans++;
            }
        }

        out.println(ans);
    }
}

class Shop implements Comparable<Shop> {
    String name;
    int p;
    int index;

    Shop(String name, int p, int index) {
        this.name = name;
        this.p = p;
        this.index = index;
    }

    @Override
    public int compareTo(Shop o) {
        if (name.compareTo(o.name) == 0) {
            if (this.p == o.p) {
                return 0;
            } else if (this.p < o.p) {
                return 1;
            } else {
                return -1;
            }
        }

        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name + " " + p;
    }
}

class InputReader implements AutoCloseable {
    private final Scanner sc = new Scanner(System.in);

    String next() {
        return this.sc.next();
    }

    int nextInt() {
        return Integer.parseInt(this.sc.next());
    }

    long nextLong() {
        return Long.parseLong(this.sc.next());
    }

    double nextDouble() {
        return Double.parseDouble(this.sc.next());
    }

    @Override
    public void close() {
        this.sc.close();
    }
}
