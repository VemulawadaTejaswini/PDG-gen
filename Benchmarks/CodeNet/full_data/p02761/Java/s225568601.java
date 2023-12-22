import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int l = n < m ? m : n;
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
        if (n == 1) {
            if (answer >= 0
                && answer < 10) {
                b = true;
            }
        } else if (n == 2) {
            if (answer >= 10
                && answer < 100) {
                b = true;
            }
        } else if (n == 3) {
            if (answer >= 100
                && answer < 1000) {
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
