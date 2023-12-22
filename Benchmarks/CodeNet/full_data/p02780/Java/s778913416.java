import java.util.Scanner;

class Main {
    static int sumFrom(int[] a, int from, int to) {
        int ans = 0;
        for (int i = from; i <= to; i++) {
            ans += a[i];
        }
        return ans;
    }

    static int maxOf(int[] a) {
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int k = Integer.parseInt(stdIn.next());
        int[] p = new int[n];
        int[] sum = new int[n - k + 1];
        int t = 0;
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(stdIn.next());
            if (i >= k - 1) {
                sum[t++] = sumFrom(p, i - k + 1, i);
            }
        }

        double e = (double)(maxOf(sum) + k) / 2;
        System.out.println(e);
    }
}