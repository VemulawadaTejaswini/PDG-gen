import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n + 1];
        int d = 0;
        long r = 1, ans = 1;
        
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            a[p - 1] = 1;
        }

        for (int i = 0; i <= n; i++) {
            if (a[i] == 1) {
                d++;
                if (d >= 2) {
                    ans = 0;
                    break;
                } else {
                    if (r == 1) {
                        r = 2;
                    }
                    ans = (ans * (r - 1)) % 1000000007;
                    r = 0;
                }
            } else if (i == (n - 1)) {
                r++;
                if (r == 1) {
                    r = 2;
                }
                ans = (ans * (r - 1)) % 1000000007;
            } else {
                d = 0;
                r++;
            }
        }

        System.out.println(ans);
        

		sc.close();
	}
}
