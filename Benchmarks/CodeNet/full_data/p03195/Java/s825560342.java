import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int ans = n;
        for (int i = 1; i < n; i++) {
            if (a[i] - a[i - 1] != 0) {
                ans ^= n - i;
            }
        }
        if (ans == 0) {
            System.out.println("second");
        } else {
            System.out.println("first");
        }
    }
}
