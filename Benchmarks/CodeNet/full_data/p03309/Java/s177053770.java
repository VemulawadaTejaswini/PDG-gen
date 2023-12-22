import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt() - (i + 1);
        }
        
        int b = 0;
        if (n % 2 == 0) {
            b = a[n / 2 - 1];
            b += a[n / 2];
            b /= 2;
        } else {
            b = a[n / 2];
        }

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.abs(a[i] - b);
        }

        System.out.println(ans);
    }
}