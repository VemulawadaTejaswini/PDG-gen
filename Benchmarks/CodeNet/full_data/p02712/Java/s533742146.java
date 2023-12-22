import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        // String s = sc.next();
        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = Integer.parseInt(sc.next());
        // }
        long ans = 0;
        for (int i = 1; i <= n; i++)
            if (i % 3 != 0) {
                if (i % 5 != 0) {
                    ans += i;

                }
            }

        System.out.println(ans);
        sc.close();
    }
}