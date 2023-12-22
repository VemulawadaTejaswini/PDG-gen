import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        long[] b = new long[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        long[] c = new long[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        System.out.println(solve(a, b, c));
    }

    private static long solve(long[] a, long[] b, long[] c) {
        int n = a.length;
        long[] bmemo = new long[n];
        int cidx = 0;
        for (int j = 0; j < n; j++) {
            for (int k = cidx; k < n; k++) {
                if (b[j] >= c[k]) {
                    cidx++;
                } else {
                    bmemo[j] = n - k;
                    break;
                }
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            bmemo[i] += bmemo[i + 1];
        }
        long sum = 0;
        int bidx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = bidx; j < n; j++) {
                if (a[i] >= b[j]) {
                    bidx++;
                } else {
                    sum += bmemo[j];
                    break;
                }
            }
        }
        return sum;
    }
}
