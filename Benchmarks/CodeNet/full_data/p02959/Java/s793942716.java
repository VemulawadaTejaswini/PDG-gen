import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        long[] b = new long[n];
        for (int i = 0; i < n + 1; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextLong();
        }
        long ans = 0l;
        for (int i = 0; i < n; i++) {
            if(a[i] < b[i]) {
                ans += a[i];
                b[i] = b[i] - a[i];
                a[i] = 0;
            } else if(a[i] >= b[i]) {
                ans += b[i];
                b[i] = 0;
                a[i] = a[i] - b[i];
            }
            if(a[i + 1] < b[i]) {
                ans += a[i + 1];
                b[i] = b[i] - a[i + 1];
                a[i +1] = 0;
            } else if(a[i + 1] >= b[i]) {
                ans += b[i];
                b[i] = 0;
                a[i + 1] = a[i + 1] - b[i];
            }
        }
        System.out.println(ans);
    }
}