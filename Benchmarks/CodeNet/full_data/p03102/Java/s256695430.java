import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int index = 0; index < m; index++) {
                sum += sc.nextInt() * b[index];
            }
            if (sum + c > 0) {
                ans++;
            }
        }

        // 出力
        System.out.println(ans);
    }
}