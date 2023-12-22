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

        int max1 = h[0];
        int min1 = h[0];
        for (int i = 0; i < k; i++) {
            if (h[i] > max1)
                max1 = h[i];
            else if (h[i] <= min1)
                min1 = h[i];
        }
        int diff1 = max1 - min1;

        int max2 = h[n-1];
        int min2 = h[n-1];
        for (int i = n-1; i >= n-k; i--) {
            if (h[i] >= max2)
                max2 = h[i];
            else if (h[i] <= min2)
                min2 = h[i];
        }
        int diff2 = max2 - min2;

        System.out.println(diff1 < diff2 ? diff1 : diff2);
    }
}
