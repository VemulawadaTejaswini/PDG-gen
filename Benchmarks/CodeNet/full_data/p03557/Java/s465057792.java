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
        System.out.println(solve3(a, b, c));
    }

    private static long solve3(long[] a, long[] b, long[] c) {
        int n = a.length;
        long[] aa = new long[n];
        for (int i = n - 1, j = n - 1; i >= 0 && j >= 0; ) {
            if (a[i] < b[j]) {
                aa[j] = i + 1;
                j--;
            } else {
                i--;
            }
        }
        long[] cc = new long[n];
        for (int k = 0, j = 0; k < n && j < n; ) {
            if (c[k] > b[j]) {
                cc[j] = n - k;
                j++;
            } else {
                k++;
            }
        }
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += aa[i] * cc[i];
        }
        return sum;
    }
}
