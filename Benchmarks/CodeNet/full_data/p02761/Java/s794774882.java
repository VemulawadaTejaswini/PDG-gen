import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int l = 0;
        if (n < m) {
            l = m;
        } else {
            l = n;
        }

        boolean b = false;
        int answer = 0;
        int[] ans = new int[l];
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            ans[s - 1] = c;
        }
        for (int i = l - 1, j = 1; i >= 0; i--, j*=10) {
            answer += ans[i] * j;
        }
        if (n > m)  {
            if (m == 0 || ans[0] > 0) {
                b = true;
            }
        } else if (m == n) {
            if (ans[0] > 0) {
                b = true;
            }
        } else if (m - n == 1) {
            if (ans[0] == 0
                && ans[1] > 0) {
                b = true;
            }
        } else if (m - n == 2) {
            if (ans[0] == 0
                && ans[1] == 0
                && ans[2] > 0) {
                b = true;
            }
        } else if (m - n == 3) {
            if (ans[0] == 0
                && ans[1] == 0
                && ans[2] == 0
                && ans[3] > 0) {
                b = true;
            }
        } else if (m - n == 4) {
            if (ans[0] == 0
                && ans[1] == 0
                && ans[2] == 0
                && ans[3] == 0
                && ans[4] > 0) {
                b = true;
            }
        }
        if (b) {
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}
