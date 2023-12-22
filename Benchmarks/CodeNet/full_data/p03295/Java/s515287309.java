import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arg = new int[m][2];
        for (int i = 0; i < m; i++) {
            arg[i][0] = sc.nextInt();
            arg[i][1] = sc.nextInt();
        }

        int [][] ans = new int[m][2];
        int cnt = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < cnt ; j++) {
                int[] a = ans[j];
                int[] b = arg[i];
                if (a[0] <= b[0] && b[1] <= a[1]) {
                    ans[j] = b;
                } else if (b[0] <= a[1] && a[1] <= b[1]) {
                    ans[j][0] = b[0];
                    ans[j][1] = a[1];
                } else if (a[0] <= b[1] && b[1] <= a[1]) {
                    ans[j][0] = a[0];
                    ans[j][1] = b[1];
                } else if (b[0] <= a[0] && a[1] <= b[1]) {
                } else {
                    ans[cnt] = b;
                    cnt++;
                }
            }
            if (i == 0) {
                ans[0] = arg[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}