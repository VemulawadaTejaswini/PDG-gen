import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int k, q;

        k = cin.nextInt();
        q = cin.nextInt();

        int[] ks = new int[k];

        for (int i = 0; i < k; i++) {
            ks[i] = cin.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int n = cin.nextInt();
            int x = cin.nextInt();
            int m = cin.nextInt();

            x %= m;

            int[] ms = new int[k];
            long zeros = 0;
            long sum = 0;
            for (int j = 0; j < k; j++) {
                ms[j] = ks[j] % m;
                if (ms[j] == 0) {
                    zeros++;
                }
                sum += ms[j];
            }

            long added = (n / k * sum);
            zeros = (n / k * zeros);
            for (int j = 0; j < (n - 1) % k; j++) {
                added += ms[j];
                if (ms[j] == 0) {
                    zeros++;
                }
            }
            added += x;
            added /= m;
            System.out.println(n - 1 - zeros - added);
        }
    }
}













