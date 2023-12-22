import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        long total = 0;
        int l = 0;
        int r = n - 1;
        for (int i = 0; i < n; i++) {
            long max = -1;
            int maxi = -1;
            boolean targetIsLeft = false;
            for (int j = 0; j < n; j++) {
                long absl = a[j] * Math.abs(l - j);
                if (absl > max) {
                    max = absl;
                    maxi = j;
                    targetIsLeft = true;
                }

                long absr = a[j] * Math.abs(r - j);
                if (absr > max) {
                    max = absr;
                    maxi = j;
                    targetIsLeft = false;
                }
            }

            total += max;
            a[maxi] = -1;
            if (targetIsLeft) {
                l++;
            } else {
                r--;
            }
        }

        System.out.println(total);
    }
}
