import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        long[] smaller = new long[n], bigger = new long[n];
        smaller[0] = bigger[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            int s = 0;
            while(0 < i - s && a[i] < a[i - s - 1]) s++;
            smaller[i] = s + 1L;
        }
        for (int i = 0; i < n - 1; i++) {
            int b = 0;
            while(i + b < n - 1 && a[i] < a[i + b + 1]) b++;
            bigger[i] = b + 1L;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += smaller[i] * bigger[i] * a[i];
        }
        System.out.println(ans);
    }
}