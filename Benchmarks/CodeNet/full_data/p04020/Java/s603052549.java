import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] == 0) continue;
            if(i == n - 1) {
                ans += a[i] / 2;
            } else {
                ans += (a[i] + a[i+1]) / 2;
                i++;
            }
        }
        System.out.println(ans);
    }
}