import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = -1;
        }

        int s, c;
        for (int i = 0; i < m; i++) {
            s = sc.nextInt();
            c = sc.nextInt();
            if (num[s - 1] == -1) {
                num[s - 1] = c;
            } else if(c != num[s - 1]) {
                System.out.println(-1);
                return;
            }
        }

        for (int i = 0; i < n; i++) {
            if (num[i] == -1) {
                num[i] = 0;
            }
        }

        if (num[0] == 0) {
            System.out.println(-1);
            return;
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.pow(10, n - i - 1) * num[i];
        }

        System.out.println(ans);
    }
}