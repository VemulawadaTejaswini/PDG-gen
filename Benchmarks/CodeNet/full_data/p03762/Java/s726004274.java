import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] xs = new int[n];
        int[] ys = new int[m];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            ys[i] = sc.nextInt();
        }
        long[] dxs = new long[n - 1];
        long[] dys = new long[m - 1];
        for (int i = 0; i < n - 1; i++) {
            dxs[i] = xs[i + 1] - xs[i];
        }
        for (int i = 0; i < m - 1; i++) {
            dys[i] = ys[i + 1] - ys[i];
        }

        long sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                long area = dxs[i] * dys[j];
                long count = count(n, m, i, j);
                long product = area * count;
                sum += product;
                sum = sum % (1000000007L);
            }
        }
        System.out.println(sum);
    }

    public static long count(long n, long m, long i, long j) {
        return (i + 1) * (n - (i + 1)) * (j + 1) * (m - (j + 1));
    }
}
