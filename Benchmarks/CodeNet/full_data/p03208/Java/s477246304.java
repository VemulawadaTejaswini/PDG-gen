import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        int diff = 10000000;
        for (int i = 0; i < n-(n%k); i += k) {
            int max = h[i];
            int min = h[i];
            for (int j = i; j < i+k; j ++) {
                if (j > n-1) break;
                max = Math.max(h[j], max);
                min = Math.min(h[j], min);
            }
            diff = Math.min(diff, max-min);
        }

        if (n % k != 0) {
            for (int i = n % k; i < n-(n%k); i += k) {
                int max = h[i];
                int min = h[i];
                for (int j = i; j < i + k; j++) {
                    if (j > n-1) break;
                    max = Math.max(h[j], max);
                    min = Math.min(h[j], min);
                }
                diff = Math.min(diff, max - min);
            }
        }

        System.out.println(diff);
    }
}
