import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        // String s = sc.next();
        // int[] a = new int[n];
        // for (int i = 0; i < n; i++) {
        // a[i] = Integer.parseInt(sc.next());
        // }
        long ans = 0;
        for (int x = 1; x <= k; x++) {
            for (int y = 1; y <= k; y++) {
                for (int z = 1; z <= k; z++) {
                    int tmp = gcd(x, y);
                    tmp = gcd(tmp, z);
                    ans += tmp;
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }

    static int gcd(int a, int b) {
        int temp;
        while ((temp = a % b) != 0) {
            a = b;
            b = temp;
        }
        return b;
    }
}